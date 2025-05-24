# DFA Compiler

A Java-based Deterministic Finite Automaton (DFA) compiler that allows users to define, build, and test DFAs through an interactive command-line interface.

## Overview

This project implements a DFA compiler that enables users to:
- Define states and alphabet
- Specify initial and accepting states
- Define transition functions
- Test input strings against the defined DFA

## Project Structure

The project consists of three main components:

### 1. DFA.java
The core class that implements the DFA functionality:
- Maintains the current state of the automaton
- Stores the initial and accepting states
- Manages transitions between states
- Provides simulation functionality for testing input strings

### 2. Transition.java
Represents a single transition in the DFA:
- Stores the current state, input symbol, and next state
- Provides a string representation of the transition
- Used to define the transition function of the DFA

### 3. Main.java
The user interface component that:
- Handles user input for DFA definition
- Manages the creation of states and transitions
- Provides an interactive way to test strings against the DFA

## How to Use

1. **Define States**:
   - Enter the number of states
   - States are automatically named S0, S1, S2, etc.

2. **Define Alphabet**:
   - Enter symbols separated by semicolons
   - Example: `a;b;c`

3. **Set Initial and Accepting States**:
   - Choose initial state (e.g., S0)
   - Choose accepting state (e.g., S2)

4. **Define Transitions**:
   - Enter transitions in the format: `currentState inputSymbol nextState`
   - Example: `S0 a S1`
   - Type 'done' when finished

5. **Test Strings**:
   - Enter a test string
   - The program will simulate the DFA and show:
     - Each transition taken
     - Whether the input is accepted or rejected
     - The final state reached

## Example Usage

```
Enter number of States:
3

Enter Alphabet - separated by semicolons - :
a;b

Choose initial state - Type S*number of state* - :
S0

Choose accept state - Type S*number of state* - :
S2

Enter Transition function
Format: currentState inputSymbol nextState
Type 'done' to finish:
S0 a S1
S1 b S2
S2 a S2
done

Enter test string:
aab
```

## Building and Running

The project uses Maven for dependency management. To build and run:

1. Ensure you have Java and Maven installed
2. Clone the repository
3. Run `mvn clean install`
4. Execute the program using `java -jar target/TOC-1.0-SNAPSHOT.jar`

## Requirements

- Java 8 or higher
- Maven 3.6 or higher

## License

This project is open source and available under the MIT License. 