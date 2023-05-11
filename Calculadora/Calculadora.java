import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
            int valor1;
            int valor2;
        Scanner input=new Scanner(System.in);
        int escolha;
        System.out.println("1-Multiplicação");
        System.out.println("2-Divisão");
        System.out.println("3-Soma");
        System.out.println("4-Subtração");
        System.out.println("Qual operação? ");
        System.out.print("Digite um número negativo para sair");
        escolha=input.nextInt();
        do {
            System.out.print("Entre com o Valor 1 -> ");
            valor1=input.nextInt();
            System.out.print("Entre com o Valor 2 -> ");
            valor2=input.nextInt();
            if (escolha==1){
                int multiplicacao = valor1*valor2;
                System.out.println("Multiplicação: "+multiplicacao);
            } else if (escolha==2) {
                double divisao = valor1/(double) valor2;
                System.out.println("Divisão: "+divisao);
            } else if (escolha==3) {
                int subtracao = valor1-valor2;
                System.out.println("Subtração: "+subtracao);
            } else if (escolha==4) {
                int soma = valor1+valor2;
                System.out.println("Soma: "+soma);
            }
            System.out.println("1-Multiplicação");
            System.out.println("2-Divisão");
            System.out.println("3-Soma");
            System.out.println("4-Subtração");
            System.out.println("Qual operação? ");
            System.out.print("Digite um número negativo para sair");
            escolha=input.nextInt();
        }while (escolha>=0);
    }
}
//formatação de casas decimais
//String.format("%.2f",<variavel>)