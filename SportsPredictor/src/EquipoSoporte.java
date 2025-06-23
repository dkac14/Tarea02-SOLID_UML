public class EquipoSoporte extends EquipoServicioTecnico{

    public void revisar(Reporte reporte) {
       System.out.println("Gestionando incidentes del reporte...");
    }

    public void delegarAEquipoControlCalidad(Reporte reporte){
        System.out.println("Delegando reporte a equipo Control Calidad...");
    }

}
