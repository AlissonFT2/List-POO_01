import java.util.Scanner;

public class Q27 {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        System.out.print("Digite o Lim inferior: ");
        int limInf = Teclado.nextInt();

        System.out.print("Digite o Lim superior: ");
        int limSup = Teclado.nextInt();

        System.out.print("Digite o número: ");
        int num = Teclado.nextInt();

        Teclado.close();

        intervalo(num, limInf, limSup);
    }

    public static void intervalo(int num, int limInf, int limSup){
        if(num >= limInf && num <= limSup){
            System.out.printf("\n%d Está dentro do intervalo %d - %d\n",num, limInf, limSup);
        } else {
            System.out.printf("\n%d Está fora do intervalo %d - %d\n",num,limInf,limSup);
        }
    }

}


