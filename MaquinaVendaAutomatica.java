import java.util.Scanner;

public class MaquinaVendaAutomatica{
    public static void main(String[] args) {
        
        double valorCompra, valorPago, troco = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: R$ ");
        valorCompra = scanner.nextDouble();

        System.out.println("Digite o valor pago: R$ ");
        valorPago = scanner.nextDouble();


        if (valorPago < valorCompra){
            System.out.println("Quantia paga é insuficiente para realizar a compra.");
        }
        else{
        troco += (valorPago - valorCompra);

        System.out.println("Valor pago: " + valorPago);
        System.out.println("Valor compra: " + valorCompra);
        System.out.println("Troco: " + troco);
    }
        while(troco >= 50){
           troco = troco - 50;
           n50 = n50 + 1;
        }
        while(troco >= 20){
            troco = troco - 20;
            n20 = n20 + 1;
        }
        while(troco >= 10){
            troco = troco - 10;
            n10 = n10 + 1;
        }
        while(troco >= 5){
            troco = troco - 5;
            n5 = n5 + 1;
        }
        while(troco >= 2){
            troco = troco - 2;
            n2 = n2 + 1;
        }
        while(troco >= 1){
            troco = troco - 1;
            n1 = n1 + 1;
    }
    
    System.out.println("Notas de R$ 50,00: " + n50);
    System.out.println("Notas de R$ 20,00: " + n20);
    System.out.println("Notas de R$ 10,00: " + n10);
    System.out.println("Notas de R$ 5,00: " + n5);
    System.out.println("Notas de R$ 2,00: " + n2);
    System.out.println("Notas de R$ 1,00: " + n1);

    scanner.close();
    }
}
