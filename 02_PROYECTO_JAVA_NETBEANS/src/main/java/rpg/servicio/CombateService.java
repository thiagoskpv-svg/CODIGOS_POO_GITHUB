package rpg.servicio;
import java.util.List;
import rpg.modelo.Habilidad;
import rpg.modelo.Personaje;
public class CombateService {
    public void turno(List<Personaje> equipo, Personaje enemigo) {
        for (Personaje p : equipo) {
            int dano = p.atacar();
            enemigo.recibirDano(dano);
            System.out.println(p.getNombre() + " causa " + dano);
        }
    }
    public int usarHabilidad(Personaje origen, Habilidad habilidad, Personaje objetivo) {
        int efecto = habilidad.calcularEfecto(objetivo);
        objetivo.recibirDano(efecto);
        System.out.println(origen.getNombre() + " usa " + habilidad.getNombre());
        return efecto;
    }
}
