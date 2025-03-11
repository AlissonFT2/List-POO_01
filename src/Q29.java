import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor da temperatura: ");
        double temperatura = Teclado.nextDouble();
        
        System.out.print("Digite a escala atual (Celsius, Fahrenheit, Kelvin): ");
        String escalaAtual = Teclado.next().toLowerCase();
        
        System.out.print("Digite a escala para a qual deseja converter (Celsius, Fahrenheit, Kelvin): ");
        String escalaDesejada = Teclado.next().toLowerCase();
        
        double resultado = 0;
        String resultadoEscala = "";
        
        Teclado.close();

        switch (escalaAtual) {
            case "celsius":
                switch (escalaDesejada) {
                    case "fahrenheit":
                        resultado = temperatura * 1.8 + 32;
                        resultadoEscala = "Fahrenheit";
                        break;
                    case "kelvin":
                        resultado = temperatura + 273.15;
                        resultadoEscala = "Kelvin";
                        break;
                    default:
                        System.out.println("Escala de destino inválida!");
                        return;
                }
                break;
            case "fahrenheit":
                switch (escalaDesejada) {
                    case "celsius":
                        resultado = (temperatura - 32) / 1.8;
                        resultadoEscala = "Celsius";
                        break;
                    default:
                        System.out.println("Escala de destino inválida!");
                        return;
                }
                break;
            case "kelvin":
                switch (escalaDesejada) {
                    case "celsius":
                        resultado = temperatura - 273.15;
                        resultadoEscala = "Celsius";
                        break;
                    case "fahrenheit":
                        resultado = 1.8 * (temperatura - 273) + 32;
                        resultadoEscala = "Fahrenheit";
                        break;
                    default:
                        System.out.println("Escala de destino inválida!");
                        return;
                }
                break;
            default:
                System.out.println("Escala de origem inválida!");
                return;
        }
        
        System.out.printf("Resultado: %.2f %s%n", resultado, resultadoEscala);
    }
}
