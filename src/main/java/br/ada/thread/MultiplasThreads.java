package br.ada.thread;

import java.time.LocalDateTime;

public class MultiplasThreads {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println("Inicio");

        Thread t = new Thread(escreve());
        Thread t1 = new Thread(enviaCarta());
        Thread t2 = new Thread(recebe());

        t.start();
        t1.start();
        t2.start();

        System.out.println("Fim");
        System.out.println(LocalDateTime.now());
    }

    public static Runnable escreve() {
        return () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("1 - imprimir registros : " + i);
            }
        };
    }

    public static Runnable enviaCarta() {
        return () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("2 - enviaCarta : " + i);
            }
        };
    }

    public static Runnable recebe() {
        return () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("3 - recebe : " + i);
            }
        };
    }
}


