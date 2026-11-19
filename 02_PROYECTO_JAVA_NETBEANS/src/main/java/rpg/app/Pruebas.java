package rpg.app;
import rpg.modelo.Personaje;
public class Pruebas {
    public static void main(String[] args) {
        Personaje p = new Personaje("Aria", 50);
        p.recibirDano(80);
        if (p.getVida() != 0) throw new AssertionError("La vida no es cero");
        Personaje q = new Personaje("Aria", 50);
        boolean lanzo = false;
        try { q.recibirDano(-1); }
        catch (IllegalArgumentException e) { lanzo = true; }
        if (!lanzo) throw new AssertionError("Daño negativo no rechazado");
        System.out.println("2 pruebas Java correctas");
    }
}
