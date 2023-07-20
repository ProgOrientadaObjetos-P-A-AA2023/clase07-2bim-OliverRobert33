package paquete3;

public class Ciudad {

    private int poblacion;
    private String nombre;

    public int obtenerPoblacion() {
        return poblacion;
    }

    public void establecerPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombres) {
        this.nombre = nombres;
    }

    @Override
    public String toString() {

        String expResult = String.format(""
                + "Ciudad de Ecuador\n "
                + "Nombre: %s\n\n\t"
                + "Población: %d\n",
                nombre,
                poblacion
        );
        return expResult;
    }
}
