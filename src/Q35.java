import java.util.Scanner;

public class Q35 {
        public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        int[] numeros = new int[5];

        int mult=1,soma=0;

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            numeros[i] = Teclado.nextInt();
            mult *= numeros[i];
            soma += numeros[i];
        }

        Teclado.close();


        System.out.println("Números Digitados");

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("%d ",i);
        }

        System.out.printf("\nSoma = %d,\nMultiplicação = %d\n",soma,mult);    
    }
}
