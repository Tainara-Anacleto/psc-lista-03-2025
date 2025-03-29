import java.util.Random;
import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {
        
        int n1, n2, numeroSorteado, maiorNum = 0, menorNum = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe o primeiro número: ");
        n1 = scanner.nextInt();

        System.out.println("Informe o segundo número: ");
        n2 = scanner.nextInt();

        if (n1 > n2){
            maiorNum = n1;
            menorNum = n2;
        }
        else{
            maiorNum = n2;
            menorNum = n1;
        }
        System.out.println("O menor número é: " + menorNum);
        System.out.println("O maior número é: " + maiorNum);

        Random random  = new Random();

        numeroSorteado = random.nextInt(maiorNum - menorNum + 1) + menorNum;
       
        if (numeroSorteado % 2 == 0){
            System.out.println("O numero sorteado é: " + numeroSorteado +  "e ele é par.");
        }
        else{
            System.out.println("O número gerado é: " + numeroSorteado +  "e ele é ímpar.");
        }

        scanner.close();
    }
}
