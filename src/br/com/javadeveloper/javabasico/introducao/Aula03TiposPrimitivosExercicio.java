package br.com.javadeveloper.javabasico.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Antonio Gutierrez da Conceião";
        String endereco = "Rua Clara Borges de Souza";
        double salario = 4000.00;
        String dataRecebimentoSalario = "05/09/2022";

        System.out.println("Eu " + nome +", morando no endereço " + endereco + ",\n" +
                "confirmo que recebi o salário de " + salario +", na data " + dataRecebimentoSalario);
    }
}
