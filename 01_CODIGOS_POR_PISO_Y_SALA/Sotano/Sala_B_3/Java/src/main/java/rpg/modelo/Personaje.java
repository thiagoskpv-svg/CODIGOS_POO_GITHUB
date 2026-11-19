package rpg.modelo;
public class Personaje {
    private final String nombre;
    private static int totalCreados = 0;

    public Personaje(String nombre) {
        this.nombre = nombre;
        totalCreados++;
    }
    public static int getTotalCreados() {
        return totalCreados;
    }
}
