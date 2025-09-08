package uniandes.dpoo.aerolinea.modelo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
    private Ruta ruta;
    private String fecha;
    private Avion avion;
    private Map <String, Tiquete> tiquetes;
    private boolean realizado;
    public Vuelo (Ruta ruta , String fecha , Avion avion )
    {

        this.ruta = ruta;

        this.fecha = fecha;

        this.avion = avion;

        this.tiquetes = new HashMap<>();

        this.realizado = false;


    }

    public Ruta getRuta()
    {
        return ruta;
    }


    public java.lang.String getFecha()
    {
        return fecha;
    }


    public Avion getAvion()
    {
        return avion;
    }


    public Collection<Tiquete> getTiquetes()
    {
        return tiquetes.values();
    }


    public void agregarTiquete(Tiquete tiquete)
    {
        tiquetes.put(tiquete.getCodigo(), tiquete);
    }
    public int venderTiquetes​(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException
    {
        int tarifaPorTiquete = calculadora.calcularTarifa(this.ruta, cliente);
        int valorTotal = 0;
        for (int i = 0; i < cantidad; i++)
        {
            Tiquete tiquete = GeneradorTiquetes.generarTiquete(this, cliente, tarifaPorTiquete);
            this.agregarTiquete(tiquete);
            valorTotal += tarifaPorTiquete;
        }
        
        return valorTotal;
    }




    public boolean equals(java.lang.Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        
        Vuelo otro = (Vuelo) obj;
        
        if (ruta == null) {
            if (otro.ruta != null)
                return false;
        } else if (!ruta.getCodigoRuta().equals(otro.ruta.getCodigoRuta()))
            return false;
        
        if (fecha == null) {
            if (otro.fecha != null)
                return false;
        } else if (!fecha.equals(otro.fecha))
            return false;
        
        if (avion == null) {
            if (otro.avion != null)
                return false;
        } else if (!avion.getNombre().equals(otro.avion.getNombre()))
            return false;
        
        return true;
    }

    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ruta == null) ? 0 : ruta.getCodigoRuta().hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        result = prime * result + ((avion == null) ? 0 : avion.getNombre().hashCode());
        return result;
    }
}

