import React, { Component } from 'react';
import './App.css';

class Getuser extends Component {
  constructor() {
    super();
    this.state = {
      title: '',
      firstname: '',
      lastname: '',
      image: ''
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      const user = data.results[0];
      this.setState({
        title: user.name.title,
        firstname: user.name.first,
        lastname: user.name.last,
        image: user.picture.large
      });
    } catch (error) {
      console.error("Failed to fetch user:", error);
    }
  }

  render() {
    const { title, firstname, lastname, image } = this.state;
    return (
      <div className="user-container">
        <h1>{`${title} ${firstname} ${lastname}`}</h1>
        <img src={image} alt="User" />
      </div>
    );
  }
}

export default Getuser;
