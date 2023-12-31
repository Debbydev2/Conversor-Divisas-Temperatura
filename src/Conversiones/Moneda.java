package Conversiones;

public class Moneda {
    private String monedaOrigen;
    private String monedaDestino;
    private double tasaDeCambio;

    public Moneda(String monedaOrigen, String monedaDestino, double tasaDeCambio) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.tasaDeCambio = tasaDeCambio;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }
}
