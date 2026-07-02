# UC1 - Create a Simple Linked List

## Objective

The objective of this use case is to understand the basic structure of a Singly Linked List by creating nodes manually and connecting them without using any built-in Java collection classes.

---

## Problem Statement

Create a simple Linked List that stores the following values:

```text
56 -> 30 -> 70
```

Each node should be connected manually using the `next` reference.

---

## Project Structure

```text
src
└── linkedlists
    ├── model
    │      Node.java
    └── test
           Main.java
```

---

## Classes Used

### Node.java

A generic node containing:

* Data
* Reference to the next node

```java
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}
```

### Main.java

Creates three nodes manually and links them together.

---

## Implementation

```text
Node1 (56)
      |
      v
Node2 (30)
      |
      v
Node3 (70)
      |
     null
```

Connections:

```java
first.next = second;
second.next = third;
```

---

## Output

```text
56
30
70
```

---

## Concepts Covered

* Generic Classes
* Generic Type Parameter (`<T>`)
* Node Creation
* Reference Variables
* Object Linking
* Singly Linked List Basics

---

## Time Complexity

| Operation     | Complexity |
| ------------- | ---------- |
| Node Creation | O(1)       |
| Linking Nodes | O(1)       |

---

## Learning Outcome

After completing this use case, you will understand:

* Why a Linked List is made up of nodes.
* How nodes are connected using references.
* The difference between data and links.
* The foundation for implementing Linked List operations without using Java's built-in `LinkedList`.

---

## Git Commit

```bash
git add .
git commit -m "[Ariyan Pujari] UC1 - Simple Linked List"
```
