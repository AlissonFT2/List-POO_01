import java.util.Scanner;

public class Q31 {
    
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite as notas do aluno " + i);
            System.out.print("Nota AV1: ");
            double av1 = Teclado.nextDouble();
            System.out.print("Nota AV2: ");
            double av2 = Teclado.nextDouble();
            double media = calcularMedia(av1, av2);

            if (media < 6) {
                System.out.print("Nota AV3: ");
                double av3 = Teclado.nextDouble();
                media = atualizarNotas(av1, av2, av3);
            }
            
            System.out.println("Média do aluno " + i + ": " + media);
            System.out.println("Status: " + verificarAprovacao(media));
            System.out.println();
        }
        
        Teclado.close();
    }

    public static double calcularMedia(double av1, double av2) {
        return (av1 + av2) / 2;
    }

    public static double atualizarNotas(double av1, double av2, double av3) {
        if (av1 < av2) {
            av1 = av3;
        } else {
            av2 = av3;
        }
        return calcularMedia(av1, av2);
    }

    public static String verificarAprovacao(double media) {
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}




