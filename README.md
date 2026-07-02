# UC8 - Insert a New Node After a Specific Node

## Objective

The objective of this use case is to insert a new node after an existing node by first searching for the node and then using the `insertAfter()` method.

---

## Problem Statement

Given the Linked List:

```text
56 -> 30 -> 70
```

Search for the node containing `30` and insert `40` immediately after it.

The updated Linked List should be:

```text
56 -> 30 -> 40 -> 70
```

---

## Project Structure

```text
src
└── linkedlists
    ├── model
    │      Node.java
    ├── service
    │      LinkedList.java
    └── test
           Main.java
```

---

## Methods Used

### search(T key)

Searches the Linked List and returns the node containing the specified value.

```java
Node<Integer> node = linkedList.search(30);
```

### insertAfter(Node<T> previousNode, T data)

Inserts a new node immediately after the searched node.

```java
linkedList.insertAfter(node, 40);
```

> **Note:** No new method was created in this use case. It reuses the `search()` and `insertAfter()` methods implemented in previous use cases.

---

## Working

Initial Linked List

```text
56 -> 30 -> 70 -> null
```

Search for `30`

```text
56 -> [30] -> 70
        ↑
     Node Found
```

Insert `40` after `30`

```text
56 -> 30 -> 40 -> 70 -> null
```

---

## Output

```text
56 30 40 70
```

---

## Concepts Covered

- Reusing Existing Methods
- Searching a Linked List
- Insertion After a Node
- Code Reusability
- Modular Programming

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| search() | O(n) |
| insertAfter() | O(1) |
| Overall Operation | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How multiple methods can work together to solve a problem.
- The importance of code reusability instead of duplicating logic.
- How to search for a node before performing an insertion.
- How modular design improves readability and maintainability.
