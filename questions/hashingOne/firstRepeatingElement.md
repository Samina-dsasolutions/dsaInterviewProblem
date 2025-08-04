# Q3. First Repeating element

**Problem Description**  
Given an integer array **A** of size **N**, find the first repeating element in it.

We need to find the element that occurs **more than once** and whose index of the first occurrence is the **smallest**.  
If there is no repeating element, return -1.

---

**Problem Constraints**
- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^9`

---

**Input Format**
- The first and only argument is an integer array **A** of size **N**.

---

**Output Format**
- Return an integer denoting the first repeating element, or -1 if none exists.

---

## 📚 Example

### Input 1:
```plaintext
 A = [10, 5, 3, 4, 3, 5, 6]
```
### output 1:
```plaintext
5
```
### Explaination 1:
```plaintext
 5 is the first element that repeats
```
### Input 2:
```plaintext
 A = [6, 10, 5, 4, 9, 120]
```
### output 2:
```plaintext
-1
```
### Explaination 2:
```plaintext
 There is no repeating element, output -1
```
