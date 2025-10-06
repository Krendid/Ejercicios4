package Comidas;

public class ComidaMain {
    public static void main(String[] args) {
        Comida comida1 = new Comida();
        comida1.nombre = "Hamburguesa";
        comida1.tipo = "Cena";
        comida1.calorias = 800;

        Comida comida2 = new Comida();
        comida2.nombre = "Ensalada";
        comida2.tipo = "Almuerzo";
        comida2.calorias = 300;
        comida2.mostrarInfo();

        Comida comida3 = new Comida();
        comida3.nombre = "Tostadas";
        comida3.tipo = "Desayuno";
        comida3.calorias = 250;

        System.out.println("Comida1: " + comida1.nombre + " - Para: " + comida1.tipo + " - tiene: " + comida1.calorias + " calorías.");
        System.out.println("Comida2: " + comida2.nombre + " - Para: " + comida2.tipo + " - tiene: " + comida2.calorias + " calorías.");
        System.out.println("Comida3: " + comida3.nombre + " - Para: " + comida3.tipo + " - tiene: " + comida3.calorias + " calorías.");
    }
}
