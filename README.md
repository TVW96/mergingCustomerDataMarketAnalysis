# AD325 Assignment: "*Merging Customer Data for Market Analysis*"
## Instructions: 
You're in a coding interview for a data analytics company specializing in market research. They present you with a problem related to merging customer data from different sources. Your task is to write a program that merges two sets of customer data, each sorted by customer ID, into a single, combined dataset also sorted by customer ID. This mimics a common scenario in data analytics where information from different databases needs to be consolidated for analysis.
## Solution:
I used a bubble sort because they are easy to implement, at best time complexity may be O(*n*) and at worst O(*n*^2). This is because the algorithm involves two nested loops, each that run *n* times. 
Space comelexity remains constant. They is a fixed amount of space given in our array to be sorted by summing the values of n + m. Time complexity = O(1).

- **Sorting Algorithm**: Bubble Sort
- **Time Complexity**:
  - Worst and Average Case: (O(n^2))
  - Best Case: (O(n)
- **Space Complexity**: (O(1)

For large arrays, quadratic time complexity makes Bubble Sort inefficient compared to more advanced sorting algorithms like Quick Sort, Merge Sort, or Heap Sort, which have better average and worst-case complexities.  







## Problem Statement

Given two integer arrays customerData1 and customerData2, sorted in non-decreasing order based on customer ID, and two integers m and n, representing the number of customer records in customerData1 and customerData2 respectively, merge customerData2 into customerData1 to form a single array sorted in non-decreasing order.
The final merged array should be stored inside customerData1. To accommodate this, customerData1 has a length of m + n, where the first m elements denote the customer IDs that should be merged, and the last n elements are set to 0 and should be ignored. customerData2 has a length of n.

#### Input Format:
Two sorted integer arrays `customerData1` and `customerData2`, and two integers `m` and `n`.

#### Output Format:
The merged array, sorted in non-decreasing order, stored in `customerData1`.

## Examples:
#### Example 1:
`Input: customerData1 = [101,104,107,0,0,0], m = 3, customerData2 = [102,105,108], n = 3`
`Output: [101,102,104,105,107,108]`
Explanation: The arrays being merged are [101,104,107] and [102,105,108].

#### Example 2:
`Input: customerData1 = [103], m = 1, customerData2 = [], n = 0`
`Output: [103]`
Explanation: Only one customer record in customerData1, none in customerData2.
## Requirements:
#### Code Submission Requirements:
Submit a link to your Github repository
Github repository should contain 
Diagrams or flowcharts that can help you and the interviewer stay on the same page
Clarifying questions
Test cases using unit test frameworks. You should have test cases for normal cases as well as edge cases (we expect you to have at least 3 test cases testing normal cases and at least 3 test cases testing edge cases)
Time and Space complexity of your solution. 

#### Video Submission Requirements
Record a video of yourself solving the problem as if you were in a coding interview
You need to show your screen and your face in the video
Talk through your coding and diagramming process. Explain why you are making certain decisions. This helps the interviewer follow your approach
You need to present test cases and demonstrate that you are passing those cases.(we expect you to have at least 3 test cases testing normal cases and at least 3 test cases testing edge cases)
You need to present Time and Space complexity of your solution. 
 If possible, refine your solution to improve its time and space efficiency. Explain the trade-offs and how the optimization improves the original solution.
Maintain clear communication throughout the interview. Reiterate this point, as it's crucial and worth repeating.
Submit a youtube link (public or unlisted)
