package br.ada.logic.proposta;

public class Problema {

    public static void main(String[] args) {
        System.out.println("Desejamos criar uma função com a seguinte lógica:");
        System.out.println("Se o numero a (primeiro parâmetro), for maior que b (segundo parâmetro) imprimir a é maior que b");

        int a = 20;
        int b = 10;

        System.out.println("Proposta 1");
        Proposta1.resposta(a, b);

        System.out.println("Proposta 2");
        Proposta2.resposta(a, b);

        System.out.println("Proposta 3");
        Proposta3.resposta(a, b);

        System.out.println("Proposta 4");
        Proposta4.resposta(a, b);
    }
}
