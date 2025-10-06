import models.Operacao;

public class CalculadoraControle {
    public static Operacao getOperacao(String tipo) {
        switch (tipo) {
            case "soma":
                return new Soma();
            case "subtracao":
                return new Subtracao();
            case "multiplicacao":
                return new Multiplicacao();
            case "divisao":
                return new Divisao();
            default:
                throw new IllegalArgumentException("Operação inválida: " + tipo);
        }
    }
}
