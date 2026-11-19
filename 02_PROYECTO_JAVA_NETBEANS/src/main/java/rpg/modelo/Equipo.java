package rpg.modelo;
import java.util.ArrayList;
import java.util.List;
public class Equipo {
    private final String nombre;
    private final List<Personaje> miembros = new ArrayList<>();
    public Equipo(String nombre) { this.nombre = nombre; }
    public void agregar(Personaje p) { miembros.add(p); }
    public void quitar(Personaje p) { miembros.remove(p); }
    public List<Personaje> getMiembros() { return List.copyOf(miembros); }
    public int ataqueTotal() {
        int total = 0;
        for (Personaje p : miembros) total += p.atacar();
        return total;
    }
}
