import java.util.Scanner;

public class Q37 {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args){

        int[] primeiroVetor = preencheVetor("Primeiro Vetor", 10);

        int[] segundoVetor = preencheVetor("Segundo Vetor", 10);

        Teclado.close();

        int[] compostoVetor = new int[segundoVetor.length + primeiroVetor.length];

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
    public static int[] preencheVetor(String mensagem, int tamanho){
        int[] vetor = new int[tamanho];
        
        System.out.println(mensagem);

        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            vetor[i] = Teclado.nextInt();
        }

        return vetor;
    }
}
