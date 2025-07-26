## 10. React JS-HOL

## OBJECTIVES:

## 1. Define JSX

JSX (JavaScript XML) is a syntax extension for JavaScript used in React to describe UI components. It allows you to write HTML-like code inside JavaScript, making the code more readable and expressive.

EX:
const element = <h1>Hello, JSX!</h1>;

---

## 2. Explain about ECMA Script

- ECMAScript (ES) is the standardized version of JavaScript defined by ECMA International. Each version introduces new features to the language:
- ES5: introduced strict mode, array methods like forEach, map, etc.
- ES6 (ES2015): introduced let, const, arrow functions, classes, modules, destructuring, and promises.
- Modern React heavily uses ES6+ features to simplify development.

---

## 3.  Explain React.createElement()

React.createElement() is a core function used by React to create virtual DOM elements.

Ex:
js
Copy code
const element = React.createElement(
  'h1',
  { className: 'greeting' },
  'Hello, World!'
);

---

## 4. Explain how to create React nodes with JSX

React nodes (elements) can be created using JSX 

syntax:
const title = <h1>Welcome to React</h1>;
const description = <p>This is a paragraph.</p>;

---

## 5. Define how to render JSX to the DOM

To render JSX to the browser DOM, use the ReactDOM.createRoot().render() method.

EX: 

import React from 'react';
import ReactDOM from 'react-dom/client';
const element = <h1>Hello, React!</h1>;
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(element);

---

## 6.  Explain how to use JavaScript expressions in JSX

You can embed any valid JavaScript expression inside JSX using curly braces {}.

Ex:

const user = "Ankitha";
const element = <h2>Welcome, {user}!</h2>;

---

## 7. Explain how to use inline CSS in JSX

Inline styles in JSX are written as JavaScript objects using camelCase property names.

Ex:

const headingStyle = {
  color: 'blue',
  fontSize: '24px'
};
const element = <h1 style={headingStyle}>Styled Heading</h1>;
