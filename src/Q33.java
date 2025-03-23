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

        printArr("Números Pares", conta_par, par);
        
        System.out.println();

        printArr("Números Impares", conta_impar, impar);

        System.out.println();

        printArr("Todos os Números", 20, arr);

        Teclado.close();

    }
    public static void printArr(String mensagem, int conta, int[] arr){
        System.out.println(mensagem);

        for(int i = 0; i < conta; i++){
            System.out.printf("%d ",arr[i]);
        }
    }
}
