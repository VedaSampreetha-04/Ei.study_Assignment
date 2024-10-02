# Ei.study_Assignment
# Exercise - 1
# Design Patterns in Java

## Overview

This project demonstrates the implementation of six software design patterns in Java. The patterns are grouped into three categories: **Behavioral**, **Creational**, and **Structural**. Each pattern is illustrated with two different use cases to showcase the flexibility and power of these design techniques.

### Design Patterns Covered
1. **Behavioral Patterns**
   - Observer Pattern
   - Command Pattern
2. **Creational Patterns**
   - Singleton Pattern
   - Factory Pattern
3. **Structural Patterns**
   - Adapter Pattern
   - Facade Pattern

---


Each folder contains Java code demonstrating one of the patterns.

---

## Design Patterns Explanation

### 1. Behavioral Patterns
**a. Observer Pattern**  
In this example, we simulate a task notification system where multiple users (observers) get notified when a new task is added to the task manager (subject).

**b. Command Pattern**  
We implement a remote control system where each button on the remote represents a command (like turning a light on or off).

### 2. Creational Patterns
**a. Singleton Pattern**  
A Singleton pattern ensures that only one instance of the `ConfigurationManager` exists, allowing global access to a single configuration object.

**b. Factory Pattern**  
This example demonstrates a factory for creating different types of tasks (e.g., coding tasks and testing tasks) without specifying their exact class.

### 3. Structural Patterns
**a. Adapter Pattern**  
We implement an audio player that can play multiple file formats (mp3, mp4, and vlc) using an adapter to bridge incompatible interfaces.

**b. Facade Pattern**  
The Facade pattern is used to create a simple interface for controlling a home automation system (lights and air conditioning).

---

### Prerequisites

Ensure that you have Java 8 (or higher) installed on your machine. You can check this by running:

---

# Exercise - 2
# Mars Rover Simulation

This project is a simulation of a Mars Rover navigating a grid-based terrain. The Rover can execute commands to move forward, turn left, or turn right, and this behavior is modeled using object-oriented programming principles and design patterns.

## Features

- **Rover Navigation**: The Rover can move forward, turn left, or turn right on a grid.
- **Command Execution**: The Rover's movement is controlled through command patterns, encapsulating each action as a command.
- **Grid System**: The Rover operates within a grid-based terrain, ensuring that all movement adheres to the grid boundaries.
  
## Design Patterns Utilized

1. **Command Pattern**:
   - The Command pattern is used to encapsulate each movement action (move, turn left, turn right) as an object, allowing for flexibility in how the commands are executed.
   - Each command is represented by a specific class (`MoveCommand`, `TurnLeftCommand`, `TurnRightCommand`) that implements the `Command` interface.

2. **Encapsulation**:
   - Each object (Rover, Grid) encapsulates its own properties and methods, ensuring modularity and easier management of the simulation.

## Classes Overview

- **Main.java**: The entry point of the application where the Rover's initial state is set, and commands are issued.
- **Rover.java**: Represents the Rover with attributes such as position and direction. It processes commands and updates its state.
- **Grid.java**: Represents the grid-based terrain where the Rover operates, defining the boundaries within which the Rover can move.
- **Command.java**: An interface representing the command pattern. All movement commands implement this interface.
- **MoveCommand.java**: Implements the command to move the Rover one step forward in the direction it is currently facing.
- **TurnLeftCommand.java**: Implements the command to turn the Rover left.
- **TurnRightCommand.java**: Implements the command to turn the Rover right.

## Running the Project

### Prerequisites
- Ensure **Java 8** or a newer version is installed on your system.

### Steps to Run both Exercise 1 and Exercise 2

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/VedaSampreetha-04/Ei.study_Assignment.git
2. **Navigate to project directory**
   ```bash
   cd MarsRoverSimulation
4. **Compile the java files**
   ```bash
   javac *.java
6. **Run the Application**
   ```bash
   java Main



