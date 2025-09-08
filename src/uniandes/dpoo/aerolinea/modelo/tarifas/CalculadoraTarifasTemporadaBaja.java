package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas
{
    public static final double DESCUENTO_TEMPORADA_BAJA = 0.13;
    protected double calcularPorcentajeDescuento(Cliente cliente)
    {
        return DESCUENTO_TEMPORADA_BAJA;
    }
    public int calcularTarifa(Ruta ruta, Cliente cliente)
    {
        int distancia = Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
        int valorBase = distancia * VALOR_BASE_KM / 1000;
        int valorConDescuento = (int)(valorBase * (1 - DESCUENTO_TEMPORADA_BAJA));
        return cliente.calcularValorTiquete(valorConDescuento);
    }
}