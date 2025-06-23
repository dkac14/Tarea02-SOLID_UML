public class ServicioRedireccion {
    private EquipoServicioTecnico equipoInicial;

    public ServicioRedireccion(EquipoServicioTecnico equipoInicial) {
        this.equipoInicial = equipoInicial;
    }

    public void redirigir(Reporte reporte) {
        equipoInicial.reportes.add(reporte);
        System.out.println("Reporte redirigido a equipo técnico.");
    }
}
