package org.example;

import java.util.ArrayList;

public class DFA {

    private String initialState;
    private String acceptState;
    private ArrayList<Transition> transitions;
    private ArrayList<String> states;
    private String currentState;

    public DFA() {
        transitions = new ArrayList<>();
        states = new ArrayList<>();
    }

    public void setInitialState(String initialState) {
        this.initialState = initialState;
        this.currentState = initialState;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public void setAcceptState(String acceptState) {
        this.acceptState = acceptState;
    }

    public void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }

    public void setStates(ArrayList<String> states) {
        this.states = states;
    }

    public ArrayList<String> getStates() {
        return states;
    }

    public String getAcceptState() {
        return acceptState;
    }

    public String getInitialState() {
        return initialState;
    }

    public void reset() {
        currentState = initialState;
    }
    public void simulate(String input) {
        currentState = initialState;

        for (int i = 0; i < input.length(); i++) {
            String inputSymbol = String.valueOf(input.charAt(i));
            boolean transitionFound = false;
            for (Transition t : transitions) {
                if (t.getCurrentState().equals(currentState) && t.getInputSymbol().equalsIgnoreCase(inputSymbol)) {
                    System.out.println("Matched: " + t);
                    currentState = t.getNextState();
                    transitionFound = true;
                    break;
                }
            }

            if (!transitionFound) {
                System.out.println("No valid transition from " + currentState + " on input '" + inputSymbol + "'");
                System.out.println("Input Rejected.");
                return;
            }

            if (currentState.equals(acceptState)) {
                System.out.println("Reached accept state: " + acceptState);
                System.out.println("Input Accepted.");
                return;
            }
        }
        if (currentState.equals(acceptState)) {
            System.out.println("Input Accepted.");
        } else {
            System.out.println("Ended on state: " + currentState);
            System.out.println("Input Rejected.");
        }
    }
}
