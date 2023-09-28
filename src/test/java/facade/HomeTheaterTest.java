package facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeTheaterTest {

    @Test
    public void shouldReturnPendenciaAmplificadorHomeTheater() {
        HomeTheater homeTheater = new HomeTheater();
        Amplificador.getInstance().addEquipeComPendencia(homeTheater);

        assertEquals(false, homeTheater.assistir());
    }

    @Test
    public void shouldReturnPendenciaAltoFalanteHomeTheater() {
        HomeTheater homeTheater = new HomeTheater();
        AltoFalante.getInstance().addEquipeComPendencia(homeTheater);

        assertEquals(false, homeTheater.assistir());
    }

    @Test
    public void shouldReturnPendenciaTelevisorHomeTheater() {
        HomeTheater homeTheater = new HomeTheater();
        Televisor.getInstance().addEquipeComPendencia(homeTheater);

        assertEquals(false, homeTheater.assistir());
    }

    @Test
    public void shouldReturnHomeTheaterSemPendencia() {
        HomeTheater homeTheater = new HomeTheater();

        assertEquals(true, homeTheater.assistir());
    }

}
