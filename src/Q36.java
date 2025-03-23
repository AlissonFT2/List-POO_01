import java.util.Scanner;

public class Q36 {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        int[] primeiroVetor = new int[5];
        int[] segundoVetor = new int[5];


        for(int i = 0; i < primeiroVetor.length; i++){
            System.out.printf("Digite o %dº idade: ",i+1);
            primeiroVetor[i] = Teclado.nextInt();
            System.out.printf("Digite o %dº altura: ",i+1);
            segundoVetor[i] = Teclado.nextInt();
        }

        Teclado.close();

        printArr(primeiroVetor);

        System.out.println();

        printArr(segundoVetor);

        System.out.println();
    }
    public static void printArr(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.printf("%d ", arr[i]);
        }
    }
}
