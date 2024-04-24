import java.util.Scanner;

public class Retangulo{
    private String cor;
    private double lado;
    private double base;
    private double altura;

public Retangulo (String cor, double lado, double base, double altura){
    this.cor = cor;
    this.lado = lado;
    this.base = base;
    this.altura = altura;
}

public double calcularArea(){
    return base * altura;
}

public double calcularPerimetro(){
    return (2 * (base * altura));
}

public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a cor do retangulo:");
    String cor = scanner.nextLine();

    System.out.println("Digite o lado do retangulo:");
    double lado = scanner.nextDouble();
    scanner.nextLine(); 

    System.out.println("Digite a base do retangulo:");
    double base = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Digite a altura do retangulo:");
    double altura = scanner.nextDouble();
    scanner.nextLine(); 

    Retangulo retang = new Retangulo(cor, lado, base, altura);

    double area = retang.calcularArea();
    double perimetro = retang.calcularPerimetro();

    System.out.println("A cor do retangulo é " + cor + ", seu perimetro é " + perimetro + " e sua area é " + area);

    scanner.close();
}
}