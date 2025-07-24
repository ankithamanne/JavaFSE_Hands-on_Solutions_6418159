import './App.css';
import Home from './Components/Home';
import About from './Components/About';
import Contact from './Components/Contact';
import React, { Component } from 'react';

class App extends Component {
  render() {
    return (
      <div className="container">
        <Home />
        <About />
        <Contact />
      </div>
    );
  }
}

export default App;
