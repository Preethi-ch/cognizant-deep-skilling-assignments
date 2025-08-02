import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = () => {
    const rupees = parseFloat(this.state.rupees);
    const conversionRate = 0.011;
    const euro = rupees * conversionRate;

    if (!isNaN(euro)) {
      alert(`Converted Amount: €${euro.toFixed(2)}`);
    } else {
      alert('Please enter a valid number.');
    }
  };

  render() {
    return (
      <div>
        {}
        <h2 style={{ color: 'green' }}>Currency Convertor</h2>

        <input
          type="number"
          value={this.state.rupees}
          onChange={this.handleChange}
          placeholder="Enter Rupees"
        />{' '}
        <button onClick={this.handleSubmit}>Convert</button>
      </div>
    );
  }
}

export default CurrencyConvertor;
