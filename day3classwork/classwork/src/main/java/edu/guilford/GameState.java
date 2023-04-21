package edu.guilford;

public class GameState {
    //use an enum for a game state with initializing, runnning, paused and over states
    public enum State {
        INITIALIZING, RUNNING, PAUSED, OVER
    }
    //enum is a collection of public static final values
    //enum the scenes, each of these has an associtated integer value, the ordinal
    //the first one is 0, the second is 1, etc.

    //declare a method of type state to hold the current game state
    private State currentState;

    //declare some other variables to hold the current score and the current level
    private int currentScore;
    private int currentLevel;

    //declare a constructor that initializes the game state to initializing
    public GameState() {
        currentState = State.INITIALIZING;
        //state.INITIALIZING is the INITIALIZING value of the enum state
        currentScore = 0;
        currentLevel = 1;

    }

    //constructor to set all the values to user defined values
    public GameState(State currentState, int currentScore, int currentLevel) {
        this.currentState = currentState;
        this.currentScore = currentScore;
        this.currentLevel = currentLevel;
    }
    //declare a method to get the current game state
    public State getCurrentState() {
        return currentState;
    }

    //declare a methof to set current game state
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
    //declare a method to get the current score
    public int getCurrentScore() {
        return currentScore;
    }
    //declare a method to set the current score
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
    //declare a method to get the current level
    public int getCurrentLevel() {
        return currentLevel;
    }
    //declare a method to set the current level
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    //provide methods to start, pause, resume and end the game
    public void startGame() {
        currentState = State.INITIALIZING;
        //current state is a variable of trype state and can have only one of the four values in the enum
        //currentState = 1 doesnt work because  current state is not an int; its a state variable
    }

    public void pauseGame() {
        currentState = State.PAUSED;
    }

    public void resumeGame() {
        currentState = State.RUNNING;
    }

    public void endGame() {
        currentState = State.OVER;
    }

    //write a getBanner method that uses a switch statement to generate a banner based on the value of a currentState
    public String getBanner() {
        String banner = "";
        switch (currentState) {
        case INITIALIZING:
            banner = "Initializing...";
            break;
        case RUNNING:
            banner = "Running...";
            break;
        case PAUSED:
            banner = "Paused...";
            break;
        case OVER:
            banner = "Game Over!";
            break;
        }
        return banner;
    }

    

}
