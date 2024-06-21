package com.nexos;

import java.util.ArrayList;
import java.util.List;

public class CircleOfBettors {
    private List<Bettor> bettors;
    private boolean[] removed;

    public CircleOfBettors(int n) {
        bettors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            bettors.add(new Bettor(i));
        }
        removed = new boolean[n];
    }

    public boolean isRemoved(int index) {
        return removed[index];
    }

    public void setRemoved(int index) {
        removed[index] = true;
    }

    public int size() {
        return bettors.size();
    }

    public Bettor getBettor(int index) {
        return bettors.get(index);
    }
}