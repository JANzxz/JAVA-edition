public class Pasarinho extends Animal implements Interface {

    private String voar;
    public Pasarinho(String nome){
        super(nome);
        this.voar = voar;
    }

    @Override
    public void Correra(){
        System.out.println("Maroca: Velocidade? Nao conheço este conceito pois estou acima dele");
    }

    @Override
    public void Fazersom(){
        System.out.println("Maroca: Humanos ajuelhen-se");
    }
}
