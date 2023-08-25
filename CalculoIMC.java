import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        float alt = sc.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = sc.nextFloat();
        sc.close();
      

        float imc = peso / (alt*alt);
        System.out.println(imc);

        if(imc <= 16.9){
            System.out.println("muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.4) {
            System.out.println("abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("peso normal");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 40){
            System.out.println("Obesidade grau II");
        } else{
            System.out.println("Obesidade grau III");
        }
    }

}
