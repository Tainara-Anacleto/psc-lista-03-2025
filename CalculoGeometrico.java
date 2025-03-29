import java.util.Scanner;

public class CalculoGeometrico {
    public static void main(String[] args){

        int operacao;
        double raio, PI, perimetro, area, volume;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da operação: ");
        System.out.println("1 - Calcular perímetro do círculo");
        System.out.println("2 - Calcular área do círculo");
        System.out.println("3 - Calcular volume da esfera");
        operacao = scanner.nextInt();

        System.out.println("Digite o raio: ");
        raio = scanner.nextDouble();

        PI = 3.141592;

        switch (operacao){
            case 1:
            perimetro = 2 * PI * raio;
            System.out.printf("O perímetro do Círculo é:%.2f%n", perimetro);

            break;

            case 2:
            area = PI * Math.pow(raio, 2);
            System.out.printf("A área do Círculo é:%.2f%n", area);

            break;

            case 3:
            volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
            System.out.printf("O volume da Esfera é:%.2f%n", volume);

            break;

            default:

            System.out.println("Código da operação inválido.");
        }
        scanner.close();
    }
}
