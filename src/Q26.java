import java.util.Scanner;

public class Q26 {
        public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        System.out.print("Digite o Número: ");
        int num = Teclado.nextInt();
        Teclado.close();

        if (num <= 1) {
            System.out.println(num + " não é um número primo.");
            return;
        }

        boolean ePrimo = true;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                ePrimo = false;
                break;
            }
        }

        if (ePrimo) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

    }
}
