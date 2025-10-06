import models.Operacao;

public class App {
    public static void main(String[] args) {
        Operacao op = CalculadoraControle.getOperacao("multiplicacao");
        double resultado = op.calcular(10, 5);
        System.out.println("Resultado: " + resultado);
    }
}
