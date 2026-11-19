package rpg.app;
import java.util.List;
import rpg.modelo.*;
import rpg.config.Configuracion;
import rpg.servicio.*;
public class Main {
    public static void main(String[] args) {
        Personaje aria = PersonajeFactory.crear("mago", "Aria");
        Personaje borin = PersonajeFactory.crear("guerrero", "Borin");
        Personaje rival = new Personaje("Rival", 100);
        new CombateService().turno(List.of(aria, borin), rival);
        System.out.println("Vida rival: " + rival.getVida());
        System.out.println("Singleton: " + Configuracion.getInstance().getVidaInicial());
        System.out.println("Builder: " + new MisionBuilder().titulo("Rescate").recompensa(500).construir().getTitulo());
    }
}
