package facade;

public class HomeTheaterFacade {

    public static boolean verificarPendencias(HomeTheater homeTheater) {
        if (Amplificador.getInstance().verificaHomeTheaterComPendencia(homeTheater)) {
            return false;
        }
        if (AltoFalante.getInstance().verificaHomeTheaterComPendencia(homeTheater)) {
            return false;
        }
        if (Televisor.getInstance().verificaHomeTheaterComPendencia(homeTheater)) {
            return false;
        }
        return true;
    }

}
