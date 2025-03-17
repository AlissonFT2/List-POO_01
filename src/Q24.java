import java.util.Scanner;

public class Q24 {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        int arr_size = 3;
        int maior, menor;

        int[] arr = new int[arr_size];

        for(int i = 0; i < arr_size; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            arr[i] = Teclado.nextInt();
        }

        Teclado.close();
        
        maior = arr[0];
        menor = arr[0];


        for(int i = 1; i < arr_size; i++){
            if(arr[i] >= maior){
                maior = arr[i];
            }
            if(arr[i] <= menor){
                menor = arr[i];
            }
        }

        System.out.printf("\nMaior = %d\nMenor = %d\n",maior, menor);
    }
}
