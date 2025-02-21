package Models

import Models.Pessoa.Pessoa

class Candidato extends Pessoa{
    int idade
    String cpf

    Candidato(String nome, String email, String estado, String cep, String descricao, int idade, String cpf, List<String> competencias){
        super(nome, email, estado, cep, descricao, competencias)
        this.idade = idade
        this.cpf = cpf

    }

    int getIdade(){
        return idade
    }

    void setIdade(int idade){
        this.idade = idade
    }

    String getCpf(){
        return cpf
    }

    void setCpf(){
        this.cpf = cpf
    }


    @Override
    String toString(){
        return "Candidato [${super.toString()}\n" +
                "Descricao do Candidato: $descricao\n" +
                "Idade: $idade\n" +
                "CPF: $cpf\n]"
    }
}
