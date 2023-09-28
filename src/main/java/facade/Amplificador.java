package facade;

public class Amplificador extends Equipamento {
    private static Amplificador instance = new Amplificador();

    private Amplificador() {}

    public static Amplificador getInstance() {
        return instance;
    }
}
