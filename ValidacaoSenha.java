import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha");
        String senha = sc.nextLine();

        while (nome.equals(senha)){
                System.out.println("Nome e senha iguais não é permitido. " + "Digite seu nome");
                nome = sc.nextLine();
                System.out.println("Digite sua senha");
                senha = sc.nextLine();
            }


        while (senha.length() < 8){
            System.out.println("O numero minimo de caracteres é 8, por favor digite senha novamente: ");
            senha = sc.nextLine();
        }

        boolean temNumero = false;
        boolean temMaiusculo = false;
        boolean temMinuscula = false;

        do{
            for (int i = 0; i < senha.length(); i++) {
                char caractere = senha.charAt(i);
                if(Character.isUpperCase(caractere)){
                    temMaiusculo = true;
                }
                if (Character.isDigit(caractere)){
                    temNumero = true;
                }
                if (Character.isLowerCase(caractere)){
                    temMinuscula = true;
                }
            }

            if (temMaiusculo && temMinuscula && temNumero){
                System.out.println("Cadastrado com sucesso");
            }else{

                System.out.println("Não foi possivel cadastrar. digite uma senha com pelo menos" +
                        "um numero, uma letra maiuscula e outra minuscula: ");
                senha = sc.nextLine();

            }
        }while(!temMaiusculo|| !temMinuscula || !temNumero);


        }


    }

