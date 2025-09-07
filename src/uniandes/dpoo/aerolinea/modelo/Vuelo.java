package uniandes.dpoo.aerolinea.modelo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelos {
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


    public ArrayList<Tiquete> getTiquetes()
    {
        return tiquetes.values();
    }


    public int venderTiquetes​(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException
    {
        return 0;


    }


    public boolean equals(Object obj)
    {
        return boolean
    }

















    
}
