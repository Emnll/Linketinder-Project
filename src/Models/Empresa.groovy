package Models

import Models.Pessoa.Pessoa

class Empresa extends Pessoa{
    String cnpj
    String pais

    Empresa(String nome, String email, String estado, String cep, String descricao, String cnpj, String pais, List<String> competencias){
        super(nome, email, estado, cep, descricao, competencias)
        this.cnpj = cnpj
        this.pais = pais
    }
    String getCnpj(){
        return cnpj
    }

    void setCnpj(String cnpj){
        this.cnpj = cnpj
    }

    String getPais(){
        return pais
    }

    void setPais(String pais){
        this.pais = pais
    }

    @Override
    String toString(){
        return "Empresa [${super.toString()}\n" +
                "Descricao da Empresa: $descricao\n" +
                "CNPJ: $cnpj\n" +
                "Pais: $pais\n]"
    }
}
