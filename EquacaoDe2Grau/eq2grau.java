public class eq2grau {
    public static void main(String[] args) {

        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double c = Double.valueOf(args[2]);

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0) {
            System.out.println("Não é equação de segundo grau.");
        } else if (delta < 0) {
            System.out.println("A equação não tem soluções reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("\nAs raízes da equação são " + x1 + " e " + x2 + ".\n");
        }
    }
}