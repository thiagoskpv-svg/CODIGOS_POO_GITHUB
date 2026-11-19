package rpg.eventos;
import java.util.ArrayList;
import java.util.List;
public class EventoCombate {
    private final List<Observador> observadores = new ArrayList<>();
    public void suscribir(Observador o) {
        observadores.add(o);
    }
    public void notificar(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }
}
