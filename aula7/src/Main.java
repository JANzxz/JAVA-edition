// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){

        Animal a1 = new Cachoro("Corninho");
        Animal a2 = new Gato("Franja");
        Animal a3 = new Pasarinho("Maroca");

        a1.Fazersom();
        ((Cachoro)a1).Correr();

        a2.Fazersom();
        ((Gato)a2).Correr();

        a3.Fazersom();
        ((Pasarinho)a2).Correr();

    }
}