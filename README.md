# UC4 - Insert a New Node Between Existing Nodes

## Objective

The objective of this use case is to implement the `insertAfter()` method, which inserts a new node immediately after a specified node in the Linked List.

---

## Problem Statement

Given an existing Linked List:

```text
56 -> 70
```

Insert `30` after `56` to obtain:

```text
56 -> 30 -> 70
```

The insertion should be performed by updating node references without losing the remaining part of the Linked List.

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

## Methods Implemented

### insertAfter(Node<T> previousNode, T data)

Creates a new node and inserts it immediately after the specified node.

```java
public void insertAfter(Node<T> previousNode, T data) {
    if (previousNode == null) {
        return;
    }

    Node<T> newNode = new Node<>(data);
    newNode.next = previousNode.next;
    previousNode.next = newNode;
}
```

### display()

Traverses the Linked List and prints all elements.

---

## Working

Before insertion

```text
56 -> 70 -> null
```

Create a new node

```text
30 -> null
```

Step 1

```text
newNode.next = previousNode.next;
```

```text
56 -> 70 -> null
      |
      v
     30 ----┘
```

Step 2

```text
previousNode.next = newNode;
```

Final Linked List

```text
56 -> 30 -> 70 -> null
```

---

## Output

```text
56 30 70
```

---

## Concepts Covered

- Insertion Between Nodes
- Reference Manipulation
- Generic Methods
- Node Linking
- Null Checking

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| insertAfter() | O(1) |
| display() | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How to insert a node between two existing nodes.
- Why the order of updating references is important.
- How incorrect reference updates can disconnect part of the Linked List.
- How to safely insert nodes without traversing the entire list.
