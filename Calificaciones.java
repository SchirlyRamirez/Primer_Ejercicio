public class Calificaciones {
    private String nombreCurso;

    public void setNombreCurso(String nombre) {
        nombreCurso = nombre;
    }

    public String mostrarMensaje() {
        return "Bienvenido al curso de " + nombreCurso;
    }
}


