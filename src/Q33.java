import java.util.Scanner;

public class Q33 {
        public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        int[] arr = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        
        int conta_par=0,conta_impar=0;

        for(int i = 0; i < arr.length; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            arr[i] = Teclado.nextInt();

            if(arr[i] % 2 == 0){
                par[conta_par++] = arr[i];
            } else {
                impar[conta_impar++] = arr[i];
            }
        }

        System.out.println("Números Pares");
        for(int i = 0; i < conta_par; i++){
            System.out.printf("%d ",par[i]);
        }

        System.out.println("\nNúmeros Impares");

        for(int i = 0; i < conta_impar; i++){
            System.out.printf("%d ",impar[i]);
        }

        System.out.println();

        Teclado.close();

    }
}
