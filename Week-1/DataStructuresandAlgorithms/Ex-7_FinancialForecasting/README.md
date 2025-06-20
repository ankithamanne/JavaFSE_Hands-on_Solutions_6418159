Financial Forecasting Documentation

1️. Understand Recursive Algorithms

a) What is recursion?
Recursion is a programming technique where a function calls itself to solve smaller sub-problems until it reaches a base case.  

It is particularly useful when:
- The problem has a natural repetitive structure.
- The solution for a large problem depends on solutions to smaller instances of the same problem.

b) How recursion simplifies financial forecasting:
Recursion simplifies financial forecasting by breaking down the overall prediction into smaller, manageable steps where each year’s value depends directly on the value of the previous year.

In forecasting, the formula typically follows:
*FutureValue(year) = FutureValue(year - 1) × (1 + growthRate)*

This naturally fits a recursive pattern because:
- The value for year n depends on the value of year n-1.
- The problem is reduced at each step, moving closer to the base case  (usually year 0, the starting point).
- The recursion ends when the base case is reached, and values are built back up.


4️. Analysis

a) Time Complexity of the Recursive Algorithm:

Time Complexity:  

The time complexity is **O(n)**, where `n` is the number of years to forecast.  
This means the number of steps grows linearly with the number of years.

Space Complexity:

The space complexity is **O(n)**, where `n` is the number of years.  
This could lead to high memory usage if `n` is very large.


b) How to Optimize the Recursive Solution to Avoid Excessive Computation:

Although the recursive solution does not perform repeated calculations (each step depends only on the previous one), it uses stack space for each year, which is unnecessary for this type of problem.  

Optimization approach: 

- Replace recursion with an iterative solution.  
- This reduces space complexity from **O(n)** to **O(1)**, as no additional stack frames are used.  
- The logic remains the same, and performance is improved for large inputs by avoiding the risk of stack overflow.

Conclusion:

While recursion simplifies the design by matching the natural structure of year-by-year forecasting, iteration is a better choice for large-scale forecasting in terms of memory efficiency.

