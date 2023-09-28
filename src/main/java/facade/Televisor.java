package facade;

public class Televisor extends Equipamento {
    private static Televisor instance = new Televisor();

    private Televisor() {}

    public static Televisor getInstance() {
        return instance;
    }
}
