import java.util.ArrayList;

public class GestorReportes {
    private ArrayList<Reporte> reportes = new ArrayList<>();
    private ServicioRedireccion redireccionador;

    public GestorReportes(ServicioRedireccion redireccionador) {
        this.redireccionador = redireccionador;
    }

    public void generarReporte(String descripcion, Pronostico pronostico, Usuario usuario) {
        if (pronostico.getEstado() == EstadoPronostico.FALLIDO) {
            Reporte r = new Reporte(descripcion, pronostico, usuario);
            reportes.add(r);
            redireccionador.redirigir(r);
        }
    }

    public ArrayList<Reporte> getReportes() {
        return reportes;
    }
}
