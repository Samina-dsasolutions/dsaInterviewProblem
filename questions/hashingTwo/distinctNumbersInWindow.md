# Q4. Distinct Numbers in Window

**Problem Description**  
You are given an array of **N** integers, **A1, A2, ..., AN**, and an integer **B**. Return the count of **distinct numbers** in all windows of size **B**.

---

**Note:**
- Formally, return an array of size **N - B + 1**, where the **i'th** element contains the number of distinct elements in the sequence **Ai, Ai+1, ..., Ai+B-1**.
- If **B > N**, return an empty array.

---

**Problem Constraints**
- `1 <= N <= 10^6`
- `1 <= A[i] <= 10^9`

---

**Input Format**
- First argument is an integer array **A**.
- Second argument is an integer **B**.

---

**Output Format**
- Return an integer array containing the count of distinct elements in each window of size **B**.

---


## 📚 Example

### Input 1:
```plaintext
 A = [1, 2, 1, 3, 4, 3]
 B = 3
```
### output 1:
```plaintext
 [2, 3, 3, 2]
```
### Explaination 1:
```plaintext
A=[1, 2, 1, 3, 4, 3] and B = 3
 All windows of size B are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]
 So, we return an array [2, 3, 3, 2].
```
### Input 2:
```plaintext
 A = [1, 1, 2, 2]
 B = 1
```
### output 2:
```plaintext
 [1, 1, 1, 1]
```
### Explaination 2:
```plaintext
 Window size is 1, so the output array is [1, 1, 1, 1].
```