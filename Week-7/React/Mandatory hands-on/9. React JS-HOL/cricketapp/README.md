# 9. React JS-HOL

# OBJECTIVES:


## 1. List the features of ES6

- `let` and `const` for block-scoped variable declarations
- Arrow functions (`=>`) for shorter function syntax
- Classes and inheritance for object-oriented programming
- Template literals using backticks (`` ` ``)
- Destructuring for arrays and objects
- Default parameters, Rest (`...args`) and Spread (`...array`)
- Modules (`import` / `export`)
- Promises for handling async operations
- `Set` and `Map` data structures
- Enhanced object literals

---

## 2. Explain JavaScript `let`

- `let` is used to declare **block-scoped** variables.
- Unlike `var`, `let` is **not hoisted to the top** of the function or global scope.
- It's safer to use because it's limited to the block in which it is declared.

example: 
let score = 10;
if (true) {
  let score = 20;
  console.log(score); // 20
}
console.log(score); // 10

---

## 3.  Identify set() and map()

## var
- Function-scoped: accessible throughout the entire function, even outside blocks like if or for.
- Hoisted to the top of its scope and initialized as undefined.
- Can be redeclared within the same scope.
- May lead to unexpected bugs due to scope leakage and hoisting behavior.
- Not recommended for use in modern JavaScript.

## let
- Block-scoped: only accessible within the nearest enclosing {} block.
- Also hoisted, but not initialized — accessing before declaration causes ReferenceError.
- Cannot be redeclared in the same scope.
- Safer and more predictable for loop counters, conditions, and local variables.
- Preferred over var in ES6 and beyond.

---

## 4️. Explain JavaScript const

- Used to declare constant values.
- Cannot be reassigned after declaration.
- Block-scoped like let.

---

## 5. Explain ES6 class fundamentals

- ES6 introduces the class keyword for creating object blueprints.
- Supports constructors and methods.

---

## 6.  Explain ES6 class inheritance

- extends is used to inherit properties and methods from another class.
- super() is used to call the constructor of the parent class.