public class VehiculoPasajeros extends Vehiculo {

    private int numPasajeros;

    // Constructor
    public VehiculoPasajeros(String marca, String modelo, int año, int Kilometraje, int numPasajeros) {
        super(marca, modelo, año, Kilometraje);
        this.numPasajeros = numPasajeros;
    }
    // Getter y Setter para numPasajeros
    public int getNumPasajeros(){
        return numPasajeros;
    }
    public void SetNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    } 
    
    // Sobreescribir el metodo mostrarinfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de Pasajeros: " + numPasajeros);
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento especifico del vehiculo de pasajeros.");
    }
}
