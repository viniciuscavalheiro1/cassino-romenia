package com.nexos;

public class Casino {
    private CircleOfBettors circle;
    private int k;
    private int m;

    public Casino(int n, int k, int m) {
        this.circle = new CircleOfBettors(n);
        this.k = k;
        this.m = m;
    }

    public void processBettors() {
        int A = -1;
        int B = circle.size();
        int out = 0;
        int n = circle.size();

        boolean firstPair = true;

        while (out < n) {
            for (int i = 1; i <= k; ) {
                A++;
                if (A > n - 1) {
                    A = 0;
                }
                if (!circle.isRemoved(A)) {
                    i++;
                }
            }
            for (int i = 1; i <= m; ) {
                B--;
                if (B < 0) {
                    B = n - 1;
                }
                if (!circle.isRemoved(B)) {
                    i++;
                }
            }
            circle.setRemoved(A);
            out++;
            if (B != A) {
                circle.setRemoved(B);
                out++;
            }

            if (!firstPair) {
                System.out.print(", ");
            }
            firstPair = false;

            System.out.printf("%2d", circle.getBettor(A).getNumber());
            if (A != B) {
                System.out.printf(" %2d", circle.getBettor(B).getNumber());
            }
        }
        System.out.println();
    }
}