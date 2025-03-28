import java.util.Scanner;

public class Q32 {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        int[] triangulo = new int[3];

        for(int i = 0; i < triangulo.length; i++){
            System.out.printf("Digite o %dº lado: ",i+1);
            int valor = Teclado.nextInt();

            while(valor <= 0){
                System.out.println("Mediada invalida digite novamente");
                System.out.printf("Digite o %dº lado: ",i+1);
                valor = Teclado.nextInt();
            }

            triangulo[i] = valor;
        }

        Teclado.close();

        triangulo(triangulo);

    }
    public static void triangulo(int[] triangulo){
        if(
            triangulo[0] < triangulo[1] + triangulo[2] &&
            triangulo[1] < triangulo[0] + triangulo[2] &&
            triangulo[2] < triangulo[0] + triangulo[1]
        ){
            
            if(
                triangulo[0] == triangulo[1] && 
                triangulo[1] == triangulo[2] && 
                triangulo[2] == triangulo[0]
            ){
                System.out.println("Triangulo Equilátero");
            } else if 
            (
                triangulo[0] != triangulo[1] && 
                triangulo[1] != triangulo[2] && 
                triangulo[2] != triangulo[0]
            ){
                System.out.println("Triangulo Escaleno");
            } else {
                System.out.println("Triangulo Isóceles");
            }

        } else {
            System.out.println("Os lados digitados não formam um triangulo");
        }
    }
}
