public class Aritmetica implements ICalcMedia{
    @Override
    public double CalculaMedia(double a, double b) {
        return ((a+b)/2);
    }

    @Override
    public String Situacao(double media) {
        return media > 5 ? "Aprovado" : "Reprovado";
    }
}
