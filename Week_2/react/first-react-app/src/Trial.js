import React from 'react';
import "./Trial.css";

function Trial(props) {
    return (
        <div className="trial" onClick={props.handleClick}>
            <img src="http://www.placecage.com/200/300" />
            <h2>How much experience do you have in coding</h2>
            <aside>{props.newValue} </aside>
        </div>
    );
};

export default Trial;