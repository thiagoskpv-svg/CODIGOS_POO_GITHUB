package rpg.modelo;
public class Clerigo extends Personaje implements Curador {
    public Clerigo(String nombre, int vidaMaxima) { super(nombre, vidaMaxima); }
    @Override public void curar(Personaje aliado, int cantidad) { aliado.curar(cantidad); }
}
