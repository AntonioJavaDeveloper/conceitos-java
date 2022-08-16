package br.com.javadeveloper.javabasico.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + _ * /
        int numero01 = 10;
        int numero02 = 20;
        int resultado;

        System.out.println(numero02 + numero01);
        System.out.println(numero02 - numero01);

        System.out.println("Valor: " + numero02 + numero01);//Ocorre uma concatenação entre as variáveis numéricas
        System.out.println(numero02 + numero01 + "Valor: ");//Ocorre uma soma entre as variáveis numéricas

        //Ocorre uma soma entre as variáveis numéricas antes da String
        // e uma concatenação entre as variáveis numéricas depois da String
        System.out.println(numero02 + numero01 + "Valor: " + numero02 + numero01);

        resultado = numero01 + numero02;
        System.out.println(resultado);

        resultado = numero01 - numero02;
        System.out.println(resultado);

        resultado = numero01 * numero02;
        System.out.println(resultado);

        resultado = numero01 / numero02; //Resultado de uma operação entre dois números inteiros sempre será um número inteiro
        System.out.println(resultado);
    }
}
