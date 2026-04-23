
public class Moto extends Vehiculo {
    private String tipo;

    public Moto(String placa, String marca, double velocidad, String tipo) {
        super(placa, marca, velocidad);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo de moto : " + tipo;
    }
}