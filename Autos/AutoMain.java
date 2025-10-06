package Autos;

public class AutoMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.marca = "Toyota";
        auto1.color = "Rojo";
        auto1.año = 2020;

        Auto auto2 = new Auto();
        auto2.marca = "Honda";
        auto2.color = "Azul";
        auto2.año = 2018;
        auto2.encender();

        Auto auto3 = new Auto();
        auto3.marca = "Ford";
        auto3.color = "Negro";
        auto3.año = 2022;

        System.out.println("Marca: " + auto1.marca + " - color:  " + auto1.color + " - del año: " + auto1.año);
        System.out.println("Marca: " + auto2.marca + " - color:  " + auto2.color + " - del año: " + auto2.año);
        System.out.println("Marca: " + auto3.marca + " - color:  " + auto3.color + " - del año: " + auto3.año);
    }
}
