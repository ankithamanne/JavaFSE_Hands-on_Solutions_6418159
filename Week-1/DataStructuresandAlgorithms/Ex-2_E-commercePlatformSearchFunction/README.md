E-commerce Platform Search Function Documentation

1️. Understand Asymptotic Notation:

a) What is Big O Notation?

Big O notation describes how the time or space requirements of an algorithm grow relative to the input size `n` as `n` becomes large.  
It helps:
- Measure algorithm efficiency regardless of hardware or implementation details.
- Compare algorithms based on their scalability.
- Identify which part of an algorithm will dominate performance as input grows.

Example complexities:
- O(1): Constant time (independent of input size)
- O(log n): Logarithmic time (efficient even for large inputs)
- O(n): Linear time (performance decreases as input size increases)
- O(n^2): Quadratic time (performance degrades quickly with larger inputs)


b) Best, Average, and Worst-Case Scenarios in Search:

- Best Case: The condition where the target is found at the most favorable position (e.g., first position in linear search, middle in binary search).
- Average Case: The expected performance over many different inputs (e.g., target somewhere in the middle or random position).
- Worst Case: The least favorable situation (e.g., target at the end or not present).

| Search Type       | Best Case | Average Case | Worst Case |
|-------------------|-----------|--------------|------------|
| Linear Search     | O(1)      | O(n)         | O(n)       |
| Binary Search     | O(1)      | O(log n)     | O(log n)   |


4️. Analysis:

a) Comparation of time complexity of linear and binary search algorithms:

| Aspect                       | Linear Search                            | Binary Search                            |
|------------------------------|------------------------------------------|------------------------------------------|
| Best Case Time Complexity    | O(1) — target is first element           | O(1) — target is middle element          |
| Average Case Time Complexity | O(n) — target at random position         | O(log n) — halves search space repeatedly|
| Worst Case Time Complexity   | O(n) — target last or not present        | O(log n) — maximum divisions to locate   |
| Sorted Data Requirement      | Not required                             | Required — data must be sorted           |
| Performance on Large Data    | Slow — performance degrades as data grows| Fast — efficient even for large datasets |
| E-commerce Suitability       | Suitable for small/unsorted lists        | Suitable for large/sorted product lists  |

Linear Search:
- Checks each element one by one.
- Best case: The target is the first element (O(1)).
- Average/worst case: May need to check all elements (O(n)).

Binary Search:
- Works on sorted data.
- Repeatedly divides the search interval in half.
- Best case: The target is found at the midpoint in the first comparison (O(1)).
- Average/worst case: Requires about log₂(n) comparisons (O(log n)).


b) Which Algorithm is More Suitable and Why?

For an e-commerce platform:
*Binary search is more suitable* when the product data is sorted by productId, name, or other searchable attributes.  
- It provides much faster search performance (O(log n)) compared to linear search, especially for large datasets common in e-commerce systems.
However:
- If the data is unsorted or frequently changing (insertions, deletions), linear search may be temporarily used but is inefficient at scale.
- Maintaining sorted data structures (like arrays, trees, or indexes) ensures binary search or other efficient search methods can be applied for fast user experience.

Conclusion:
Binary search is preferred for large, sorted datasets typical of e-commerce platforms, offering better performance and scalability compared to linear search.

