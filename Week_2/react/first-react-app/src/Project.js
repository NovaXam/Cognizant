import React from "react";

const Project = (props) => {
    return (
        <div>
            <h2> {props.project.project}</h2>
            <h1> {props.project.title}</h1>
            <p>{props.project.description}</p>
            <p>deployedLink link here: <a href={props.project.deployedLink}></a></p>
            <p>githubLink link here: <a href={props.project.githubLink}></a></p>
            <p>complete: {props.project.complete} </p>
        </div>
    )
};

export default Project;