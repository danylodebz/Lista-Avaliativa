import java.util.Scanner;

public class Calculadora {
    public static int calcularDobro(int numero) {
        return numero * 2;
    }
    public static int calcularTriplo(int numero) {
        return numero * 3;
    }

    public static int calcularMetade(int numero){
        return numero / 2;
    }

    public static int calcularQuadrado(int numero){
        return numero * numero;
    }

    public static int calcularCubo(int numero){
        return numero * numero * numero;
    }

    public static int calcularRaiz(int numero){
        if(numero < 0){
            return -1;
        }
        else {
            return (int)Math.sqrt(numero);
        }
    }

    public static int calcularRaizCubica(int numero){
            return (int)Math.cbrt(numero);
    }

    public static int calculaModulo(int numero){
        if(numero < 0) {
            return numero * -1;
        }
        else{
            return numero;
        }
    }

    public static int calculaInverso(int numero){

        if(numero < 0){
            return numero * -1;
        }
        else{
            return numero * -1;
        }
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Digite um número: ");
     int number = sc.nextInt();

     System.out.println("Digite o número correspondente ao tipo de cálculo: : 1 – Dobro, 2 – Triplo, 3 – Metade," +
             " 4 – Quadrado, 5 – Cubo, 6 – Raiz Quadrada, 7 – Raiz Cúbica, 8 – Módulo, 9 – " +
                "Inverso e 0 – Sair do Programa");
     int choose = sc.nextInt();
     sc.close();

     switch (choose){
         case 1:
             int resultadoDobro = calcularDobro(number);
             System.out.println(resultadoDobro);
             break;

        case 2:
            int resultadoTriplo = calcularTriplo(number);
            System.out.println(resultadoTriplo);
            break;

         case 3:
             int resultadoMetade = calcularMetade(number);
             System.out.println(resultadoMetade);
             break;

         case 4:
             int resultadoQuadrado = calcularQuadrado(number);
             System.out.println(resultadoQuadrado);
             break;

         case 5:
             int resultadoCubo = calcularCubo(number);
             System.out.println(resultadoCubo);
             break;

         case 6:
             int resultadoRaiz = calcularRaiz(number);
             System.out.println( resultadoRaiz >= 0?resultadoRaiz:"Não tem raiz");
             break;

         case 7:
             int resultadoRaizCubica = calcularRaizCubica(number);
             System.out.println(resultadoRaizCubica);
             break;

         case 8:
             int  resultadoModulo = calculaModulo(number);
             System.out.println(resultadoModulo);
             break;

         case 9:
             int resultadoInverso = calculaInverso(number);
             System.out.println(resultadoInverso);
             break;

         case 0:
             System.out.println("Você saiur!!");
    }

    }

}
