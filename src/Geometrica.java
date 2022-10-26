public class Geometrica implements ICalcMedia{
    @Override
    public double CalculaMedia(double a, double b) {
        return Math.sqrt(a * b);
    }

    @Override
    public String Situacao(double media) {
        return media > 7 ? "Aprovado" : "Reprovado";
    }
}
