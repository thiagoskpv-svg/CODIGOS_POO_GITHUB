package rpg.modelo;
import java.util.Objects;
public class Personaje {
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private String estado = "vivo";
    private static int totalCreados = 0;
    private final Inventario inventario;
    private EstrategiaAtaque estrategia = new AtaqueBasico();
    public Personaje(String nombre) { this(nombre, 100, 10); }
    public Personaje(String nombre, int vidaMaxima) { this(nombre, vidaMaxima, 10); }
    // Versión integrada: el tercer parámetro representa la capacidad del inventario.
    public Personaje(String nombre, int vidaMaxima, int capacidadInventario) {
        if (vidaMaxima <= 0) throw new IllegalArgumentException("Vida máxima no válida");
        this.nombre = Objects.requireNonNull(nombre);
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.inventario = new Inventario(capacidadInventario);
        totalCreados++;
    }
    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public String getEstado() { return estado; }
    public static int getTotalCreados() { return totalCreados; }
    public void recibirDano(int dano) {
        if (dano < 0) throw new IllegalArgumentException("El daño no puede ser negativo");
        vida = Math.max(0, vida - dano);
        if (vida == 0) estado = "derrotado";
    }
    public void curar(int cantidad) {
        if (cantidad < 0) throw new IllegalArgumentException("Curación negativa");
        vida = Math.min(vidaMaxima, vida + cantidad);
        if (vida > 0) estado = "vivo";
    }
    public boolean recoger(Item item) { return inventario.agregar(item); }
    public void setEstrategia(EstrategiaAtaque estrategia) {
        this.estrategia = Objects.requireNonNull(estrategia);
    }
    public int atacar() { return estrategia.calcular(); }
}
