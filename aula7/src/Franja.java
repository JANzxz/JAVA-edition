public class Franja extends Animal implements Corrida {

    public Franja (String nome){
        super (nome);
    }

    @Override
    public void correr(){
        System.out.println("Eu sou a velocidade");
    }
    @Override
    public void fazersom(){
        System.out.println("Auuuuu");
}

