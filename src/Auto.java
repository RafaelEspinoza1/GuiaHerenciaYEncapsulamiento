public class Auto extends VehiculoPasajeros{
    private String tipoCombustible;

    // Constructor
    public Auto(String marca, String modelo, int año, int Kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, Kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    // Getter y Setter para tipoCombustible 
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible() {
        this.tipoCombustible = tipoCombustible;
    }

    // Sobreescribir el método mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del auto: Revisar aceite, neumáticos y frenos.");
    }

    public double calcularCostoMantenimiento(double costoPorKm, int KilometrosRecorridos) {
        double costoTotal = costoPorKm * KilometrosRecorridos;
        return costoTotal;
    }
}
