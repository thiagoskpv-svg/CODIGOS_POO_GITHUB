package rpg.servicio;
import rpg.modelo.Personaje;
import rpg.repositorio.PersonajeRepositorio;
public class GremioService {
    private final PersonajeRepositorio repositorio;
    public GremioService(PersonajeRepositorio repositorio) {
        this.repositorio = repositorio;
    }
    public Personaje reclutar(String nombre) {
        Personaje nuevo = new Personaje(nombre, 100);
        repositorio.guardar(nuevo);
        return nuevo;
    }
}
