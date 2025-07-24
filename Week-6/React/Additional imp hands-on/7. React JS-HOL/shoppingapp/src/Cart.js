import React, { Component } from 'react';

class Cart extends Component {
  render() {
    return (
      <table style={{
        borderCollapse: "separate",
        padding: "8px",
        margin: "0 auto",
        textAlign: "center",
        border: "1px solid #ccc",
        fontFamily: "Arial",
        color: "#2e7d32"
      }}>
        <thead>
          <tr style={{ backgroundColor: "#e8f5e9" }}>
            <th style={{ border: "1px solid #ccc", padding: "10px" }}>Name</th>
            <th style={{ border: "1px solid #ccc", padding: "10px" }}>Price</th>
          </tr>
        </thead>
        <tbody>
          {this.props.item.map((item, index) => (
            <tr key={index}>
              <td style={{ border: "1px solid #ccc", padding: "10px" }}>{item.itemname}</td>
              <td style={{ border: "1px solid #ccc", padding: "10px" }}>{item.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    );
  }
}

export default Cart;
