public class Reporte {
    private String descripcion;
    private Pronostico pronosticoInvolucrado;
    private Usuario usuario;

    public Reporte(String descripcion, Pronostico pronosticoInvolucrado, Usuario usuario) {
        this.descripcion = descripcion;
        this.pronosticoInvolucrado = pronosticoInvolucrado;
        this.usuario = usuario;
    }

    public String getDescripcion() { return descripcion; }

    public Pronostico getPronosticoInvolucrado() { return pronosticoInvolucrado; }

    public Usuario getUsuario() { return usuario; }
}
