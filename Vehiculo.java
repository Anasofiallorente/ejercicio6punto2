
public class Vehiculo {

    protected String NumeroDeplaca;
    protected String TipoDemarca;
    protected double velocidadMaxima;

    
    public Vehiculo(String placa, String marca, double velocidad) {
        this.NumeroDeplaca = placa;
        this.TipoDemarca = marca;
        this.velocidadMaxima = velocidad;
    }

    public void mover() {
        System.out.println("El vehiculo " + TipoDemarca + " (" + NumeroDeplaca + ") está en movimiento");
    }

    public double calcularPeaje() {
        return 10000.0;
    }

    @Override
    public String toString() {
        return "Vehículo: " + TipoDemarca + " | Placa: " + NumeroDeplaca;
    }

    public static void main(String[] args) {
        System.out.println("SISTEMA DE VEHICULOS");

        Carro miCarro = new Carro("ABC-123", "Mazda", 180, 4);
        Moto miMoto = new Moto("XYZ-987", "Yamaha", 140, "Deportiva");
        Camion miCamion = new Camion("TRK-456", "Volvo", 90, 12.5);

        
        System.out.println(miCarro.toString());
        System.out.println(miMoto.toString());
        System.out.println(miCamion.toString());

        miCarro.mover();
        miCamion.mover();
        
        
    }
}