# UC9 - Delete a Node by Searching for Its Value

## Objective

The objective of this use case is to implement the `delete()` method, which searches for a specific node in the Linked List and removes it while maintaining the remaining links.

---

## Problem Statement

Given the Linked List:

```text
56 -> 30 -> 40 -> 70
```

Delete the node containing `40`.

The updated Linked List should become:

```text
56 -> 30 -> 70
```

Also implement the `size()` method to determine the total number of nodes in the Linked List.

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

### delete(T key)

Searches for the specified node and removes it by updating the links between the previous and next nodes.

```java
public void delete(T key) {
    if (head == null) {
        return;
    }

    if (head.data.equals(key)) {
        head = head.next;
        return;
    }

    Node<T> previous = head;
    Node<T> current = head.next;

    while (current != null) {
        if (current.data.equals(key)) {
            previous.next = current.next;
            return;
        }

        previous = current;
        current = current.next;
    }
}
```

### size()

Counts and returns the total number of nodes in the Linked List.

```java
public int size() {
    int count = 0;
    Node<T> current = head;

    while (current != null) {
        count++;
        current = current.next;
    }

    return count;
}
```

---

## Working

Before deletion

```text
56 -> 30 -> 40 -> 70 -> null
```

Search for `40`

```text
56 -> 30 -> [40] -> 70
             ↑
         Node Found
```

Update the link

```text
previous.next = current.next;
```

After deletion

```text
56 -> 30 -> 70 -> null
```

---

## Output

```text
56 30 70

Size : 3
```

---

## Concepts Covered

- Delete by Value
- Node Traversal
- Previous and Current References
- Reference Manipulation
- Counting Nodes
- Generic Methods

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| delete() | O(n) |
| size() | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How to search and delete a specific node from a Linked List.
- How to reconnect adjacent nodes after deletion.
- How to count the number of nodes using traversal.
- Why both deletion and size calculation require linear traversal in a Singly Linked List.
