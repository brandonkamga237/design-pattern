# Singleton

> Singleton is a creational design pattern that ensures that a class has only one instance and provides a global access point to that instance.

## Problem

The Singleton pattern solves two main problems:

1. **Ensure that a class has only one instance.**

   This can be useful when we need to control access to a shared resource.

2. **Provide a global access point to that instance.**

   Instead of using global variables, the Singleton provides a controlled way to access the unique instance.

## Solution

A Singleton implementation generally follows two rules:

* Make the default constructor **private** to prevent other classes from creating instances using the `new` operator.
* Create a **static method** that returns the unique instance. The instance is created once and reused by subsequent calls.

## Implementation

See the Java implementation in the corresponding file.

## Pros and Cons

### Pros

* Ensures that a class has only one instance.
* Provides a global access point to that instance.
* The instance can be initialized only when it is needed for the first time.

### Cons

* Violates the **Single Responsibility Principle** because the class is responsible for both its main purpose and controlling its own instance creation.
* Can mask poor design by introducing global access and strong dependencies between components.
* Requires special treatment in a **multithreaded environment** to prevent multiple instances from being created.
* Can make **unit testing more difficult**, especially when the Singleton is accessed directly by many parts of the application.
