package org.example;

public class Transition {
    String currentState;
    String inputSymbol;
    String nextState;

    public Transition(String currentState, String inputSymbol, String nextState) {
        this.currentState = currentState;
        this.inputSymbol = inputSymbol;
        this.nextState = nextState;

    }

    public String getCurrentState() {
        return currentState;
    }

    public String getInputSymbol() {
        return inputSymbol;
    }

    public String getNextState() {
        return nextState;
    }



    @Override
    public String toString() {
        return currentState + " --" + inputSymbol + "--> " + nextState;
    }
}
