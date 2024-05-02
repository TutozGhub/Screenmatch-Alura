package modelo;

public class serie extends titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }
    @Override
    public int getDuracionEnMinutos() {
        int duracion = temporadas * episodiosPorTemporada * duracionEnMinutosPorEpisodio;
        return duracion;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    public serie(String nombre,int fechaLanzamiento, double calificacion, int temporadas, int episodiosPorTemporada, int duracionEnMinutosPorEpisodio){
        setNombre(nombre);
        setFechaLanzamiento(fechaLanzamiento);
        setCalificacion(calificacion);
        setTemporadas(temporadas);
        setEpisodiosPorTemporada(episodiosPorTemporada);
        setDuracionEnMinutosPorEpisodio(duracionEnMinutosPorEpisodio);
    }

    @Override
    public void mostrarFichaTecnica(){
        System.out.println("\n**** Ficha Técnica ****");
        System.out.println("Titulo: " + getNombre());
        System.out.println("Fecha de lanzamiento: " + getFechaLanzamiento());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episodios por temporada: " + episodiosPorTemporada);
        System.out.println("Duración por episodio: " + getDuracionEnMinutosPorEpisodio() + " minutos");
        System.out.println("Duración: " + getDuracionEnMinutos() + " minutos");
        System.out.println("Calificación: " + getCalificacion() + "/5.0");
    }
}
