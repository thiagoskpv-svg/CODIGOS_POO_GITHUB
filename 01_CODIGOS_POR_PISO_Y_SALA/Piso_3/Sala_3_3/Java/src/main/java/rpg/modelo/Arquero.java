package rpg.modelo;
public class Arquero extends Personaje {
    private int flechas;
    public Arquero(String nombre, int vidaMaxima, int flechas) {
        super(nombre, vidaMaxima);
        this.flechas = flechas;
    }
    @Override
    public int atacar() {
        if (flechas == 0) {
            return 1;
        }
        flechas--;
        return 9;
    }
}
