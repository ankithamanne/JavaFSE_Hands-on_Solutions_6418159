# 11. React JS-HOL

## Objectives:

## 1. Explain React Events
React events are JavaScript events wrapped in a cross-browser wrapper called **SyntheticEvent**. They behave similarly to native events but work identically across all browsers. React handles events like `onClick`, `onChange`, `onSubmit`, etc., using camelCase syntax and passes functions as event handlers.


## 2. Explain About Event Handlers
Event handlers are functions that are triggered when specific actions occur, such as a user clicking a button or typing into an input field. In React, event handlers are defined as functions and passed to components as props. 
For example:
<button onClick={handleClick}>Click Me</button>


## 3. Define Synthetic Event

A Synthetic Event is a React wrapper around the browser’s native event system. It provides consistent behavior and interface for handling events across different browsers. It pools events for performance reasons and mimics the native event APIs.


## 4. Identify React Event Naming Convention

React uses camelCase for event names instead of lowercase like HTML. For example:

HTML: <button onclick="doSomething()">Click</button>
React: <button onClick={doSomething}>Click</button>
