# Q5. Common Elements

**Problem Description**  
Given two integer arrays, **A** and **B**, of sizes **N** and **M**, respectively, your task is to find all the **common elements** in both arrays.

**NOTE:**
- Each element in the result should appear as many times as it appears in both arrays.
- The result can be in any order.

---

**Problem Constraints**
- `1 <= N, M <= 10^5`
- `1 <= A[i] <= 10^9`

---

**Input Format**
- First argument is an integer array **A** of size **N**.
- Second argument is an integer array **B** of size **M**.

---

**Output Format**
- Return an integer array denoting the common elements.

---
## 📚 Example

### Input 1:
```plaintext
 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
```
### output 1:
```plaintext
 [1, 2, 2]
```
### Explaination 1:
```plaintext
 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
```
### Input 2:
```plaintext
 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]
```
### output 2:
```plaintext
 [2, 10]
```
### Explaination 2:
```plaintext
 Elements (2, 10) appears in both the array.
```