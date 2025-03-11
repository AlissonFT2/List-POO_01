import java.util.Scanner;

public class Q28 {
        public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        int limInf = 12;
        int limSup = 20;

        System.out.print("Digite o número: ");
        int num = Teclado.nextInt();
        
        while (num > limSup || num < limInf) {
            System.out.print("Número fora do limite!\nDigitar novamente: ");
            num = Teclado.nextInt();
        }

        Teclado.close();

        System.out.printf("\nO número %d está no intervalo %d - %d\n",num,limInf,limSup);

    }
}
