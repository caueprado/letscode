package br.ada.thread;

public class ThreadSleep {

    private static boolean enviada = false;

    public static void main(String[] args) {

        //  Thread principal
        final Thread main = Thread.currentThread();

        new Thread(() -> {
            try {
                // sleep 5 segundos
                Thread.sleep(5000);
                // controle se a mensagem foi enviada
                enviada = true;
                main.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        while(!enviada) {
            System.out.println("Enviando mensagem...");
            try {
                Thread.sleep(5_000);

            } catch (Exception e) {
                System.out.println("Erro");
            }
        }

        System.out.println("Mensagem Enviada!");
    }

    private static void pause() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
            System.out.println(e.getMessage());
        }
    }
}

