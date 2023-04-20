package edu.guilford;

import java.util.ArrayList;

public class Poker {
    
    //attributes for the card game poker
    private int numPlayers;
    private static int numCards;
    private int numRounds;
    private int numDecks;
    private int numJokers;
    private int numWilds;
    private int numHands;
    private int numCardsPerHand;
    private int numCardsPerRound;
    private int numCardsPerDeck;
    private int numCardsPerPlayer;
    private int numCardsPerHandPerPlayer;
    private int numCardsPerRoundPerPlayer;
    private int numCardsPerDeckPerPlayer;
    private int numCardsPerHandPerRound;
    private int numCardsPerHandPerDeck;
    private int numCardsPerRoundPerDeck;

    //constructor for the card game poker

    public Poker(int numPlayers, int numCards, int numRounds, int numDecks, int numJokers, int numWilds, int numHands, int numCardsPerHand, int numCardsPerRound, int numCardsPerDeck, int numCardsPerPlayer, int numCardsPerHandPerPlayer, int numCardsPerRoundPerPlayer, int numCardsPerDeckPerPlayer, int numCardsPerHandPerRound, int numCardsPerHandPerDeck, int numCardsPerRoundPerDeck) {
        this.numPlayers = numPlayers;
        Poker.numCards = numCards;
        this.numRounds = numRounds;
        this.numDecks = numDecks;
        this.numJokers = numJokers;
        this.numWilds = numWilds;
        this.numHands = numHands;
        this.numCardsPerHand = numCardsPerHand;
        this.numCardsPerRound = numCardsPerRound;
        this.numCardsPerDeck = numCardsPerDeck;
        this.numCardsPerPlayer = numCardsPerPlayer;
        this.numCardsPerHandPerPlayer = numCardsPerHandPerPlayer;
        this.numCardsPerRoundPerPlayer = numCardsPerRoundPerPlayer;
        this.numCardsPerDeckPerPlayer = numCardsPerDeckPerPlayer;
        this.numCardsPerHandPerRound = numCardsPerHandPerRound;
        this.numCardsPerHandPerDeck = numCardsPerHandPerDeck;
        this.numCardsPerRoundPerDeck = numCardsPerRoundPerDeck;
    }
    
    //getters and setters for the card game poker

    public int getNumPlayers() {
        return numPlayers;
    }

    //methods for the card game poker

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getNumCards() {
        return numCards;
    }
    
    public void setNumCards(int numCards) {
        Poker.numCards = numCards;
    }

    public int getNumRounds() {
        return numRounds;
    }

    public void setNumRounds(int numRounds) {
        this.numRounds = numRounds;
    }

    public int getNumDecks() {
        return numDecks;
    }

    public void setNumDecks(int numDecks) {
        this.numDecks = numDecks;
    }

    public int getNumJokers() {
        return numJokers;
    }

    public void setNumJokers(int numJokers) {
        this.numJokers = numJokers;
    }

    public int getNumWilds() {
        return numWilds;
    }

    public void setNumWilds(int numWilds) {
        this.numWilds = numWilds;
    }

    public int getNumHands() {
        return numHands;
    }

    public void setNumHands(int numHands) {
        this.numHands = numHands;
    }

    public int getNumCardsPerHand() {
        return numCardsPerHand;
    }

    public void setNumCardsPerHand(int numCardsPerHand) {
        this.numCardsPerHand = numCardsPerHand;
    }

    public int getNumCardsPerRound() {
        return numCardsPerRound;
    }

    public void setNumCardsPerRound(int numCardsPerRound) {
        this.numCardsPerRound = numCardsPerRound;
    }

    public int getNumCardsPerDeck() {
        return numCardsPerDeck;
    }

    public void setNumCardsPerDeck(int numCardsPerDeck) {
        this.numCardsPerDeck = numCardsPerDeck;
    }

    public int getNumCardsPerPlayer() {
        return numCardsPerPlayer;
    }

    public void setNumCardsPerPlayer(int numCardsPerPlayer) {
        this.numCardsPerPlayer = numCardsPerPlayer;
    }

    public int getNumCardsPerHandPerPlayer() {
        return numCardsPerHandPerPlayer;
    }

    public void setNumCardsPerHandPerPlayer(int numCardsPerHandPerPlayer) {
        this.numCardsPerHandPerPlayer = numCardsPerHandPerPlayer;
    }

    public int getNumCardsPerRoundPerPlayer() {
        return numCardsPerRoundPerPlayer;
    }

    public void setNumCardsPerRoundPerPlayer(int numCardsPerRoundPerPlayer) {
        this.numCardsPerRoundPerPlayer = numCardsPerRoundPerPlayer;
    }

