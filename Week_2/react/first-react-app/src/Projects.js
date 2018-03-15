import React from "react";
import Project from "./Project";

const Projects = (props) => {
    console.log(props.projects);
    return (
        <div>
            {props.projects.map((elem, i) => {
                return (
                    <Project project={elem} />
                    )
                })
            }
        </div>
    )
};

export default Projects;