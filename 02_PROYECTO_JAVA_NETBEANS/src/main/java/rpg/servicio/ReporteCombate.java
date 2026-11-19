package rpg.servicio;
import rpg.modelo.Personaje;
public class ReporteCombate {
    public String resumir(Personaje p) { return p.getNombre() + ": " + p.getVida() + " PV"; }
    public void imprimir(Personaje p) { System.out.println(resumir(p)); }
}
