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
### output 1:
```plaintext
1
```
### Explaination 1:
```plaintext
1 unit is trapped on top of the 3rd element.
```
### Input 2:
```plaintext
A = [1, 2]
```
### output 2:
```plaintext
0
```
### Explaination 2:
```plaintext
No water is trapped.
```

# 📝 Problem Solutions
---
### Approach1 :
#### Source code : [rainWaterTrapped.java](../src/rainWaterTrapped/rainWaterTrapped.java)
#### Time Complexity : o(row+col)
#### Space Complexity : o(1)

 <img src="../images/rainWaterTrapped/step1.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step2.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step3.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step4.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step5.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step6.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step7.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step8.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step9.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step10.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step11.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step12.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step13.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step14.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step15.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step16.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step17.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step18.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step19.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step20.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step21.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step22.jpg" alt="My Image" width="400" /> 
 <img src="../images/rainWaterTrapped/step23.jpg" alt="My Image" width="400" /> 




