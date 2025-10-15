public class Arma {
    private String nombre;
    private int dañoAdicional;
 
    public Arma(String nombre, int dañoAdicional) {
        this.nombre = nombre;
        this.dañoAdicional = dañoAdicional;
    }
 
    public int atacarConArma() {
        return dañoAdicional;
    }
 
    public int getDañoAdicional() {
        return dañoAdicional;
    }
 
    public String getNombre() {
        return nombre;
    }
}
