
public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String placa, String marca, double velocidad, double carga) {
        super(placa, marca, velocidad);
        this.capacidadCarga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " | Carga: " + capacidadCarga + " Toneladas";
    }
}