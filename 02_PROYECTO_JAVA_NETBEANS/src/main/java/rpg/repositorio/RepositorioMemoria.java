package rpg.repositorio;
import java.util.ArrayList;
import java.util.List;
import rpg.modelo.Personaje;
public class RepositorioMemoria implements PersonajeRepositorio {
    private final List<Personaje> personajes = new ArrayList<>();
    @Override public void guardar(Personaje p) { personajes.add(p); }
    public int cantidad() { return personajes.size(); }
}
