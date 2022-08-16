package br.com.javadeveloper.javabasico.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //byte, short, int, long, float, double, char
        int idade = (int)1000000000;
        long numeroGrande = 100000000L;
        long numeroGrandeConvertido = (long)100000000.23;
        double salarioDouble = 2000.0; // 8 bytes
        float salarioFloat = (float)2500.0F; // 4 bytes
        byte idadeByte = 10; // -128 até 127
        short idadeShort = 10; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        char caractere = 10; // 2 bytes
        String nome = "Goku"; //Objeto
        //var nome2 = "Testando versão 8";

        System.out.println("A idade é" + idade + "anos");
        System.out.println(verdadeiro);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println(numeroGrandeConvertido);
        System.out.println("Oi meu nome é: " + nome);
    }
}
