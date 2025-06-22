public class Pronostico {
    public Evento evento;
    private Categoria categoria;
    private String descripcion;
    private EstadoPronostico estado;
    public Usuario usuario;
    

    public Pronostico(Evento evento, Categoria categoria, String descripcion, Usuario usuario) {
        this.evento = evento;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.estado = EstadoPronostico.PENDIENTE;
        this.usuario = usuario;
    }

    public Evento getEvento() {return evento;}

    public void setEvento(Evento evento) {this.evento = evento;}

    public Categoria getCategoria() {return categoria;}

    public void setCategoria(Categoria categoria) {this.categoria = categoria;}

    public String getDescripcion() {return descripcion;}

    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public EstadoPronostico getEstado() {return estado;}

    public void setEstado(EstadoPronostico estado) {this.estado = estado;}


    public void comprobarEstadoPronostico(){
                if(this.getEstado()== EstadoPronostico.ACERTADO){
                    System.out.println("El pronóstico fue acertado, se agregaran puntos");
                    int i=this.getEvento().getPuntos();
                    int j=this.usuario.getPuntos();
                    this.usuario.setPuntos(j+i);
                }
            }
    }


