package com.nexos;

import java.util.ArrayList;
import java.util.List;

public class CirculoApostadores {
    private List<Apostador> apostadores;

    public CirculoApostadores(int n) {
        apostadores = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            apostadores.add(new Apostador(i));
        }
    }

    public boolean isEmpty() {
        return apostadores.isEmpty();
    }

    public int size() {
        return apostadores.size();
    }

    public Apostador removeApostadorSentidoHorario(int k, int startIndex) {
        if (apostadores.isEmpty()) return null;
        int index = (startIndex + k - 1) % apostadores.size();
        return apostadores.remove(index);
    }

    public Apostador removeApostadorSentidoAntiHorario(int m, int startIndex) {
        if (apostadores.isEmpty()) return null;
        int index = (startIndex - m + apostadores.size()) % apostadores.size();
        return apostadores.remove(index);
    }
}
