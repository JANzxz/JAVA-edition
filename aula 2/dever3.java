import java.util.Scanner;
public class dever3 {
    public static void main(String[] args){
        int r;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Caso escolha 1: compra blusa, caso escolha 2: Solicitar valor de compra");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Otima escolha!");
                    break;

                case 2:
                    System.out.println("O valor da blusa e 2,00");
                    break;
            }
            System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
            }while (r == 0);
        }
    }


