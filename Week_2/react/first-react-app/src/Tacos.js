import React from "react";
import Taco from "./Taco";

const Tacos = (props) => {
    const flavors = ['Guacamole', 'Beef', 'Bean'];
    return (
        <div>
            {
                props.flavors.map((elem, i) => {
                    return <Taco key={i} flavor={elem} />
                })
            }
        </div>
    );
};

export default Tacos;