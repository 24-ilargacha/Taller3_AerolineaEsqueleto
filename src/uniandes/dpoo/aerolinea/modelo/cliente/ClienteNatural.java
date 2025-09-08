package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
    private String nombre;
    public ClienteNatural(String nombre)
    {
        this.nombre = nombre;
    }
    public String getIdentificador()
    {
        return nombre;
    }
    public String getTipoCliente()
    {
        return NATURAL;
    }

    public int calcularValorTiquete(int valorBase)
    {
        return valorBase;
    }
}
