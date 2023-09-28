package facade;

public class HomeTheater {

    public boolean assistir() {
        return HomeTheaterFacade.verificarPendencias(this);
    }
}
