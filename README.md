# Ei.study_Assignment
# Exercise - 1
# Design Patterns Implementation in Java

This project demonstrates six different design patterns across three categories: Behavioral, Creational, and Structural. Each pattern is implemented using a unique use case to showcase its functionality in real-world scenarios.

## Design Patterns Covered

### 1. **Behavioral Patterns**
- **Command Pattern**: Demonstrates a remote control system for turning on devices like lights and fans.
- **State Pattern**: Implements a vending machine that behaves differently based on its state (Idle, Dispensing).

### 2. **Creational Patterns**
- **Prototype Pattern**: Demonstrates cloning of shapes (Rectangle, Circle) to create new ones.
- **Abstract Factory Pattern**: Implements a furniture store where different types of furniture (Victorian, Modern) can be created by their respective factories.

### 3. **Structural Patterns**
- **Facade Pattern**: A simplified interface to a complex home theater system consisting of a projector, speakers, and media player.
- **Composite Pattern**: Demonstrates a company structure where managers can delegate tasks to their subordinates (workers) and manage their tasks.

---

# Exercise - 2

# Astronaut Daily Schedule Organizer

This project is a console-based application designed to help astronauts organize their daily schedules. It allows users to add, remove, and view tasks. The application focuses on implementing key design patterns such as Singleton, Factory, and Observer.

## Features

- Add a new task with a description, start time, end time, and priority level.
- Remove an existing task.
- View all tasks sorted by start time.
- Ensure tasks do not overlap with existing tasks.
- Edit tasks, mark them as completed, and filter by priority (optional).
- Graceful exception handling and optimized performance.

## Design Patterns Used

1. **Singleton Pattern**: 
   - The `ScheduleManager` class ensures that only one instance of the schedule manager exists throughout the application.

2. **Factory Pattern**: 
   - The `TaskFactory` class is responsible for creating different types of task objects dynamically.

3. **Observer Pattern**: 
   - The `TaskObserver` class is used to notify users when there are conflicts with tasks (e.g., time overlap).

---

## How to Run the Project

### Prerequisites

- Java 8 or later must be installed.

### Steps to Run

1. **Clone the repository**
2. **Navigate to the project directory**
3. **Compile java files**
4. **Run the Application**

---

