package rpg.app;
import rpg.modelo.Item;
public class Main {
    public static void main(String[] args) {
        Item espada = new Item("Espada", 3.5);
        Item pocion = new Item("Poción", 0.5);
        System.out.println(espada.describir());
        System.out.println(pocion.describir());
    }
}
