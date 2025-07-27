# Q3. Unset i-th bit

---

## 🚀 Introduction
Given two integers **A** and **B**, determine if the B-th bit of A is set. If it is, unset that bit. If it's already unset, keep A unchanged. Bit manipulation is a fundamental concept for low-level programming and efficient algorithms.

_Use hints to guide your solution development. Complete solutions are penalty-free!_

---

## 📝 Problem Description
You are given two integers **A** and **B**.

- If the B-th bit in **A** is set (1), change it to unset (0).
- If the B-th bit in **A** is already unset (0), leave **A** unchanged.

Return the updated value of **A**.

**Note:**  
The bit position is 0-indexed, meaning the least significant bit (LSB) has index 0.

---

## ⚙️ Problem Constraints
- `1 <= A <= 10^9`
- `0 <= B <= 30`

---

## 📝 Input Format
- First argument: an integer **A**.
- Second argument: an integer **B**.

---

## 📤 Output Format
Return an integer representing the updated value of **A** after unsetting the B-th bit if it was set.

---

## 📚 Example

### Input 1:
```plaintext
A = 4, B = 1
```
### Output 1:
```plaintext
4
```
### Explaination 1:
```plaintext
Given N = 4 which is 100 in binary. The 1-st bit is already unset
```
### Input 2:
```plaintext
A = 5, B = 2
```
### Output 2:
```plaintext
1
```
### Explaination 2:
```plaintext
Given N = 5 which is 101 in binary. We unset the 2-nd bit
It becomes 001 which is 1 in Decimal.
```