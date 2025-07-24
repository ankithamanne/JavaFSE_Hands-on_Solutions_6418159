import React from 'react';

class CountPeople extends React.Component {
  constructor() {
    super();
    this.state = {
      entrycount: 0,
      exitcount: 0
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entrycount: prevState.entrycount + 1
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitcount: prevState.exitcount + 1
    }));
  };

  render() {
    return (
      <div style={{ textAlign: 'center', marginTop: '100px' }}>
        <div style={{ display: 'flex', justifyContent: 'center', gap: '100px' }}>
          <div style={{ display: 'flex', alignItems: 'center' }}>
            <button 
              onClick={this.updateEntry} 
              style={{ backgroundColor: 'seagreen', border: '2px solid black', color: 'black', padding: '5px 10px', marginRight: '10px', fontWeight: 'bold' }}
            >
              Login
            </button>
            <span style={{ color: 'black' }}>
              {this.state.entrycount} People Entered!!!
            </span>
          </div>

          <div style={{ display: 'flex', alignItems: 'center' }}>
            <button 
              onClick={this.updateExit} 
              style={{ backgroundColor: 'seagreen', border: '2px solid black', color: 'black', padding: '5px 10px', marginRight: '10px', fontWeight: 'bold' }}
            >
              Exit
            </button>
            <span style={{ color: 'black' }}>
              {this.state.exitcount} People Left!!!
            </span>
          </div>
        </div>
      </div>
    );
  }
}

export default CountPeople;
