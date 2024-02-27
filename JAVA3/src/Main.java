import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        pessoa p = new pessoa();

        Scanner sc = new Scanner(System.in);

        System.out.println("Teu nome: ");
        p.nome = sc.next();

        System.out.println("antiga: " + p.idade);
        p.niver();

        System.out.println("nome: " + p.nome);
    }
}