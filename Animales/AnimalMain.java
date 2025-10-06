package Animales;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.especie = "Perro";
        animal1.sonido = "Guau";
        animal1.edad = 5;

        Animal animal2 = new Animal();
        animal2.especie = "Gato";
        animal2.sonido = "Miau";
        animal2.edad = 3;
        animal2.hacerSonido();

        Animal animal3 = new Animal();
        animal3.especie = "Vaca";
        animal3.sonido = "Muuu";
        animal3.edad = 4;

        System.out.println("El primer animal es un: " + animal1.especie + " - hace: " + animal1.sonido + " - tiene: " + animal1.edad + " años");
        System.out.println("El segundo animal es un: " + animal2.especie + " - hace: " + animal2.sonido + " - tiene: " + animal2.edad + " años");
        System.out.println("El tercer animal es un: " + animal3.especie + " - hace: " + animal3.sonido + " - tiene: " + animal3.edad + " años");
    }
}
