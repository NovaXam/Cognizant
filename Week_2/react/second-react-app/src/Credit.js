import React, {Component} from 'react';
import {Link} from 'react-router-dom';
import './Debit.css';

class Credit extends Component {
    constructor(props) {
        super(props);
        this.state = {
            showUp: "none",
            credItem: {
                description: "",
                amount: ""
            }
        };
        this.formOpenHandler = this.formOpenHandler.bind(this);
        this.creditSubmitHandler = this.creditSubmitHandler.bind(this);
        this.creditDescHandler = this.creditDescHandler.bind(this);
        this.creditAmountHandler = this.creditAmountHandler.bind(this);
    };

    formOpenHandler(e) {
        e.preventDefault();
        e.stopPropagation();
        this.setState({
            showUp: "block",
        })
    };

    creditDescHandler(e) {
        e.preventDefault();
        const newDescription = {...this.state.debItem};
        const descId = e.target.id;
        const descValue = e.target.value;
        newDescription[descId] = descValue;
        this.setState({
            debItem: newDescription
        });
    };

    creditAmountHandler(e) {
        e.preventDefault();
        const newAmount = {...this.state.debItem};
        const amountId = e.target.id;
        const debAmount = e.target.value;
        newAmount[amountId] = debAmount;
        this.setState({
            debItem: newAmount
        });
    };

    creditSubmitHandler(e) {
        e.preventDefault();
        this.props.modifyDeb(this.state.debItem);
        this.setState({
            showUp: "none"
        });  
    };

    render() {
        return (
        <div className="CreditClass">
            <h1>Credit</h1>
            <h3>Account balance: {this.props.accountBalance}</h3>
            <button type="submit" onClick={this.formOpenHandler}>Add new item </button>
            <div className="debitForm" style={{display: this.state.showUp}}>
                <form onSubmit={this.creditSubmitHandler}>
                    <div>
                        <lable htmlFor="description">description: </lable>
                        <input 
                            type="text" 
                            id="description"
                            placeholder="description"
                            value={this.state.credItem.description}
                            onChange={this.creditDescHandler}
                        />
                    </div>   
                    <div>
                        <lable htmlFor="amount">amount: </lable>
                        <input 
                            type="text" 
                            id="amount"
                            placeholder="amount"
                            value={this.state.credItem.amount}
                            onChange={this.creditAmountHandler}
                        />
                    </div>
                    <button type="submit">Sumbit </button>
                </form>
                
            </div> 
                <ul className="debits">
                    {this.props.credTitle.map((elem, i) => {
                        return (
                            <li className="debitItem" key={i}>
                                <p className="item"><b>id:</b> {elem.id}</p>
                                <p className="item"><b>description:</b> {elem.description}</p>
                                <p className="item"><b>amount:</b> {elem.amount} USD</p>
                                <p className="item"><b>date:</b> {elem.date}</p>
                            </li>
                        );
                    })
                }
            </ul>
            <Link to="/"><button type="submit">Back</button> </Link>
            </div>   
        )
    }
};

export default Credit;
