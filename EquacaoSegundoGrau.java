import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args){

        double a = 0, b = 0, c = 0, delta = 0, raiz = 0, raiz1 = 0, raiz2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o coeficiente a: ");
        a = scanner.nextDouble();

        System.out.println("Informe o coeficiente b: ");
        b = scanner.nextDouble();

        System.out.println("Informe o coeficiente c: ");
        c = scanner.nextDouble();

        delta = b * b - 4 * 4 * c;

        if (a == 0 && b == 0 && c != 0){
            System.out.println("Coeficiente informados incorretamente.");
        }
        else if (a == 0 && b != 0){
            System.out.println("Esta é uma equação de primeiro grau.");
            raiz = -c / b;
            System.out.println("Raiz real da equação: " + raiz);
        }
        else if (delta < 0){
            System.out.println("Esta equação não possui raízes reais.");
        }
        else if (delta == 0){
                System.out.println("Esta equação possui duas raízes");
                raiz = -b / (2 * a);
                System.out.println("Raiz real da equação: " + raiz);
            }
        else {
            System.out.println("Esta equação possui duas raízes reais diferente.");
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raíz real 1 da equação: " + raiz1);
            System.out.println("Raíz real 2 da equação: " + raiz2);
        } 
        scanner.close();   
        }
    }

