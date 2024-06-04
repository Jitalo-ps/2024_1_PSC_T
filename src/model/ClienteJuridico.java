package model;

public class ClienteJuridico extends Cliente{
    public String cnpj;

    public ClienteJuridico(){
        super();
        System.out.println("Cliente Juridico");
    }
    public ClienteJuridico(String nome){
        super(nome);
    }
    @Override
    public String toString() {
        String txt = "Nome da empresa: " + this.nome +
            "\nCNPJ: " + this.cnpj +
            "\nEndereço: " + this.endereco 
                + "\nCidade: " + this.cidade.nome;
        return txt;
    }

}
