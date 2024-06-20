package com.nexos;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int m = scanner.nextInt();
            if (n == 0 && k == 0 && m == 0) break;
            Casino casino = new Casino(n, k, m);
            casino.processarApostadores();
        }
        scanner.close();
    }
}