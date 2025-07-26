# Q3. Rain Water Trapped
---
## 🚀 Introduction
This problem involves calculating how much water can be trapped between bars of different heights after it rains. It demonstrates the use of pre-computed maximum heights from both ends to determine water stored at each position.
_Use hints to develop your solution. Complete solution approaches are penalty-free!_
---
## 📝 Problem Description
Imagine a histogram where the bars' heights are given by the array **A**. Each bar is of **uniform width**, which is **1 unit**. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the **total** amount of water that can be **trapped** in these valleys.

**Example:**

The array `A = [5, 4, 1, 4, 3, 2, 7]` is visualized as below. The total amount of rainwater trapped in `A` is **11**.

---

## ⚙️ Problem Constraints
- `1 <= |A| <= 10^5`
- `0 <= A[i] <= 10^5`

---

## 📝 Input Format
- A single array `A`.

---

## 📤 Output Format
- Return an **integer**, denoting the total amount of water that can be trapped.

---

## 📚 Example
### Input 1:
```plaintext
A = [0, 1, 0, 2]
```