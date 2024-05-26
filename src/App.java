public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Crear instancias de cada tipo de vehículo
        Auto auto = new Auto("Toyota", "Corolla", 2020, 15000, 5, "Gasolina");
        
        Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

        // Mostrar la información de cada vehículo
        System.out.println("Información del Auto: ");
        auto.mostrarInfo();
        auto.realizarMantenimiento();
        double costoMantenimiento = auto.calcularCostoMantenimiento(0.5, 15000);
        System.out.println("Costo del mantenimiento del auto: $" + costoMantenimiento);

        System.out.println("Información del Camion: ");
        camion.mostrarInfo();
        camion.realizarMantenimiento();
    }
}
