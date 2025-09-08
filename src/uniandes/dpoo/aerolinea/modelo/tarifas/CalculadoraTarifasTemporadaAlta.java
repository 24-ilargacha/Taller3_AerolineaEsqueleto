package uniandes.dpoo.aerolinea.modelo.tarifas;
import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas
{
    public static final double IMPUESTO_TEMPORADA_ALTA = 0.16;
    protected double calcularPorcentajeDescuento(Cliente cliente)
    {
        return 0; 
    }
    public int calcularTarifa(Ruta ruta, Cliente cliente)
    {
        int distancia = Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
        int valorBase = distancia * VALOR_BASE_KM / 1000;
        int valorConImpuesto = (int)(valorBase * (1 + IMPUESTO_TEMPORADA_ALTA));
        return cliente.calcularValorTiquete(valorConImpuesto);
    }
    
}
