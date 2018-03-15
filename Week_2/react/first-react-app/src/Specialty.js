import React from 'react';
import "./Speciality.css";

const Specialty = (props) => {
    return (
        <div className="mainSpecial">
            {props.specialties.map((elem, i) => {
            return (
                <div className="speciality">
                    <h2> Specialty 1</h2>
                    <h3>{elem}</h3>
                    <img style={{width: "100px", height: "100px"}} src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/2000px-Unofficial_JavaScript_logo_2.svg.png" />
                    <div className="textBlock">
                        <p style={{fontSize:"12"}}> Description: JavaScript is a programming language commonly used in web development. It was originally developed by Netscape as a means to add dynamic and interactive elements to websites. While JavaScript is influenced by Java, the syntax is more similar to C and is based on ECMAScript, a scripting language developed by Sun Microsystems.</p>
                    </div>
                </div>
                )})
            }
        </div>
    )
}
            
export default Specialty;
