import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int puntos;
    private int ranking;
    public ArrayList<Pronostico> pronosticos;
    private Notificador notificador;
    public ArrayList<Reporte> reporte;
    

    public Usuario(String nombre, int puntos, ArrayList<Pronostico> pronosticos, Notificador notificador) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.pronosticos = pronosticos;
        this.notificador = notificador;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getPuntos() {return puntos;}

    public void setPuntos(int puntos) {this.puntos = puntos;}

    public ArrayList<Pronostico> getPronosticos() {return pronosticos;}

    public void setPronosticos(ArrayList<Pronostico> pronosticos) {this.pronosticos = pronosticos;}

    public Notificador getNotificador() {return notificador;}

    public void setNotificador(Notificador notificador) {this.notificador = notificador;}


    public void verCalendarioEventos(ArrayList<Evento> eventos) {
        System.out.println("Calendario de Eventos:");

        for (Evento e : eventos) {
            if (e.estaAbierto()) {
                System.out.println("- " + e.getNombre() + " | " + e.getFechaInicio());
                e.mostrarEstadisticas();
            }
        }
    }


    public void crearPronostico(Evento evento, Categoria categoria, String descripcion) {
        if (evento.estaAbierto()) {
            pronosticos.add(new Pronostico(evento, categoria, descripcion, this));
        }
    }


    public void generarReporte(String descripcion, Pronostico pronostico){
            if(pronostico.getEstado() == EstadoPronostico.FALLIDO){
                reporte.add(new Reporte(descripcion, pronostico, this));  
            }
    }
    
    public void canjearPuntos(String opcion){
        if(opcion.equals("Premio")){
            System.out.println("Obtuvo un premio...");
        }else{
            System.out.println("Subió de ranking...");
            ranking++;
        }
    }
 
}