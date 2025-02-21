package Models

import Models.Pessoa.Pessoa

class Candidato extends Pessoa{
    int idade
    String cpf

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
        return "Empresa [${super.toString()}\n" +
                "Descricao do Candidato: $descricao\n" +
                "Idade: $idade\n" +
                "CPF: $cpf\n]"
    }
}
