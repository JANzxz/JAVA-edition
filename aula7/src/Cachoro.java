public class Cachoro extends Animal implements Interface{

    public  Cachoro(String nome){
        super(nome);
    }

    @Override
    public void Correr(){
        System.out.println("Corninho: Rapido, foi oq ela disse 😭");
    }

    @Override
    public void Fazersom(){
        System.out.println("Corninho: Auuuuuuuuuuuuuuuuuu BABY, I'M PREYNING ON YOU TONIGHT");
    }

    @Override
    public void Comer() {
        System.out.println("Corninho: Crok, Crok");
    }
}
}
