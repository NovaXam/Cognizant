import React from 'react';
import {Link, Redirect} from 'react-router-dom';

const UserProfile = (props) => {
   if (!props.userName) {
         return (<Redirect to="/Login" />)
    } else {
        return (
            <div>
                <h1>User Profile</h1>
                <div>Username: {props.userName}</div>
                <div>Member Since: {props.memberSince}</div>
                <div>Account balance {props.accountBalance} </div>
                <Link to="/">Back home </Link>
            </div>
        )
    }
};

export default UserProfile;