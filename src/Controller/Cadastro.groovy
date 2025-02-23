package Controller

import Models.Candidato
import Models.Empresa

class Cadastro {

    List<Candidato> candidatosCadastrados = new ArrayList<>()
    List<Empresa> empresasCadastrados = new ArrayList<>()


    void cadastroCandidato(Candidato c){
        candidatosCadastrados.add(c)
    }

    void cadastroEmpresa(Empresa e){
        empresasCadastrados.add(e)
    }

    List<Candidato> getCandidatosCadastrados() {
        return candidatosCadastrados
    }

    List<Empresa> getEmpresasCadastrados() {
        return empresasCadastrados
    }
}
