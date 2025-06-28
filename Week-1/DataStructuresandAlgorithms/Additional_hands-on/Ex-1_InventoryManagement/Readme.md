Exercise 1: Inventory Management System

1. Understand the Problem

Efficient inventory management is important for fast access and updates. Without good data structures, even simple tasks like finding a product or updating quantity can become slow.

- Why DSA?  
  Data structures like `HashMap` or `ArrayList` help in organizing data for fast retrieval and updates. Algorithms ensure those actions happen quickly even as data grows.

- Suitable Data Structures
  - `ArrayList`: Good for simple iteration.
  - `HashMap`: Best for quick access using keys like productId.

4. Analysis

- Add Product (HashMap): O(1)
- Update Product: O(1)
- Delete Product: O(1)

HashMap gives constant-time performance. To further optimize, we can index based on multiple keys (e.g., productName).

