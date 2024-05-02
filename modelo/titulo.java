package modelo;

public class titulo {
    private String nombre;
    private int duracionEnMinutos;
    private int fechaLanzamiento;
    private boolean incluidoEnPlanBasico;
    private double calificacion;
    
    
    public String getNombre() {
        return nombre;
    }
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }
    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public boolean isIncluidoEnPlanBasico() {
        return incluidoEnPlanBasico;
    }
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    public void setIncluidoEnPlanBasico(boolean incluidoEnPlanBasico) {
        this.incluidoEnPlanBasico = incluidoEnPlanBasico;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarFichaTecnica(){
        System.out.println("\n**** Ficha Técnica ****");
        System.out.println("Titulo: " + nombre);
        System.out.println("Duración: " + duracionEnMinutos + " minutos");
        System.out.println("Año: " + fechaLanzamiento);
        System.out.println("Calificación: " + calificacion + "/5.0");
    }
}
