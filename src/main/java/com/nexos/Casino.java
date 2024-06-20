package com.nexos;

public class Casino {
    private CirculoApostadores circulo;
    private int k;
    private int m;

    public Casino(int n, int k, int m) {
        this.circulo = new CirculoApostadores(n);
        this.k = k;
        this.m = m;
    }

    public void processarApostadores() {
        int startHorario = 0;
        int startAntiHorario = circulo.size() - 1;

        while (!circulo.isEmpty()) {
            Apostador removidoHorario = circulo.removeApostadorSentidoHorario(k, startHorario);
            if (removidoHorario == null) break;
            startHorario = (startHorario + k - 1) % (circulo.size() + 1);

            Apostador removidoAntiHorario = circulo.removeApostadorSentidoAntiHorario(m, startAntiHorario);
            if (removidoAntiHorario == null) break;
            startAntiHorario = (startAntiHorario - m + circulo.size() + 1) % (circulo.size() + 1);

            if (removidoHorario.getNumero() != removidoAntiHorario.getNumero()) {
                System.out.print(removidoHorario.getNumero() + " " + removidoAntiHorario.getNumero());
            } else {
                System.out.print(removidoHorario.getNumero());
            }
            if (!circulo.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}