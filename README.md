# PCCCS495 - Term II Project

## Project Title

Apartment Management System

## Problem Statement (max 150 words)

Managing apartment resident records manually can be time-consuming and error-prone. This project develops an Apartment Management System in Java to store, manage, search, and remove resident information efficiently. The system provides a simple interface for apartment-related operations and demonstrates object-oriented programming concepts in solving a real-world management problem.

## Target User

Apartment owners, building managers, caretakers, or anyone responsible for maintaining resident records in a small apartment or housing system.

## Core Features

- Add resident details
- View all resident records
- Search resident by ID
- Remove resident from the system
- Display resident information in a GUI table
- Handle invalid operations using custom exceptions

## OOP Concepts Used

- Class and Object: Used to model apartments and residents
- Encapsulation: Data members are kept private and accessed using methods
- Inheritance: Tenant and Owner inherit from the Resident base class
- Polymorphism: Different resident types are handled through a common parent class
- Abstraction: Core entities are represented through well-defined classes
- Exception Handling: Custom exception ResidentNotFoundException is used for invalid operations

## Architecture Description

The project follows a modular object-oriented design. Resident is the base class, while Tenant and Owner extend it to demonstrate inheritance. Apartment stores apartment-related information. Main contains the console-based logic, and ApartmentGui provides a graphical interface using Java Swing. Java Collections are used to store and manage resident records during program execution. Data persistence is not implemented in this phase and can be added later using file handling or serialization.

## How to Run Instructions

1. Open the project in VS Code
2. Make sure Java is installed and configured
3. Place all Java source files inside the src folder
4. Run Main.java for console version
5. Run ApartmentGui.java for GUI version