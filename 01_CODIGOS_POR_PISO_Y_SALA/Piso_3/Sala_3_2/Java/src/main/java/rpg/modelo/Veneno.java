package rpg.modelo;
public class Veneno implements Efecto {
    private final int dano;
    public Veneno(int dano) {
        this.dano = dano;
    }
    @Override
    public void aplicar(Personaje objetivo) {
        objetivo.recibirDano(dano);
    }
}
