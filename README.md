# UC6 - Delete the Last Node from the Linked List

## Objective

The objective of this use case is to implement the `popLast()` method, which removes the last node from the Linked List.

---

## Problem Statement

Given the Linked List:

```text
56 -> 30 -> 70
```

Delete the last node (`70`) so that the updated Linked List becomes:

```text
56 -> 30
```

The second last node should become the new last node by pointing to `null`.

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

### popLast()

Traverses the Linked List using two pointers (`previous` and `current`) and removes the last node.

```java
public Node<T> popLast() {
    if (head == null) {
        return null;
    }

    if (head.next == null) {
        Node<T> temp = head;
        head = null;
        return temp;
    }

    Node<T> previous = null;
    Node<T> current = head;

    while (current.next != null) {
        previous = current;
        current = current.next;
    }

    previous.next = null;
    return current;
}
```

### display()

Traverses the Linked List and prints all elements.

---

## Working

Before deletion

```text
head
 |
56 -> 30 -> 70 -> null
```

Traversal

```text
previous      current
    |            |
    v            v
56 -> 30 -> 70 -> null
```

After deletion

```text
head
 |
56 -> 30 -> null
```

The second last node becomes the last node by pointing to `null`.

---

## Output

```text
56 30
```

---

## Concepts Covered

- Tail Deletion
- Linked List Traversal
- Previous and Current References
- Null Checking
- Generic Methods

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| popLast() | O(n) |
| display() | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How to delete the last node from a Singly Linked List.
- Why two references (`previous` and `current`) are required.
- How to handle the special case of a single-node Linked List.
- Why deleting the last node requires traversing the list.
