package rpg.modelo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
class PersonajeTest {
    @Test void recibirDanoNoBajaDeCero() {
        Personaje p = new Personaje("Aria", 50);
        p.recibirDano(80);
        assertEquals(0, p.getVida());
    }
    @Test void danoNegativoSeRechaza() {
        Personaje p = new Personaje("Aria", 50);
        assertThrows(IllegalArgumentException.class, () -> p.recibirDano(-1));
    }
}
