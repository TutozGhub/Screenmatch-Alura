package modelo;

public class pelicula extends titulo {
    private String director;

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }


    public pelicula(String nombre, int duracionEnMinutos,int fechaLanzamiento, double calificacion, String director){
        setNombre(nombre);
        setDuracionEnMinutos(duracionEnMinutos);
        setFechaLanzamiento(fechaLanzamiento);
        setCalificacion(calificacion);
        setDirector(director);
    }

    @Override
    public void mostrarFichaTecnica(){
        System.out.println("\n**** Ficha Técnica ****");
        System.out.println("Titulo: " + getNombre());
        System.out.println("Fecha de lanzamiento: " + getFechaLanzamiento());
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Director: " + director);
        System.out.println("Calificación: " + getCalificacion() + "/5.0");
    }
}
