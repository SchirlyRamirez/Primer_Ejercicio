public class Main {
    public static void main(String[] args) {

        Calificaciones planilla = new Calificaciones();
        Calificaciones planilla2 = new Calificaciones();

        planilla.setNombreCurso("Programacion orientada a objetos");
        planilla2.setNombreCurso("Con Java");

        String mensaje1 = planilla.mostrarMensaje();
        System.out.println(mensaje1);

        String mensaje2 = planilla2.mostrarMensaje();
        System.out.println(mensaje2);
    }
}

