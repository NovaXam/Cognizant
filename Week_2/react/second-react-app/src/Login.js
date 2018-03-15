import React, {Component} from 'react';
import { Redirect } from 'react-router-dom';

class Login extends Component {
    constructor(props) {
        super(props);
        this.state = {
         user: {
             userName: '',
             password: ''
         },
         redirect: false
        }
        this.handleSumbit = this.handleSumbit.bind(this);
        this.handleChange = this.handleChange.bind(this);
    };

    handleSumbit(e) {
        e.preventDefault();
        this.props.mockLogIn(this.state.user);
        this.setState({redirect: true});
    };
    
    handleChange(e) {
        e.preventDefault();
        const userData = {...this.state.user};
        const userName = e.target.name;
        const userValue = e.target.value;
        userData[userName] = userValue

        this.setState({
            user: userData
        });
    };
    
    render() {
        if(this.state.redirect) {
            return (<Redirect to="/UserProfile" />)
        } else {
            return (
                <div>
                    <form onSubmit={this.handleSumbit}>
                        <div>
                            <label htmlFor="userName">User Name</label>
                            <input 
                                name="userName"
                                type="text"
                                value={this.state.user.userName}
                                onChange={this.handleChange} 
                            />
                        </div>
                        <div>
                            <label htmlFor="userName">User Password</label>
                            <input type="password" name="password" />
                        </div>
                        <button type='submit' value='Submit'>LogIn </button>
                    </form>
                </div>
            );
        }
    };
};

export default Login;