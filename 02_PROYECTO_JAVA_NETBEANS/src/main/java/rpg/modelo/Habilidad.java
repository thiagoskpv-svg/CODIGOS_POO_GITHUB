package rpg.modelo;
public abstract class Habilidad {
    private final String nombre;
    private final int costo;
    protected Habilidad(String nombre, int costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    public abstract int calcularEfecto(Personaje objetivo);
    public String getNombre() { return nombre; }
    public int getCosto() { return costo; }
}
