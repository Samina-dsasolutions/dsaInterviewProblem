# Q5. Longest Subarray Zero Sum

**Problem Description**  
Given an array **A** of **N** integers, find the length of the longest subarray in the array which sums to zero.  
If there is no subarray that sums to zero, return 0.

---

**Problem Constraints**
- `1 <= N <= 10^5`
- `-10^9 <= A[i] <= 10^9`

---

**Input Format**
- Single argument which is an integer array **A**.

---

**Output Format**
- Return an integer denoting the length of the longest subarray with sum zero.

---

## 📚 Example

### Input 1:
```plaintext
 A = [1, -2, 1, 2]
```
### output 1:
```plaintext
3
```
### Explaination 1:
```plaintext
 [1, -2, 1] is the largest subarray which sums up to 0.
```
### Input 2:
```plaintext
 A = [3, 2, -1]
```
### output 2:
```plaintext
0
```
### Explaination 2:
```plaintext
 No subarray sums up to 0.
```

# 📝 Problem Solutions
---
### Approach1 :
#### Source code : [longestSubarrayZeroSum.java](../../src/hashingTwo/longestSubarrayZeroSum/approachOne/longestSubarrayZeroSum.java)
#### Time Complexity : o(n)
#### Space Complexity : o(n)

 <img src="../../images/hashingTwo/longestSubarrayZeroSum/approachOne/step1.jpg" alt="My Image" width="400" />
 <img src="../../images/hashingTwo/longestSubarrayZeroSum/approachOne/step2.jpg" alt="My Image" width="400" />
 <img src="../../images/hashingTwo/longestSubarrayZeroSum/approachOne/step3.jpg" alt="My Image" width="400" />
 <img src="../../images/hashingTwo/longestSubarrayZeroSum/approachOne/step4.jpg" alt="My Image" width="400" />
 <img src="../../images/hashingTwo/longestSubarrayZeroSum/approachOne/step5.jpg" alt="My Image" width="400" />
 <img src="../../images/hashingTwo/longestSubarrayZeroSum/approachOne/step6.jpg" alt="My Image" width="400" />