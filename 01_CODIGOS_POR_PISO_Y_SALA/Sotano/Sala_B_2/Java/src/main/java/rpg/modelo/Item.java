package rpg.modelo;
public class Item {
    private final String nombre;
    private final double peso;

    public Item(String nombre, double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("El peso no puede ser negativo");
        }
        this.nombre = nombre;
        this.peso = peso;
    }
    public Item(String nombre) {
        this(nombre, 1.0);
    }
    public String describir() {
        return nombre + " (" + peso + " kg)";
    }
}
