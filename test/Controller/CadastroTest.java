package Controller;

import Models.Candidato;
import Models.Empresa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CadastroTest {

    @Test
    void cadastroCandidato() {
        Cadastro cadastro = new Cadastro();
        List<String> competencias = new ArrayList<>();
        Candidato c = new Candidato("Teste da silva", "Teste@gmail.com", "Teste", "123451234", "Testando a funcionalidade de cadastrar candidatos", 90, "12345678912", competencias);

        cadastro.cadastroCandidato(c);

        assertEquals(1, cadastro.getCandidatosCadastrados().size());
        assertEquals(c, cadastro.getCandidatosCadastrados().get(0));

    }

    @Test
    void cadastroEmpresa() {
        Cadastro cadastro = new Cadastro();
        List<String> competencias = new ArrayList<>();
        Empresa empresa = new Empresa("Teste da silva", "Teste@gmail.com", "Teste", "123451234", "Testando a funcionalidade de cadastrar empresas", "19020391001", "Testelandia", competencias);

        cadastro.cadastroEmpresa(empresa);

        assertEquals(1, cadastro.getEmpresasCadastrados().size());
        assertEquals(empresa, cadastro.getEmpresasCadastrados().get(0));
    }
}