package br.ada.logic;

public class Operators {

    public static void main(String[] args) {
        int a = 7;
        int b = 4;

        System.out.println("Soma");
//        System.out.println(soma(a, b));

        System.out.println("Subtração");
//        System.out.println(subtracao(a, b));

        System.out.println("Multiplicação");
//        System.out.println(multiplica(a, b));

        System.out.println("Divisão");
//        System.out.println(divisao(a, b));
        System.out.println("E se b for 0");

        System.out.println();

//        relational(a, b);
        ternary(a, b);
    }

    //soma dois números
    public static int soma(int a, int b) {
        return a + b;
    }

    //subtrai dois números
    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static int divisao(int a, int b) {
        return a / b;
    }

    //determina se o operador corresponde a alguma dessas comparações
    public static void relational(int a, int b) {
        System.out.println("Compara a > b" + (a > b));
        System.out.println("Compara a >= b" + (a >= b));
        System.out.println("Compara a < b" + (a < b));
        System.out.println("Compara a <= b" + (a <= b));
    }

    public static void igualdade(int a, int b) {
        System.out.println("Compara a == b" + (a <= b));
        System.out.println("Negação != b" + (a <= b));
    }

    // Incrementa após o uso
    public static void incremento(int a) {
        System.out.println("Incrementa a com a++" + (a++));
        System.out.println("Resultado a++" + (a));
    }

    // Incrementa após o uso
    public static void unary(int a) {
        System.out.println("Incrementa a com ++a" + (++a));
        System.out.println("Resultado ++a" + (a));
    }

    public static void assignment(int a, int b) {
        int aux = a;
        System.out.println("Assign a em aux => aux = a" + aux);

        aux += a;
        System.out.println("Assign a em aux => aux += a" + aux);

        aux -= a;
        System.out.println("Assign a em aux => aux -= a" + aux);
    }

    public static void postfix(int a, boolean b) {
        System.out.println("Resultado ++a" + (++a));

        System.out.println("Para b" + b);
        System.out.println("Resultado !b" + (!b));

        System.out.println("Para a" + a);
        System.out.println("Resultado ~a" + (~a));
    }

    // qual o resultado enquete

    /**
     * Operador ternario
     * @param a primeira variável
     * @param b segunda variável
     * se a (comparação) for verdadeira, então atribui o primeiro valor após o '?'
     * senão atribui o valor após ':'
     */
    public static void ternary(int a, int b) {
        System.out.println("Para a: " + a + " e b: " + b);

        String resultado = (a > b) ? "'a' maior que 'b'" : "'a' menor que 'b'";

        System.out.println(resultado);
        System.out.println("Resultado a > b ? a : b é -> " + (a > b ? a : b));
    }
}
