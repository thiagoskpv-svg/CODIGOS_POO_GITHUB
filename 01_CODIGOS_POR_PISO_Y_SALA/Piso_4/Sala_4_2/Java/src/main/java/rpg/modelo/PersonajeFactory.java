package rpg.modelo;
public class PersonajeFactory {
    public static Personaje crear(String tipo, String nombre) {
        switch (tipo) {
            case "guerrero":
                return new Guerrero(nombre, 120);
            case "mago":
                return new Mago(nombre, 80, 50);
            default:
                throw new IllegalArgumentException("Tipo desconocido: " + tipo);
        }
    }
}
