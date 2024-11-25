public class InstrumentoMusical {
    // Nombre del instrumento
    private String nombre;
    // Año de fabricación
    private int anoDeFabricacion;
    // Indica si el instrumento es Electrónico
    private boolean electronico;

    public InstrumentoMusical(String nombre, int anoDeFabricacion) {
        this.nombre = nombre;
        this.anoDeFabricacion = anoDeFabricacion;
        this.electronico = true;
    }
    /**
     * Devuelve el nombre del instrumento
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el año de fabricación del instrumento
     */
    public int getAnoDeFabricacion() {
        return anoDeFabricacion;
    }
    /**
     * Devuelve el tipo de construcción del instrumento
     */
    public boolean getElectronico() {
        return electronico;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Disminulle el año de fabricación para que el instrumento envejezca
     */
    public void envejecerInstrumento(int anosEnvejecidos) {
        anoDeFabricacion -= anosEnvejecidos;
    }
    /**
     * Cambia el tipo de construcción del instrumento
     */
    public void invertirElectronico() {
        electronico = !electronico;
    }
    public void imprimirEstado() {
        System.out.println("Nombre: " + nombre + " | Año de fabricación: " + anoDeFabricacion + " | Electrónico: " + electronicoEsp());
    }
    public String getEstado() {
        return("Nombre: " + nombre + " | Año de fabricación: " + anoDeFabricacion + " | Electrónico: " + electronicoEsp());
    }
    public String electronicoEsp() {
        String electronicoEsp;
        if (electronico == true) {
            electronicoEsp = "Sí";
        }
        else {
            electronicoEsp = "No";
        }
        return electronicoEsp;
    }
}

