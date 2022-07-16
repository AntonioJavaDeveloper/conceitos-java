package br.com.javadeveloper.javabasico.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //byte, short, int, long, float, double, char
        int idade = 10;
        double salarioDouble = 2000; // 8 bytes
        float salarioFloat = 2500; // 4 bytes
        byte idadeByte = 10; // -128 até 127
        short idadeShort = 10; // 2 bytes
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit
        char caractere = 10; // 2 bytes

        System.out.println("A idade é" + idade + "anos");
        System.out.println(verdadeiro);
    }
}
