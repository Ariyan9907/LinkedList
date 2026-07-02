# UC10 - Create an Ordered Linked List

## Objective

The objective of this use case is to implement an `OrderedLinkedList`, where elements are automatically inserted in ascending order instead of the order they are added.

---

## Problem Statement

Create an Ordered Linked List that maintains its elements in sorted order.

For example, if the following elements are inserted:

```text
56
30
40
70
```

The resulting Linked List should automatically become:

```text
30 -> 40 -> 56 -> 70
```

No additional sorting operation should be required after insertion.

---

## Project Structure

```text
src
└── linkedlists
    ├── model
    │      Node.java
    ├── service
    │      LinkedList.java
    │      OrderedLinkedList.java
    └── test
           Main.java
```

---

## Class Implemented

### OrderedLinkedList<T extends Comparable<T>>

The class extends the existing `LinkedList` and overrides the insertion logic to maintain ascending order.

```java
public class OrderedLinkedList<T extends Comparable<T>>
        extends LinkedList<T> {

    public void add(T data) {
        // Insert element in sorted position
    }
}
```

The generic type is restricted using:

```java
T extends Comparable<T>
```

This allows objects to be compared using the `compareTo()` method.

---

## Working

Insert 56

```text
56
```

Insert 30

```text
30 -> 56
```

Insert 40

```text
30 -> 40 -> 56
```

Insert 70

```text
30 -> 40 -> 56 -> 70
```

Each element is placed in its correct position during insertion.

---

## Output

```text
30 40 56 70
```

---

## Concepts Covered

- Ordered Linked List
- Sorted Insertion
- Generic Constraints
- Comparable Interface
- compareTo() Method
- Inheritance
- Method Reuse

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Ordered Insertion | O(n) |
| Display | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How an Ordered Linked List maintains sorted data automatically.
- Why `Comparable<T>` is required for comparing generic objects.
- How `compareTo()` determines the correct insertion position.
- How inheritance can be used to extend the functionality of an existing Linked List implementation.
