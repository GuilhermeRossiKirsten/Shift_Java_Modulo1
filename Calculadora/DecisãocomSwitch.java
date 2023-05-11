import java.util.Scanner;

public class DecisãocomSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String user,password;
        int dia=4;
        System.out.println("Digite seu Login: ");
        user=input.nextLine();
        System.out.println("Digite sua Senha: ");
        password=input.nextLine();

        if (user.equals("admin")&&password.equals("123")) {
            System.out.println("Bem vindo");
            //switch é avaliada em uma unica variavel; sem operadores lógicos
            switch (dia) {
                case 1:
                    System.out.println("Hoje é Segunda feira");
                    break;
                case 2:
                    System.out.println("Hoje é Terca feira");break;
                case 3:
                    System.out.println("Hoje é Quarta feira");break;
                case 4:
                    System.out.println("Hoje é Quinta feira");break;
                case 5:
                    System.out.println("Hoje é Sexta feira");break;
                default:
                    System.out.println("Bom final de semana");
            }
            }else
            System.out.println("Login ou senha invalida");

    }
}
//switch