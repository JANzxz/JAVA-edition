import java.util.Scanner;

public class Calculadora_main {
    public static void main(String[] args) {

        calculadora c = new calculadora();
        Scanner sc = new Scanner(System.in);

        int n1,n2;

        System.out.println("Numero1");
        n1 = sc.nextInt();

        System.out.println("Numero2");
        n2 = sc.nextInt();

        System.out.print (c.somar(n1,n2));
    }
}
