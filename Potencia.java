import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número correspondente a base: ");
        int base = sc.nextInt();
        System.out.println("Digite o número correspondente ao expoente: ");
        int expoente = sc.nextInt();
        int resultado = base;

        for (int i = 1; i < expoente; i++) {
            resultado = base * resultado;
        }

        System.out.println(resultado);

    }
}
