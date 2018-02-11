package com.codecool.krk.tinker.tailor;

import java.util.ArrayList;

public class TinkerTailor {

    private int amountOfPlayers;
    private int syllabe;
    private int position;
    ArrayList<Integer> playersList = new ArrayList();

    public TinkerTailor(int amountOfPlayers, int syllabe) {

        this.amountOfPlayers = amountOfPlayers;
        this.syllabe = syllabe;
        this.position = syllabe;
        playersList = fillPlayersList();
    }

    public ArrayList fillPlayersList() {

        for(int i=1; i <= amountOfPlayers; i++) {
            playersList.add(i);
        }
        return playersList;
    }

    public int letsPlay() {

        System.out.println(playersList);

        if(playersList.size() == 1) {
            System.out.println("And the winner is: " + playersList.get(0));

        } else {
            playersList.remove(position-1);
            position+=syllabe -1;
            if(position>playersList.size()) {
                position = position%playersList.size();
            }
            letsPlay();
        }
        return playersList.get(0);
    }
}
