package uniandes.dpoo.aerolinea.modelo.cliente;

public abstract class Cliente {
    public static final String NATURAL = "Natural";
    public static final String CORPORATIVO = "Corporativo";
    public abstract String getIdentificador();
    public abstract String getTipoCliente();
    public abstract int calcularValorTiquete(int valorBase);
    
}
