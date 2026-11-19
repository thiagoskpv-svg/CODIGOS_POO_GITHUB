package rpg.modelo;
public class Personaje {
    private final String nombre;
    private final int vidaMaxima;
    private int vida;
    private String estado = "vivo";

    public Personaje(String nombre, int vidaMaxima) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
    }
    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public String getEstado() { return estado; }
    public int atacar() { return 5; }

    public void recibirDano(int dano) {
        if (dano < 0) {
            throw new IllegalArgumentException("El daño no puede ser negativo");
        }
        vida = Math.max(0, vida - dano);
        if (vida == 0) {
            estado = "derrotado";
        }
    }
}
