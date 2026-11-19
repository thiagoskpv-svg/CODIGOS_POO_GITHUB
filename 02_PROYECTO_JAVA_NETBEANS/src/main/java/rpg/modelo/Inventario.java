package rpg.modelo;
import java.util.ArrayList;
import java.util.List;
public class Inventario {
    private final int capacidad;
    private final List<Item> items = new ArrayList<>();
    public Inventario(int capacidad) {
        if (capacidad < 0) throw new IllegalArgumentException("Capacidad negativa");
        this.capacidad = capacidad;
    }
    public boolean agregar(Item item) {
        if (items.size() >= capacidad) throw new InventarioLlenoException("Inventario lleno");
        return items.add(item);
    }
    public List<Item> getItems() { return List.copyOf(items); }
}
