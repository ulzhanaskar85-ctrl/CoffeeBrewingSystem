Coffee Brewing System

Overview

This project demonstrates the Strategy Design Pattern in Java.

The application simulates a coffee brewing system that supports different brewing methods. Each method is implemented as a separate strategy, allowing the user to switch between algorithms at runtime.

Design Pattern

Strategy Pattern

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.

Project Structure

* BrewingStrategy.java - Strategy interface that defines the common brewing method.
* FrenchPressStrategy.java - Concrete strategy for French press brewing.
* PourOverStrategy.java - Concrete strategy for pour-over brewing.
* AeroPressStrategy.java - Concrete strategy for AeroPress brewing.
* CoffeeMachine.java - Context that stores the selected strategy and delegates the brewing process to it.
* Main.java - Client that creates strategies, switches between them, and demonstrates the application.

Features

* Three interchangeable coffee brewing strategies.
* Runtime strategy switching.
* Separation of brewing algorithms from the context.
* Polymorphism through a shared interface.
* No conditional logic for selecting concrete strategies inside the context.

Technologies

* Java
* IntelliJ IDEA
* Strategy Design Pattern

How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure a compatible JDK is configured.
4. Open Main.java.
5. Run the main() method.

Student: Ulzhan Askar

Course: Software Design Patterns

Assignment #5 - Strategy Pattern
