import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
  }

  increment = () => {
    this.setState({ count: this.state.count + 1 });
  };

  sayHello = () => {
    alert('Hello Member!!');
  };

  handleIncrease = () => {
    this.increment();
    this.sayHello();
  };

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  sayWelcome = () => {
    alert(`Welcome!`);
  };

  handleClick = (e) => {
    e.preventDefault(); 
    alert('I was clicked');
  };

  render() {
    return (
      <div style={{ padding: '30px', fontFamily: 'Arial' }}>
        <h1>React Event Examples</h1>

        <h2>Counter: {this.state.count}</h2>

        <button onClick={this.handleIncrease}>Increment</button>
        <br /><br />
        
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />

        <button onClick={this.sayWelcome}>Say Welcome</button>
        <br /><br />

        <button onClick={this.handleClick}>Click On Me</button>
        <br /><br />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
