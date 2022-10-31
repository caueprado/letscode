package br.ada.logic;

public class LogicOperators {

    public static void main(String[] args) {
        System.out.println("Teste com operador lógico 'E'");
        logicAnd();

        System.out.println("Teste com operador bitwise E");
        bitwiseAnd();

        System.out.println("Teste com operador lógico 'OU'");
        logicOr();

        System.out.println("Teste com operador bitwise 'OU'");
        bitwiseOr();
    }

    // Operador logico de condicional 'OU'
    public static void logicOr() {
        System.out.println("true || false = " +
                (primeiraCondicao(true) || segundaCondicao(false)) +
                " - sem teste da segunda condição.");

        System.out.println();
    }

    // Operador bitwise de condicional 'OU'
    // opera em comparações bit a bit
    public static void bitwiseOr() {
        System.out.println("true | false = " +
                (primeiraCondicao(true) | segundaCondicao(false)) +
                " - com teste da segunda condição.");
    }

    // Operador logico de condicional 'E'
    public static void logicAnd() {
        System.out.println("false && true = " +
                (primeiraCondicao(false) && segundaCondicao(true)) +
                " - sem teste da segunda condição.");

        System.out.println();
    }

    // Operador bitwise de condicional 'E'
    // opera em comparações bit a bit
    public static void bitwiseAnd() {
        System.out.println("false & true = " +
                (primeiraCondicao(false) & segundaCondicao(true)) +
                " - com teste da segunda condição.");

        System.out.println();
    }

    private static boolean primeiraCondicao(boolean retorno){
        System.out.println("Executou o teste da primeira condição");
        return retorno;
    }

    private static boolean segundaCondicao(boolean retorno){
        System.out.println("Executou o teste da segunda condição");
        return retorno;
    }

}
