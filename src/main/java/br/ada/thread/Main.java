package br.ada.thread;

/**
 * Ao clicar run() rodamos a thread principal da aplicação.
 */
public class Main {

    public static void main(String[] args) {
        /**
         * A thread principal (em execução), ira executar a linha 12.
         */
        new Thread(() -> System.out.println("Oi Mundo")).start();
    }
}
