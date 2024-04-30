import java.util.Scanner;

public class screenmatch {
    public static void main(String[] args){

        String titulo = "Matrix";
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlanBasico = true;
        String sinopsis = "Pelicula de ciencia ficción.";
        double notaPromedio = 0;
        int cantidadDeIteraciones = 3;

        System.out.println("Título: " + titulo);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Incluido en el plan basico: " + incluidoEnPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);

        if (fechaDeLanzamiento < 2020){
            System.out.println("Tipo: Pelicula retro");
        }
        else{
            System.out.println("Tipo: Pelicula actual");
        }

        for (int i = 0; i < cantidadDeIteraciones; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota numero " + (i+1) + " para el promedio: ");
            double notaPelicula = teclado.nextDouble();
            notaPromedio += notaPelicula;
        }

        notaPromedio /= 3;
        System.out.println("La calificación media de la pelicula " + titulo + " es de " + notaPromedio + " / 5");
    }
}