    public int getNumCardsPerDeckPerPlayer() {
        return numCardsPerDeckPerPlayer;
    }

    public void setNumCardsPerDeckPerPlayer(int numCardsPerDeckPerPlayer) {
        this.numCardsPerDeckPerPlayer = numCardsPerDeckPerPlayer;
    }

    public int getNumCardsPerHandPerRound() {
        return numCardsPerHandPerRound;
    }

    public void setNumCardsPerHandPerRound(int numCardsPerHandPerRound) {
        this.numCardsPerHandPerRound = numCardsPerHandPerRound;
    }

    public int getNumCardsPerHandPerDeck() {
        return numCardsPerHandPerDeck;
    }

    public void setNumCardsPerHandPerDeck(int numCardsPerHandPerDeck) {
        this.numCardsPerHandPerDeck = numCardsPerHandPerDeck;
    }

    public int getNumCardsPerRoundPerDeck() {
        return numCardsPerRoundPerDeck;
    }

    public void setNumCardsPerRoundPerDeck(int numCardsPerRoundPerDeck) {
        this.numCardsPerRoundPerDeck = numCardsPerRoundPerDeck;
    }

    //tostring for the card game poker

    @Override
    public String toString() {
        return "Poker{" + "numPlayers=" + numPlayers + ", numCards=" + numCards + ", numRounds=" + numRounds + ", numDecks=" + numDecks + ", numJokers=" + numJokers + ", numWilds=" + numWilds + ", numHands=" + numHands + ", numCardsPerHand=" + numCardsPerHand + ", numCardsPerRound=" + numCardsPerRound + ", numCardsPerDeck=" + numCardsPerDeck + ", numCardsPerPlayer=" + numCardsPerPlayer + ", numCardsPerHandPerPlayer=" + numCardsPerHandPerPlayer + ", numCardsPerRoundPerPlayer=" + numCardsPerRoundPerPlayer + ", numCardsPerDeckPerPlayer=" + numCardsPerDeckPerPlayer + ", numCardsPerHandPerRound=" + numCardsPerHandPerRound + ", numCardsPerHandPerDeck=" + numCardsPerHandPerDeck + ", numCardsPerRoundPerDeck=" + numCardsPerRoundPerDeck + '}';
    }
    
    //main method for the card game poker

    public static void main(String[] args) {
        Poker poker = new Poker(2, 52, 1, 1, 0, 0, 1, 5, 5, 52, 10, 52, 10, 5, 5, 5, numCards);
        System.out.println(poker);
    }

    //arraylist for the card game poker

    public static ArrayList<Poker> poker = new ArrayList<Poker>();

    //print method for the card game poker

    public static void printPoker() {
        for (Poker poker : poker) {
            System.out.println(poker);
        }
    }

    //loop for the card game poker

    public static void loopPoker() {
        for (int i = 0; i < poker.size(); i++) {
            System.out.println(poker.get(i));
        }
    }

    //loop for if a player wins the card game poker

    public static void loopPokerWin() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 1) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player loses the card game poker


    public static void loopPokerLose() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 0) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player ties the card game poker

    public static void loopPokerTie() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 2) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a draw the card game poker

    public static void loopPokerDraw() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 3) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a flush the card game poker

    public static void loopPokerFlush() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 4) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a straight the card game poker

    public static void loopPokerStraight() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 5) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a straight flush the card game poker

    public static void loopPokerStraightFlush() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 6) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a royal flush the card game poker

    public static void loopPokerRoyalFlush() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 7) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a full house the card game poker

    public static void loopPokerFullHouse() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 8) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a four of a kind the card game poker

    public static void loopPokerFourOfAKind() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 9) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a three of a kind the card game poker

    public static void loopPokerThreeOfAKind() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 10) {
                System.out.println(poker.get(i));
            }
        }
    }

    //loop for if a player has a two pair the card game poker

    public static void loopPokerTwoPair() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 11) {
                System.out.println(poker.get(i));
            }
        }
    }

    //attributes for players who win the card game poker

    public static int win = 0;

    //attributes for players who lose the card game poker

    public static int lose = 0;

    //attributes for players who tie the card game poker

    public static int tie = 0;
    
    //system for the card game poker

    public static void systemPoker() {
        for (int i = 0; i < poker.size(); i++) {
            if (poker.get(i).getNumPlayers() == 1) {
                win++;
            } else if (poker.get(i).getNumPlayers() == 0) {
                lose++;
            } else if (poker.get(i).getNumPlayers() == 2) {
                tie++;
            }
        }
        System.out.println("Win: " + win);
        System.out.println("Lose: " + lose);
        System.out.println("Tie: " + tie);
    }

    

    
}
