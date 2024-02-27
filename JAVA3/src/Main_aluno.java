import java.util.Scanner;

public class Main_aluno {
    public static void main(String[] args) {

        aluno a = new aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        a.nota1 = sc.nextFloat();

        System.out.println("Digite sua primeira nota: ");
        a.nota2 = sc.nextFloat();

        System.out.println("Digite sua primeira nota: ");
        a.nota3 = sc.nextFloat();

        a.calcular_media();

        if (a.media >= 7) {
            System.out.println("Tais aprovado (●'◡'●)");
        }
        else {
            System.out.println("Reprovastes pobre mlk (╯°□°）╯");
        }
        System.out.println("Sua media foi = "+ a.media);
    }
}
