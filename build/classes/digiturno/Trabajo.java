
package digiturno;


public class Trabajo {
    private String Nombre;
    private String tipo;
    private int cc;

    public Trabajo() {
    }

    public Trabajo(String Nombre, String tipo, int cc) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.cc = cc;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
