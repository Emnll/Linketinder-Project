package Models.Pessoa

class Pessoa implements InterfacePessoa {
    String nome
    String email
    String estado
    String cep
    String descricao
    ArrayList<String> competencias

    Pessoa(String nome, String email, String estado, String cep, String descricao, List<String> competencias){
        this.nome = nome
        this.email = email
        this.estado = estado
        this.cep = cep
        this.descricao = descricao
        this.competencias = new ArrayList<>(competencias)
    }

    @Override
    String getNome(){
        return nome
    }

    @Override
    void setNome(String nome){
        this.nome = nome
    }

    @Override
    String getEmail(){
        return email
    }

    @Override
    void setEmail(String email){
        this.email = email
    }

    @Override
    String getEstado(){
        return estado
    }

    @Override
    void setEstado(String estado){
        this.estado = estado
    }

    @Override
    String getCep(){
        return cep
    }

    @Override
    void setCep(String cep){
        this.cep = cep
    }

    @Override
    String getDescricao(){
        return descricao
    }

    @Override
    void setDescricao(String descricao){
        this.descricao = descricao
    }

    @Override
    String toString(){
        return "Nome: $nome\n" +
                "Email: $email\n" +
                "Cep: $cep\n" +
                "Estado: $estado\n" +
                "Competencias: $competencias"
    }
}
