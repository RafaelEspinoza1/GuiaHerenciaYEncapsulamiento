public class Camion extends VehiculoCarga{
    private int numEjes;

    // Constructor
    public Camion(String marca, String modelo, int año, int Kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, Kilometraje, capacidadCarga);
        this.numEjes = numEjes;
    }

    // Getterby Setter paara numEjes
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
    
    // Sobreescribir el método mostrarinfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Ejes: " + numEjes);
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del camión: Revisar motor, suspensión y frenos.");
    }
}
