package Controller

import Models.Candidato
import Models.Empresa

class Cadastro {
    List<Candidato> candidatosCadastrados = []
    List<Empresa> empresasCadastrados = []

    void cadastroCandidato( Candidato c){
        candidatosCadastrados.add(c)
    }

    void cadastroEmpresa(Empresa e){
        empresasCadastrados.add(e)
    }

}
