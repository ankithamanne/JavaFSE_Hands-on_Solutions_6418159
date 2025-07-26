import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 1
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  }

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  }

  sayWelcome = () => {
    alert("Welcome");
  }

  clickHandler = () => {
    alert("I was clicked");
  }

  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <button onClick={this.increment}>Increment</button>
        <br />
        <button onClick={this.decrement}>Decrement</button>
        <br />
        <button onClick={this.sayWelcome}>Say welcome</button>
        <br />
        <button onClick={this.clickHandler}>Click on me</button>
        <br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
