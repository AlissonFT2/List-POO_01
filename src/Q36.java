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

        for(int i = primeiroVetor.length - 1; i >= 0; i--){
            System.out.printf("%d ", primeiroVetor[i]);
        }

        System.out.println();

        for(int i = segundoVetor.length - 1; i >= 0; i--){
            System.out.printf("%d ", segundoVetor[i]);
        }

        System.out.println();
    }
}
