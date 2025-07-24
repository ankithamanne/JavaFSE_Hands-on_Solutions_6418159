# 4. React JS-HOL

## OBJECTIVES:

###  1. Explain the need and Benefits of Component life cycle

Component lifecycle methods help manage a component’s behavior during its creation, update, and removal from the DOM. They allow developers to:

- Fetch data (`componentDidMount`)
- Handle errors (`componentDidCatch`)
- Optimize rendering
- Clean up tasks (`componentWillUnmount`)
- Integrate with third-party libraries

These methods ensure clean, efficient, and controlled rendering of UI components.

---

###  2. Identify various life cycle hook methods

React class-based components offer the following lifecycle hooks:

- `constructor()` – initialize state and bind methods  
- `render()` – returns JSX to display  
- `componentDidMount()` – runs after component mounts; ideal for API calls  
- `componentDidUpdate()` – runs after re-rendering due to prop/state changes  
- `componentWillUnmount()` – cleanup before component is destroyed  
- `componentDidCatch(error, info)` – handles rendering errors  

---

###  3. List the sequence of steps in rendering a component

The rendering lifecycle follows this order:

1. `constructor()`
2. `render()`
3. `componentDidMount()`
4. (Updates: `componentDidUpdate()`)
5. (On removal: `componentWillUnmount()`)

Error handling (if any):
- `componentDidCatch()`
