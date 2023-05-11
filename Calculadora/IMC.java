import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double peso,altura,imc;
        System.out.println("#############################");
        System.out.println("__________Bem Vindo__________");
        System.out.println("#############################");
        System.out.println("_______Calculadora IMC_______");
        System.out.println("#############################");
        System.out.print("Qual o peso? ");
        peso=input.nextDouble();
        System.out.print("Qual a Altura? ");
        altura=input.nextDouble();
        imc=peso/(Math.pow(altura,2));
        String sexo = "Feminino";
        if (sexo.equals("Feminino")) {
            System.out.println("Bem Vinda, voce esta -> ");
        }else
            System.out.println("Bem Vindo, voce esta -> ");
        if (imc < 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (imc>=18.5 && imc<24.99) {
            System.out.println("Normal");
        } else if (imc>=25 && imc<30) {
            System.out.println("Acima do peso");
        }else if (imc>=30 && imc<40) {
            System.out.println("Obeso");
        }
    }

}
