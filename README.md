# UC7 - Search for a Node in the Linked List

## Objective

The objective of this use case is to implement the `search()` method, which traverses the Linked List to find whether a given element exists.

---

## Problem Statement

Given the Linked List:

```text
56 -> 30 -> 70
```

Search for the value `30`.

If the element exists, return the corresponding node; otherwise, return `null`.

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

### search(T key)

Traverses the Linked List and returns the node containing the specified value.

```java
public Node<T> search(T key) {
    Node<T> current = head;

    while (current != null) {
        if (current.data.equals(key)) {
            return current;
        }
        current = current.next;
    }

    return null;
}
```

---

## Working

Linked List

```text
56 -> 30 -> 70 -> null
```

Searching for `30`

```text
Step 1
56 != 30

Step 2
30 == 30 ✔

Return the node containing 30.
```

If the element is not found, the traversal reaches `null` and returns `null`.

---

## Output

```text
Element Found : 30
```

or

```text
Element Not Found
```

---

## Concepts Covered

- Linear Search
- Linked List Traversal
- Generic Methods
- Object Comparison using `equals()`
- Returning Nodes

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| search() | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How to search for an element in a Singly Linked List.
- Why Linked Lists require sequential traversal for searching.
- Why `equals()` is preferred over `==` for comparing generic objects.
- How to return a node when the searched element is found.
