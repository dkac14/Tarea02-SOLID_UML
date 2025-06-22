public class Reporte {
    private String descripcion;
    private Pronostico pronosticoInvolucrado;
    public Usuario usuario;
    public EquipoServicioTecnico es;


    public Reporte(String descripcion, Pronostico pronosticoInvolucrado, Usuario usuario) {
        this.descripcion = descripcion;
        this.pronosticoInvolucrado = pronosticoInvolucrado;
        this.usuario = usuario;
    }

    
}