import java.util.Scanner;
import modelo.pelicula;
import modelo.serie;

public class principal {
    public void mostrarMenu(){
        int opcion = -1;
        Scanner teclado = new Scanner(System.in);

        do {
            String menu = """
                    \nBienvenido/a a Screenmatch
                    1. Añadir una nueva pelicula al catalogo
                    2. Añadir una nueva serie al catalogo
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            String nombre;
            int duracionEnMinutos;
            double calificacion;
            String director;
            int fechaLanzamiento;
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre de la pelicula");
                    nombre = teclado.nextLine();
                    System.out.println("Duracion en minutos");
                    duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Calificación");
                    calificacion = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Director");
                    director = teclado.nextLine();
                    System.out.println("Fecha de lanzamiento");
                    fechaLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    
                    pelicula peli = new pelicula(nombre, duracionEnMinutos, fechaLanzamiento, calificacion, director);
                    peli.mostrarFichaTecnica();
                    break;
                case 2:
                    System.out.println("Ingrese nombre de la serie");
                    nombre = teclado.nextLine();
                    System.out.println("Temporadas");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Episodios por temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Duracion en minutos por episodio");
                    int duracionEnMinutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Calificación");
                    calificacion = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Fecha de lanzamiento");
                    fechaLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    
                    serie objSerie = new serie(nombre, fechaLanzamiento, calificacion, temporadas, episodiosPorTemporada, duracionEnMinutosPorEpisodio);
                    objSerie.mostrarFichaTecnica();
                    break;
                default:
                System.out.println("Opción no valida");
                    break;
            }
        } while (opcion != -1);

        teclado.close();
    }
}
