package Models.Pessoa
/*A interface pessoa ira conter ira conter os metodos obrigatorios para os perfis de candidato e empresa
* Ou seja, todos os getters e setters dos atributos de pessoa*/

interface InterfacePessoa {

    String getNome()
    void setNome(String nome)
    String getEmail()
    void setEmail(String email)
    String getEstado()
    void setEstado(String estado)
    String getCep()
    void setCep(String Cep)
    String getDescricao()
    void setDescricao(String descricao)
}