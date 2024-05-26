public class Vehiculo {
    private String marca;
    private String modelo;
    private int año; 
    private int Kilometraje;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, int Kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.Kilometraje = Kilometraje;
    }
    // Getters y Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAño() {
        return año;
    }
    public void serAño(int año) {
        this.año = año;
    }
    public int getKilometraje() {
        return Kilometraje;
    }
    public void setKilometraje(int Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año );
        System.out.println("Kilometraje: " + Kilometraje);
    }
     // Método para realizar mantenimiento 
     public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento básico del vehículo.");
     }
}
