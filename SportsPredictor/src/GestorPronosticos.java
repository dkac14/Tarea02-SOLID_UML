import java.util.ArrayList;

public class GestorPronosticos {
    private ArrayList<Pronostico> pronosticos = new ArrayList<>();

    public void crearPronostico(Evento evento, Categoria categoria, String descripcion, Usuario usuario) {
        if (evento.estaAbierto()) {
            Pronostico p = new Pronostico(evento, categoria, descripcion, usuario);
            pronosticos.add(p);
        }
    }

    public ArrayList<Pronostico> getPronosticos() {
        return pronosticos;
    }
}
