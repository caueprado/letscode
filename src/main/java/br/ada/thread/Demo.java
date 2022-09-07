package br.ada.thread;

public class Demo {

    private static final Boolean semaforo = false;

    private static final Boolean semaforo2 = false;

    public static void main(String[] args) {
        new ThreadExemplo().start();
        new ThreadExemplo2().start();
    }

    private static class ThreadExemplo extends Thread {
        public void run() {
            // adquire execução Thread 1
            synchronized (semaforo) {
                // criação da thread 1
                System.out.println("Thread 1: get processo");

//                try {
                System.out.println("Thread 1: processando ....");
//                    // tempo de sleep
//                    Thread.sleep(10_000);
//                } catch (InterruptedException e) {
//                    System.out.println("Ocorreu exceção");
//                }

                // adquire execução Thread 2
                synchronized (semaforo2) {
                    System.out.println("Thread 1: Aguardando a thread 2...");
                    exec();
                }
            }
        }
    }

    private static class ThreadExemplo2 extends Thread {
        public void run() {
            // adquire execução Thread 2
            synchronized (semaforo2) {
                System.out.println("Thread 2: get processo");
//                    try {
//                        // tempo de sleep
                System.out.println("Thread 2: processando ....");
////                        Thread.sleep(10_000);
//                    } catch (InterruptedException e) {
//                        System.out.println("Ocorreu exceção 2");
//                    }

                // adquire execução Thread 1
                synchronized (semaforo) {
                    System.out.println("Thread 2: aguardando 1");
                    exec();
                }

            }
        }
    }

    public static void exec() {
        System.out.println("Exec");
    }
}

