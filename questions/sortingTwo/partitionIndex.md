# Q5. Partition Index

**Problem Description**  
Given an integer array **A** of length **N**, considering the last element as pivot **p**, rearrange the elements such that for all **i**:
- if **A[i] < p** then it should be present on the left side of the partition
- if **A[i] > p** then it should be present on the right side of the partition

Rearrange the given array as well as return the partition index.  
**Note:** All elements are distinct.

---

## 📚 Problem Constraints
- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^9`

---

## Input Format
The only input argument is the given vector **A**.

---

## Output Format
Return the partition index **as an integer** along with the rearranged array satisfying the conditions.

---

## Example Input
```plaintext
A = [6, 2, 0, 4, 5]
```
### Output 1:
```plaintext
 Valid
 A = [2, 0, 4, 5, 6] and partitionIndex = 3
```
### Example Explanation
```
The rearrangement is valid because every element in [0, 2] index range is less than the pivot element, 
and every element in [3, 4] index range is greater than the pivot element.
```

# 📝 Problem Solutions
---
### Approach1 :
#### Source code : [partitionIndex.java](../../src/sortingTwo/partitionIndex/approachOne/partitionIndex.java)
#### Time Complexity : o(n)
#### Space Complexity : o(1)

 <img src="../../images/sortingTwo/partitionIndex/approachOne/step1.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step2.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step3.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step4.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step5.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step6.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step7.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step8.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step9.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step10.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step11.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step12.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step13.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step14.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step15.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step16.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachOne/step17.jpg" alt="My Image" width="400" /> 


### Approach2 :
#### Source code : [partitionIndex.java](../../src/sortingTwo/partitionIndex/approachTwo/partitionIndex.java)
#### Time Complexity : o(n)
#### Space Complexity : o(1)

 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step1.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step2.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step3.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step4.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step5.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step6.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step7.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step8.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step9.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step10.jpg" alt="My Image" width="400" /> 
 <img src="../../images/sortingTwo/partitionIndex/approachTwo/step11.jpg" alt="My Image" width="400" /> 
