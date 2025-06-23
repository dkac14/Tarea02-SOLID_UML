public class Usuario {
    private String nombre;
    private int puntos;
    private int ranking;
    private Notificador notificador;

    public Usuario(String nombre, int puntos, Notificador notificador) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.notificador = notificador;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getPuntos() { return puntos; }

    public void setPuntos(int puntos) { this.puntos = puntos; }

    public int getRanking() { return ranking; }

    public void subirRanking() { this.ranking++; }

    public Notificador getNotificador() { return notificador; }

    public void setNotificador(Notificador notificador) { this.notificador = notificador; }

    public void canjearPuntos(String opcion) {
        if (opcion.equals("Premio")) {
            System.out.println("Obtuvo un premio...");
        } else {
            System.out.println("Subió de ranking...");
            subirRanking();
        }
    }
}
