public class VehiculoCarga extends Vehiculo{ 
    private int capacidadCarga;

    // Constructos
    public VehiculoCarga(String marca, String modelo, int año, int Kilometraje, int capacidadCarga) {
        super(marca, modelo, año, Kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    // Getter y Setter para capacidadCarga
    public int getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    // Sobreescribir el metodo mostrarinfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento especifico del vehiculode carga.");
    }
}
