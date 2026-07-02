# Data Structures Using Java Generics - Linked List

## Overview

This project is part of the **BridgeLabz Data Structure Problems using Java Generics** assignment.

The Linked List module is implemented completely from scratch without using Java's built-in `LinkedList` class. It demonstrates the core concepts of generic programming, node manipulation, and fundamental Linked List operations.

The project follows a feature-branch Git workflow where each use case is developed independently before being merged into the `dev` branch.

---

## Project Structure

```text
src
└── linkedlists
    ├── model
    │      Node.java
    │
    ├── service
    │      LinkedList.java
    │      OrderedLinkedList.java
    │
    └── test
           Main.java
```

---

## Technologies Used

- Java
- Java Generics
- Object-Oriented Programming (OOP)
- Git & GitHub

---

## Features Implemented

### UC1 - Create a Simple Linked List

- Created generic `Node<T>` class
- Connected nodes manually
- Built the first Linked List

---

### UC2 - Add Elements at the Beginning

Implemented:

- `addFirst()`
- `display()`

Features:

- Insert node at the beginning
- Update head reference

---

### UC3 - Add Elements at the End

Implemented:

- `addLast()`

Features:

- Traverse the Linked List
- Append node at the end

---

### UC4 - Insert Between Nodes

Implemented:

- `insertAfter()`

Features:

- Insert a node after a given node
- Update node references correctly

---

### UC5 - Delete First Node

Implemented:

- `pop()`

Features:

- Remove the head node
- Update head reference

---

### UC6 - Delete Last Node

Implemented:

- `popLast()`

Features:

- Traverse using previous and current references
- Remove the last node

---

### UC7 - Search a Node

Implemented:

- `search()`

Features:

- Linear search
- Generic object comparison using `equals()`

---

### UC8 - Insert After Search

Reused:

- `search()`
- `insertAfter()`

Features:

- Search for a node
- Insert a new node after the searched node
- Demonstrates code reusability

---

### UC9 - Delete Specific Node

Implemented:

- `delete()`
- `size()`

Features:

- Delete node by value
- Count the number of nodes

---

### UC10 - Ordered Linked List

Implemented:

- `OrderedLinkedList<T extends Comparable<T>>`

Features:

- Automatic sorted insertion
- Uses `compareTo()`
- Maintains ascending order

---

## Operations Summary

| Use Case | Operation | Time Complexity |
|----------|-----------|-----------------|
| UC1 | Create Nodes | O(1) |
| UC2 | Add First | O(1) |
| UC3 | Add Last | O(n) |
| UC4 | Insert After | O(1) |
| UC5 | Delete First | O(1) |
| UC6 | Delete Last | O(n) |
| UC7 | Search | O(n) |
| UC8 | Search + Insert | O(n) |
| UC9 | Delete by Value | O(n) |
| UC9 | Size | O(n) |
| UC10 | Ordered Insert | O(n) |

---

## Concepts Covered

- Java Generics
- Generic Classes
- Generic Methods
- Singly Linked List
- Node Manipulation
- Dynamic Memory Allocation
- Generic Constraints
- Comparable Interface
- `compareTo()`
- Linked List Traversal
- Object References
- Inheritance
- Code Reusability
- Time Complexity Analysis

---

## Learning Outcomes

After completing this module, you will be able to:

- Understand the internal working of a Singly Linked List.
- Build a Linked List from scratch without relying on Java Collections.
- Perform insertion, deletion, traversal, searching, and ordered insertion.
- Apply Java Generics to create reusable data structures.
- Analyze the time complexity of Linked List operations.
- Implement clean, modular, and reusable object-oriented code.

---

## Future Enhancements

The next phase of this project includes implementing additional data structures using the same custom Linked List implementation:

- Stack using Linked List
- Queue using Linked List
- Hash Table using Linked List

These modules will continue to follow the same feature-branch development workflow.

---

## Author

**Ariyan Pujari**

BridgeLabz – Data Structures Using Java Generics
