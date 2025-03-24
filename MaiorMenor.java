import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args){

        int num1, num2, num3, maiorNum = 0, menorNum = 0, media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Escreva o segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("Escreva o terceiro número: ");
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
           maiorNum = num1; 

        }
        else if (num2 < num1 && num2 < num3){
            maiorNum = num2;
        
        }
        else {
            maiorNum = num3;
        }

        if (num1 < num2 && num1 < num3){
            menorNum = num1; 
 
         }
         else if (num2 < num1 && num2 < num3){
             menorNum = num2;
         
         }
         else {
             menorNum = num3;
         }
        System.out.println("Maior número é: " + maiorNum);
        System.out.println("Menor número é: " + menorNum);
    
    media = (num1 + num2 + num3) / 3;
    System.out.println("A média é: " + media);

    scanner.close();
    }
    
}