import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro c = new Carro ("Chevrolet", "Onix", 2022);
        Carro c1 = new Carro( "Uno", 2004);
        Carro c2 = new Carro();

        System.out.println("Digite o nome: ");
        c2.setNome(sc.next());

        System.out.println("Digite a marca: ");
        c2.setMarca(sc.next());

        System.out.println("Digite o ano: ");
        c2.setAno(sc.nextInt());
    }
}