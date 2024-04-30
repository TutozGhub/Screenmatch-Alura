import java.util.Scanner;

public class screenmatch {
    public static void main(String[] args){

        String titulo = "Matrix";
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlanBasico = true;
        String sinopsis = "Pelicula de ciencia ficción.";
        double notaPromedio = 0;
        int i = 0;
        double notaPelicula = -1;

        System.out.println("Título: " + titulo);

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota numero " + (i+1) + " para el promedio (-1 para terminar el bucle): ");
            notaPelicula = teclado.nextDouble();
            
            if (notaPelicula != -1){
                notaPromedio += notaPelicula;
                i++;
            }
        } while(notaPelicula > -1 || i == 0);

        notaPromedio /= i;

        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Incluido en el plan basico: " + incluidoEnPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);

        if (fechaDeLanzamiento < 2020){
            System.out.println("Tipo: Pelicula retro");
        }
        else{
            System.out.println("Tipo: Pelicula actual");
        }
        System.out.println("La calificación media de la pelicula " + titulo + " es de " + notaPromedio + " / 5");
    }
}