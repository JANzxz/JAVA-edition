    public class Gato extends Animal implements Interface {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void Correr() {
        System.out.println("Franja: Eu sou a velocidade");
    }

    @Override
    public void Fazersom() {
        System.out.println("Franja: Miau😏");
        }

        @Override
        public void Comer() {
            System.out.println("Franja: Nhac, Nhac");
        }
    }