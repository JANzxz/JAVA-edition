public class Pessoajuridica extends Pessoa{
    private String cnpj;

    @Override
    public String toString(){
        return"Nome:"+getNome()+",Idade:"+getIdade()+"Tipo: Pessoa Juridica:"+ cnpj;
    }
}
