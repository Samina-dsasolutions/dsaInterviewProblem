# Q1. Simple Recursion

**Using hints except Complete Solution is Penalty free now**

```java
public class simpleRecursion {
    static int bar(int x, int y) {
        if (y == 0) return 0;
        return (x + _bar_(x, y - 1));
    }

    static int foo(int x, int y) {
        if (y == 0) return 1;
        return _bar_(x, _foo_(x, y - 1));
    }

    public static void main(String[] args) {
        System.out.println(_foo_(3, 5));
    }
}
```
# 📝 Problem Solutions
---
### Approach1 :
#### Source code : [simpleRecursion.java](../../src/recursionOne/simpleRecursion/simpleRecursion.java)


 <img src="../../images/recursionOne/simpleRecursion/step1.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step2.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step3.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step4.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step5.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step6.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step7.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step8.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step9.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step10.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step11.jpg" alt="My Image" width="400" />
 <img src="../../images/recursionOne/simpleRecursion/step12.jpg" alt="My Image" width="400" />