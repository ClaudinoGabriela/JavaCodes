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

    System.out.println("Digite a cor do retangulo 1:");
    String cor = scanner.nextLine();

    System.out.println("Digite o lado do retangulo 1");
    double lado = scanner.nextDouble();
    scanner.nextLine(); 

    System.out.println("Digite a base do retangulo 1");
    double base = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Digite a altura do retangulo 1");
    double altura = scanner.nextDouble();
    scanner.nextLine(); 

    System.out.println("Digite a cor do retangulo 2:");
    String cor2 = scanner.nextLine();

    System.out.println("Digite o lado do retangulo 2");
    double lado2 = scanner.nextDouble();
    scanner.nextLine(); 

    System.out.println("Digite a base do retangulo 2");
    double base2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Digite a altura do retangulo 2");
    double altura2 = scanner.nextDouble();
    scanner.nextLine(); 

    System.out.println("Digite a cor do retangulo 3:");
    String cor3 = scanner.nextLine();

    System.out.println("Digite o lado do retangulo 3");
    double lado3 = scanner.nextDouble();
    scanner.nextLine(); 

    System.out.println("Digite a base do retangulo 3");
    double base3 = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Digite a altura do retangulo 3");
    double altura3 = scanner.nextDouble();
    scanner.nextLine(); 

    Retangulo retang = new Retangulo(cor, lado, base, altura);
    Retangulo retang2 = new Retangulo(cor2, lado2, base2, altura2);
    Retangulo retang3 = new Retangulo(cor3, lado3, base3, altura3);

    double area = retang.calcularArea();
    double perimetro = retang.calcularPerimetro();

    double area2 = retang2.calcularArea();
    double perimetro2 = retang2.calcularPerimetro();

    double area3 = retang3.calcularArea();
    double perimetro3 = retang3.calcularPerimetro();

    System.out.println("A cor do retangulo 1 é " + cor + ", seu perimetro é " + perimetro + " e a area é " + area +
    "\nA cor do retangulo 2 é " + cor2 + ", seu perimetro é " + perimetro2 + " e a área é " + area2 +
    "\nA cor do retangulo 3 é " + cor3 + ", seu perimetro é " + perimetro3 + " e a área é " + area3);

    scanner.close();
}
}