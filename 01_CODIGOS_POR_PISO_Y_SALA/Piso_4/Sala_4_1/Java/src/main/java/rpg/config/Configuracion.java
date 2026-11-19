package rpg.config;
public final class Configuracion {
    private static final Configuracion INSTANCIA = new Configuracion();
    private final int vidaInicial = 100;
    private Configuracion() { }
    public static Configuracion getInstance() {
        return INSTANCIA;
    }
    public int getVidaInicial() {
        return vidaInicial;
    }
}
