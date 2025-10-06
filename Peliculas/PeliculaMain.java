package Peliculas;

public class PeliculaMain {
    public static void main(String[] args) {
        Pelicula peli1 = new Pelicula();
        peli1.titulo = "Avatar";
        peli1.genero = "Ciencia ficción";
        peli1.duracion = 162;

        Pelicula peli2 = new Pelicula();
        peli2.titulo = "Titanic";
        peli2.genero = "Romance";
        peli2.duracion = 195;
        peli2.reproducir();

        Pelicula peli3 = new Pelicula();
        peli3.titulo = "Shrek";
        peli3.genero = "Animación";
        peli3.duracion = 90;

        System.out.println("Película1: " + peli1.titulo + " - genero: " + peli1.genero + " - duracion: " + peli1.duracion);
        System.out.println("Película2: " + peli2.titulo + " - genero: " + peli2.genero + " - duracion: " + peli2.duracion);
        System.out.println("Película3: " + peli3.titulo + " - genero: " + peli3.genero + " - duracion: " + peli3.duracion);
    }
}
