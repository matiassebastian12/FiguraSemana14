import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        boolean salir = false;
        while (!salir) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la figura que desee calcular perimetro y area: ");
            System.out.println("a: Triangulo");
            System.out.println("b: Cuadrado");
            System.out.println("c: Circulo");
            System.out.println("d: Cubo");
            System.out.println("e: Esfera");
            System.out.println("f: Piramide");
            System.out.println("g: Mostrar todas las figuras");
            System.out.println("h: Salir del programa");
            String input = sc.next();

            switch (input) {
                case "a":
                    Triangulo tr = new Triangulo();
                    tr.ingresarPuntos();
                    figuras.add(tr);
                    System.out.println("El perimetro del triangulo es: " + tr.calcularPerimetro());
                    System.out.println("El area del triangulo es: " + tr.calcularArea());
                    break;
                case "b":
                    Cuadrado cua = new Cuadrado();
                    cua.ingresarPuntos();
                    figuras.add(cua);
                    System.out.println("El perimetro del cuadrado es: " + cua.calcularPerimetro());
                    System.out.println("El area del cuadrado es: " + cua.calcularArea());
                    break;
                case "c":
                    Circulo cr = new Circulo();
                    cr.ingresarPuntos();
                    figuras.add(cr); // Add the figure to the list
                    System.out.println("El perimetro del circulo es: " + cr.calcularPerimetro());
                    System.out.println("El area del circulo es: " + cr.calcularArea());
                    break;
                case "d":
                    Cubo cu = new Cubo();
                    cu.ingresarPuntos();
                    figuras.add(cu);
                    System.out.println("El perimetro del cubo es: " + cu.calcularPerimetro());
                    System.out.println("El area del cubo es: " + cu.calcularArea());
                    break;
                case "e":
                    Esfera es = new Esfera();
                    es.ingresarPuntos();
                    figuras.add(es);
                    System.out.println("El volumen del circulo es: " + es.calcularPerimetro());
                    System.out.println("El area del circulo es: " + es.calcularArea());
                    break;
                case "f":
                    Piramide pr = new Piramide();
                    pr.ingresarPuntos();
                    figuras.add(pr); // Add the figure to the list
                    System.out.println("El volumen del Piramide es: " + pr.calcularPerimetro());
                    System.out.println("El area de la Piramide es: " + pr.calcularArea());
                    break;
                case "g":

                    for (Figura figura : figuras) {
                        System.out.println("Figura: " + figura.getClass().getSimpleName());
                        System.out.println("Perimetro: " + figura.calcularPerimetro());
                        System.out.println("Area: " + figura.calcularArea());
                        System.out.println();
                    }
                    break;
                case "h":
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            System.out.println();
        }
    }
}