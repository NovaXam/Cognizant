import React, { Component } from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

import Home from './Home';
import UserProfile from './UserProfile';
import Login from './Login';
import Debit from './Debit';
import Credit from './Credit';
import './App.css';

import axios from 'axios';

class App extends Component {
  constructor(props){
    super(props)
    this.state = {
      accountBalance: 0,
      currentUser: {
        userName: 'bob_loblaw',
        memberSince: '08/23/99',
      },
      debitsTitle: [],
      creditTitle: []
    };
    this.mockLogIn = this.mockLogIn.bind(this);
    this.updateAccountState = this.updateAccountState.bind(this);
    this.hashGenerator = this.hashGenerator.bind(this);
    this.modifyDebItem = this.modifyDebItem.bind(this);
    this.updateCreditAccountState = this.updateCreditAccountState.bind(this);
  };

  componentWillMount() {
    var debit = 0, credit = 0; 
    axios("http://localhost:4000/debits")
      .then((res) => {
        res.data.map((elem) => {
          this.updateAccountState(elem);  
          return debit += elem.amount;
          });
          return debit;
      }).then((debit) => {
        axios("http://localhost:4000/credits")
          .then((res) => {
            res.data.map((elem) => {
              this.updateCreditAccountState(elem);
              return credit += elem.amount;
            });
            return (debit - credit);
          }).then((balance) => {
            console.log(balance);
            this.setState({
              accountBalance: balance.toFixed(2)
            }) 
          })
      });
  };

  updateAccountState(elem) {
    this.setState({
      debitsTitle: this.state.debitsTitle.concat(elem)
    });
  };

  updateCreditAccountState(elem) {
    this.setState({
      creditTitle: this.state.creditTitle.concat(elem)
    });
    console.log(this.state.creditTitle);
  };
  
  mockLogIn(logInInfo) {
    console.log(this);
    const newUser = {...this.state.currentUser};
    newUser.userName = logInInfo.userName;
    this.setState({currentUser: newUser});
  };

  modifyDebItem(newItem) {
    const id = this.hashGenerator(newItem.description);
    const date = new Date();
    const newObject = newItem;
    newObject.date = date.toString();
    newObject.id = id;
    console.log(newObject);
    this.setState({
      debitsTitle: this.state.debitsTitle.concat(newObject)
    });
  };

  hashGenerator(str) {
    let char = 0, hash = 0;
    for (let i = 0; i < str.length; i++) {
      char = str.charCodeAt(i);
      hash += ((hash << 5) - hash) + char;
    }
    return hash;
  }

  render() {
    const HomeComponent = () => (
        <Home accountBalance={this.state.accountBalance}
        />
      );
    const UserProfileComp = () => (
        <UserProfile 
          userName={this.state.currentUser.userName}
          memberSince={this.state.currentUser.memberSince}
          accountBalance={this.state.accountBalance}
        />
      );
    const LogInComponent = () => (
        <Login 
          user={this.state.currentUser} 
          mockLogIn={this.mockLogIn}
        />
      );

    const DebitComponent = () => (
        <Debit 
          debTitle={this.state.debitsTitle}
          accountBalance={this.state.accountBalance}
          modifyDeb={this.modifyDebItem}
        />
    );
    
    const CreditComponent = () => (
        <Credit 
          credTitle={this.state.creditTitle}
          accountBalance={this.state.accountBalance}
          modifyDeb={this.modifyDebItem}
        />
    );

    return (
      <Router>
        <Switch>
          <Route exact path="/" render={HomeComponent} />
          <Route exact path="/userProfile" render={UserProfileComp} />
          <Route exact path="/login" render={LogInComponent} />
          <Route exact path="/debit" render={DebitComponent} />
          <Route exact path='/credit' render={CreditComponent} />
        </Switch>
      </Router>
    );
  }
}

export default App;
