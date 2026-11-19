package rpg.app;
import rpg.modelo.Personaje;
public class Main {
    public static void main(String[] args) {
        int nivel = 1;
        int otroNivel = nivel;
        otroNivel = 5;
        Personaje aria = new Personaje("Aria", 100);
        Personaje copia = aria;
        copia.recibirDano(30);
        System.out.println(nivel + " " + aria.getVida());
    }
}
