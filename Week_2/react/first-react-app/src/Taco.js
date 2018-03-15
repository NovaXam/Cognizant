import React from "react";
import "./Taco.css";

const Taco = (props) => {
    let option;
    if (props.flavor === "Beef") {
        option = "love";
    } else {
        option = "like";
    };
    return (
        <div className="taco">
            <h1>{`I ${option} ${props.flavor} tacos!`}</h1>
        </div>
    ) 
};

export default Taco;