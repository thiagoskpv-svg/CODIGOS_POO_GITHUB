package rpg.modelo;
public class Personaje {
    private final String nombre;
    private final Inventario inventario;
    public Personaje(String nombre, int capacidad) {
        this.nombre = nombre;
        this.inventario = new Inventario(capacidad);
    }
    public boolean recoger(Item item) {
        return inventario.agregar(item);
    }
}
