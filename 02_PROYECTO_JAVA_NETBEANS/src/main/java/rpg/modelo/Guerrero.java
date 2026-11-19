package rpg.modelo;
public class Guerrero extends Personaje {
    private Arma arma;
    public Guerrero(String nombre, int vidaMaxima) { super(nombre, vidaMaxima); }
    public void equipar(Arma arma) { this.arma = arma; }
    @Override public int atacar() { return arma == null ? 1 : arma.getDano(); }
}
