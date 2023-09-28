package facade;

public class AltoFalante extends Equipamento {
    private static AltoFalante instance = new AltoFalante();

    private AltoFalante() {}

    public static AltoFalante getInstance() {
        return instance;
    }
}
