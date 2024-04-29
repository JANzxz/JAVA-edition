import java.util.ArrayList;

public class Cadastropessoa {
    private ArrayList<Pessoa>pessoas = new ArrayList<>();

    public void cadastrarpessoa(Pessoa p){
        pessoas.add(p);
        System.out.println("Pessoa cadastrada com sucesso");
    }

    public void lista(){
        for(Pessoa p : pessoas){
            System.out.println("Nome:"+p.getNome() + "Idade:"+p.getIdade());
        }
        public void listarPolimorficos() {
            ArrayList<Pessoa>pessoasPolimorficas = new ArrayList<>();
            pessoasPolimorficas.addAll(Pessoafisica);
            pessoasPolimorficas.addAll(Pessoajuridica);

            for(Pessoa p : pessoasPolimorficas);
                if(p instanceof Pessoafisica);
                    System.out.println("Nome"+p.getNome()+",Idade"+p.getIdade()+",CPF"+((Pessoafisica)p).getCPF);
        }

        else if (p instanceof Pessoajuridica){
            System.out.println("Nome:"+p.getNome()+",Idade:"+p.getIdade()+",CPF"+((Pessoajuridica)p).getCPf);
        }

        else{
            System.out.println("Nome:"+p.getNome()+",Idade:"+p.getIdade();
        }
    }
}
