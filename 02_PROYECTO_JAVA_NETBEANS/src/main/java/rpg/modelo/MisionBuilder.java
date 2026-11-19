package rpg.modelo;
public class MisionBuilder {
    private String titulo = "Sin título";
    private int recompensa = 0;
    public MisionBuilder titulo(String titulo) { this.titulo = titulo; return this; }
    public MisionBuilder recompensa(int recompensa) { this.recompensa = recompensa; return this; }
    public Mision construir() { return new Mision(titulo, recompensa); }
}
