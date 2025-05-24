package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner beso = new Scanner(System.in);
        ArrayList<Transition> transitions = new ArrayList<>();
        ArrayList<String> States = new ArrayList<>();
        ArrayList<String> Alphabet = new ArrayList<>();
        DFA dfa = new DFA();

        System.out.println("Enter number of States:");
        int numOfStates = beso.nextInt();
        for (int i = 0; i < numOfStates; i++) {
            States.add("S" + i);
        }

        beso.nextLine();

        System.out.println("Enter Alphabet - separated by semicolons - : ");
        String[] input = beso.nextLine().trim().split(";");
        for (String symbol : input) {
            Alphabet.add(symbol.trim());
        }

        System.out.println("Choose initial state - Type S*number of state* - : ");
        dfa.setInitialState(beso.next());

        System.out.println("Choose accept state - Type S*number of state* - : ");
        dfa.setAcceptState(beso.next());

        beso.nextLine();

        System.out.println("Enter Transition function \n Format: currentState inputSymbol nextState \n Type 'done' to finish:");
        while (true) {
            String line = beso.nextLine().trim();
            if (line.equalsIgnoreCase("done")) break;
            String[] parts = line.split("\\s+");
            if (parts.length != 3) {
                System.out.println("Invalid format. Try again.");
                continue;
            }
            String currentState = parts[0];
            String inputSymbol = parts[1];
            String nextState = parts[2];
            transitions.add(new Transition(currentState, inputSymbol, nextState));
        }

        dfa.setTransitions(transitions);
        dfa.setStates(States);
        dfa.reset();

        System.out.println("Enter test string:");
        String testString = beso.nextLine().trim();
        dfa.simulate(testString);
    }
}
