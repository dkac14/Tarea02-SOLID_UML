import java.util.ArrayList;

public class Categoria {

    public static final ArrayList<String> CATEGORIAS = new ArrayList<>();


    static {
        CATEGORIAS.add("RESULTADO_DEL_PARTIDO");
        CATEGORIAS.add("MARCADOR_EXACTO");
        CATEGORIAS.add("RENDIMIENTO_JUGADORES");
    }


    public static void agregarCategoria(String nuevaCategoria) {
        String categoriaFormateada = nuevaCategoria.toUpperCase();
        if (!CATEGORIAS.contains(categoriaFormateada)) {
            CATEGORIAS.add(categoriaFormateada);
            System.out.println("Categoría agregada: " + categoriaFormateada);
        } else {
            System.out.println("La categoría ya existe: " + categoriaFormateada);
        }
    }

}