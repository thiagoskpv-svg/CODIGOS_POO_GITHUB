package rpg.modelo;
import java.util.Objects;
public final class Item {
    private final String nombre;
    private final double peso;
    public Item(String nombre) { this(nombre, 1.0); }
    public Item(String nombre, double peso) {
        if (peso < 0) throw new IllegalArgumentException("El peso no puede ser negativo");
        this.nombre = Objects.requireNonNull(nombre);
        this.peso = peso;
    }
    public String getNombre() { return nombre; }
    public double getPeso() { return peso; }
    public String describir() { return nombre + " (" + peso + " kg)"; }
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item otro = (Item) o;
        return nombre.equals(otro.nombre);
    }
    @Override public int hashCode() { return Objects.hash(nombre); }
}
