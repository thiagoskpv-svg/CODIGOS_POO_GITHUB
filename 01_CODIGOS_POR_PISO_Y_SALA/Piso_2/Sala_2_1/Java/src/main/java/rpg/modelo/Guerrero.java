package rpg.modelo;
public class Guerrero extends Personaje {
    public Guerrero(String nombre, int vidaMaxima) {
        super(nombre, vidaMaxima);
    }
    private Arma arma;
    public void equipar(Arma arma) {
        this.arma = arma;
    }
    @Override
    public int atacar() {
        if (arma == null) {
            return 1;
        }
        return arma.getDano();
    }
}
