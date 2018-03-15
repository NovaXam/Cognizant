import React, { Component } from 'react';
import Trial from './Trial';
import Specialty from "./Specialty";
import Tacos from "./Tacos";
import Projects from "./Projects";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      value: 1,
      types: ["JavaScript", "Java", "Node.js"],
      flavors: ['Guacamole', 'Beef', 'Bean'],
      projects: [
        {
          project: 1,
          title: "GuessAndGo",  
          description: "Child game",
          deployedLink: "http://palmist-camel-13533.bitballoon.com/",
          githubLink: "https://github.com/NovaXam/Project_1_GuessAndGo",
          complete: true
        },
        {
          project: 2,
          title: "Sightseing surfer",  
          description: "Trouristic guide",
          deployedLink: "https://sightseeings.herokuapp.com/sights",
          githubLink: "https://github.com/NovaXam/sightseeings",
          complete: true
        },
        {
          project: 3,
          title: "Music Monster",  
          description: "Music track manager",
          deployedLink: "https://musicmonster.herokuapp.com/",
          githubLink: "https://github.com/MistyMen/musicMonster",
          complete: true
        },
    ]
    };
  };

handleClick() {
  this.setState({
    value: this.state.value + 1
  })
};

  render() { 
    return (
      <div>
        <Trial newValue={this.state.value} />
        <Specialty specialties={this.state.types} />
        <Tacos flavors={this.state.flavors}/>
        <Projects projects={this.state.projects}/>
      </div>
    );
  }
}

export default App;