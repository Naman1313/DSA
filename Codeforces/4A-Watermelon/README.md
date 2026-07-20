# A. Watermelon

> **Platform:** Codeforces  
> **Contest:** Codeforces Beta Round 4 (Div. 2 Only)  
> **Problem Index:** 4A  
> **Difficulty:** 800  
> **Tags:** Math, Brute Force

## Problem Statement

Pete and his friend Billy bought a watermelon weighing **w** kilograms. They want to divide it into **two positive parts** such that:

- Both parts have **even** weights.
- The two parts do **not** have to be equal.

Determine whether such a division is possible.

---

## Input

A single integer:

- `w` (1 ≤ w ≤ 100) — the weight of the watermelon.

---

## Output

Print:

- `YES` if the watermelon can be divided into two positive even-weight parts.
- `NO` otherwise.

---

## Examples

### Example 1

**Input**
```text
8
```

**Output**
```text
YES
```

### Example 2

**Input**
```text
2
```

**Output**
```text
NO
```

---

## Approach

- If the weight is **odd**, it cannot be divided into two even numbers.
- If the weight is **2**, the only possible split is `1 + 1`, which is not even.
- Therefore, the watermelon can be divided **only if**:
  - `w` is even, and
  - `w > 2`.

---

## Algorithm

1. Read the value of `w`.
2. Check if `w` is even and greater than `2`.
3. If true, print `YES`; otherwise, print `NO`.

---

## Complexity Analysis

- **Time Complexity:** `O(1)`
- **Space Complexity:** `O(1)`

---

## Java Solution

```java
// Solution.java
```

---

## Problem Link

https://codeforces.com/problemset/problem/4/A