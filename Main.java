package com.codecool;

import java.util.*;

public class Main {

    private static void tinkerTailor(int n, int k) {
        List<Integer> players = new ArrayList<>(n);
        List<Integer> excluded = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            players.add(i);
        }
        int curIndex = 0;
        ListIterator it = players.listIterator();
        while (it.hasNext()) {
            curIndex = (curIndex + k + -1) % players.size();
            excluded.add(players.remove(curIndex));
        }
        System.out.println(excluded);
        System.out.println("The winner is: Player " + excluded.get(excluded.size() - 1));

    }

    public static void main(String[] args) {
        tinkerTailor(5, 3);
    }
}
