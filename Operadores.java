import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        
        double n1, n2, resultado = 0;
        char operador;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        n1 = scanner.nextDouble();

        System.out.println("Informe o segundo número: ");
        n2 = scanner.nextDouble();

        System.out.println("Informe o operador: ");
        operador = scanner.next().charAt(0);

        
        if (operador == '*'){
            resultado += n1 * n2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        }
        else if(operador == '/'){
            resultado += n1 / n2;
            System.out.println("O resultado da divisão é: " + resultado);
        }
        else if(operador == '+'){
            resultado += n1 + n2;
            System.out.println("O resultado da adição é: " + resultado);
        }
        else if(operador == '-'){
            resultado += n1 - n2;
            System.out.println("O resultado da subtração é: " + resultado);
        } 
        else{
        System.out.println("O símbolo da operação é inválido."); 
        }
        
        scanner.close();
    }
}