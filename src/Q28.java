import java.util.Scanner;

public class Q28 {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args){
        int limInf = 12;
        int limSup = 20;

        System.out.print("Digite o número: ");
        int num = Teclado.nextInt();
        
        num = dentroIntervalo(num, limInf, limSup);

        Teclado.close();

        System.out.printf("\nO número %d está no intervalo %d - %d\n",num,limInf,limSup);
    }

    public static int dentroIntervalo(int num, int limInf, int limSup){
        while (num > limSup || num < limInf) {
            System.out.print("Número fora do limite!\nDigitar novamente: ");
            num = Teclado.nextInt();
        }
        return num;
    }
}
