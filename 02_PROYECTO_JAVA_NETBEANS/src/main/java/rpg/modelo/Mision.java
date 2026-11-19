package rpg.modelo;
public class Mision {
    private final String titulo;
    private final int recompensa;
    public Mision(String titulo, int recompensa) { this.titulo = titulo; this.recompensa = recompensa; }
    public String getTitulo() { return titulo; }
    public int getRecompensa() { return recompensa; }
}
