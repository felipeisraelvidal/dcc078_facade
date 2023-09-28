package facade;

import java.util.ArrayList;
import java.util.List;

public class Equipamento {

    private List<HomeTheater> equipamentosComPendencia = new ArrayList<HomeTheater>();

    public void addEquipeComPendencia(HomeTheater homeTheater) {
        this.equipamentosComPendencia.add(homeTheater);
    }

    public boolean verificaHomeTheaterComPendencia(HomeTheater homeTheater) {
        return this.equipamentosComPendencia.contains(homeTheater);
    }
}
