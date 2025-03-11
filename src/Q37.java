import java.util.Scanner;

public class Q37 {
        public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        int[] primeiroVetor = new int[10];
        int[] segundoVetor = new int[10];
        int[] compostoVetor = new int[20];

        System.out.println("Primeiro Vetor");

        for(int i = 0; i < primeiroVetor.length; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            primeiroVetor[i] = Teclado.nextInt();
        }

        System.out.println("Segundo Vetor");

        for(int i = 0; i < primeiroVetor.length; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            segundoVetor[i] = Teclado.nextInt();
        }

        Teclado.close();

        int k = 0;
        for (int j = 0; j < primeiroVetor.length; j++) {

            compostoVetor[k++] = primeiroVetor[j];
            compostoVetor[k++] = segundoVetor[j];
        
        }

        for(int i = 0; i < primeiroVetor.length + segundoVetor.length; i++){
            System.out.printf("%d ", compostoVetor[i]);
        }

        System.out.println();
    }
}
