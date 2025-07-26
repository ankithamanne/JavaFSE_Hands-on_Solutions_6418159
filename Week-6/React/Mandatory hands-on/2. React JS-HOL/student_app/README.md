# 2. React JS-HOL

## OBJECTIVES:


### 1. Explain React components.

React components are the building blocks of any React application. They are reusable, independent units that return JSX, which describes the structure and appearance of the UI. Components can be nested, reused, and managed efficiently to build complex interfaces in a modular way.

---

### 2. Identify the differences between components and JavaScript functions.

| Feature                        | React Component                            | JavaScript Function                    |
|-------------------------------|---------------------------------------------|----------------------------------------|
| Purpose                       | Used to build and render UI                 | Used for logic or computations         |
| Output                        | Returns JSX (HTML-like syntax)              | Returns values or performs actions     |
| Lifecycle Methods             | Available (in class components)             | Not available                          |
| State Management              | Can hold and manage state                   | No built-in state                      |
| React Integration             | Part of React's UI rendering mechanism      | Generic JavaScript use                 |

---

### 3. Identify the types of components.

There are two primary types of React components:

1. **Class Components**: Created using ES6 classes, extend `React.Component`, and use lifecycle methods like `componentDidMount()`. They can manage their own state.

2. **Function Components**: Defined as JavaScript functions that return JSX. Initially stateless, but with the introduction of React Hooks, they can now manage state and side effects just like class components.

---

### 4. Explain class component.

A class component is a more traditional way of creating React components using ES6 class syntax. It must include a `render()` method that returns JSX. Class components can manage their own state and respond to lifecycle events.

---

### 5. Explain function component.

A function component is a simpler way to create React components using a plain JavaScript function that returns JSX. They are ideal for presentational components, and with React Hooks, they can also handle state and side effects.

---

### 6. Define component constructor.
The constructor is a special method used in class components to initialize the state and bind methods. It is the first method called when the component is created, and it receives props as an argument.


---

### 7. Define render() function.
The render() function is required in every class component. It returns JSX, which determines what gets displayed on the screen. Whenever there is a change in state or props, the render() method is called again to update the UI.
