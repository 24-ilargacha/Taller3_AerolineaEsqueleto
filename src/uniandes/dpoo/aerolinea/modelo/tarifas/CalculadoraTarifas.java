package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas 
{
    public static final int VALOR_BASE_KM = 600;
    protected int calcularCostoBase(Ruta ruta)
    {
        return VALOR_BASE_KM;
    }
    protected abstract double calcularPorcentajeDescuento(Cliente cliente);
    public abstract int calcularTarifa(Ruta ruta, Cliente cliente);

}
