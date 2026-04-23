
public class Carro extends Vehiculo {
    private int NumeroPuertas;

    public Carro(String placa, String marca, double velocidad, int puertas) {
        super(placa, marca, velocidad);
        this.NumeroPuertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Puertas del carro : " + NumeroPuertas;
    }
}