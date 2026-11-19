package rpg.modelo;
public class Personaje {
    private final String nombre;
    private EstrategiaAtaque estrategia = new AtaqueBasico();
    // Fragmento de la sala: el proyecto base aporta el resto del modelo.
    public Personaje(String nombre) { this.nombre = nombre; }
    public void setEstrategia(EstrategiaAtaque estrategia) {
        this.estrategia = estrategia;
    }
    public int atacar() {
        return estrategia.calcular();
    }
}
