import java.util.ArrayList;
import java.util.Date;

public abstract class Evento {
    private String nombre;
    private String deporte;
    private Date fechaInicio;
    private boolean cerrado;
    private int puntos;
    public ArrayList<Pronostico> pronosticos;

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDeporte() {return deporte;}

    public void setDeporte(String deporte) {this.deporte = deporte;}

    public Date getFechaInicio() {return fechaInicio;}

    public void setFechaInicio(Date fechaInicio) {this.fechaInicio = fechaInicio;}

    public boolean isCerrado() {return cerrado;}

    public void setCerrado(boolean cerrado) {this.cerrado = cerrado;}

    public int getPuntos() {return puntos;}

    public void setPuntos(int puntos) {this.puntos = puntos;}

    
    public Evento(String nombre, String deporte, Date fechaInicio, boolean cerrado, int puntos) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.fechaInicio = fechaInicio;
        this.cerrado = cerrado;
        this.puntos = puntos;
    }

    public boolean estaAbierto() {
        return !cerrado && new Date().before(fechaInicio);
    }

    public void cerrar() {
        this.cerrado = true;
    }

    public void mostrarEstadisticas(){
        System.out.println("Estadisticas de equipos y jugadores...");
    }
    }
