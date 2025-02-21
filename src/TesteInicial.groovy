import Models.Candidato
import Models.Empresa

/*No teste inicial ser�o criados alguns objetos candidatos e empresa a fim
* de se testar as funcionalidades*/
class TesteInicial {
    def candidatos = new ArrayList()
    def empresas = new ArrayList()


    TesteInicial(){
        empresas.add(new Empresa("Batatinhas Donalds", "BDFood@gmail.com", "Parana","21839-2820","Fast-Food de batatinhas!", "97694052000147", "Brasil", ["Web Crawler", "Java"]))
        empresas.add(new Empresa("NASA", "NASA@yahoo.com", "Alagoas","57075-292","A NASA so que no brasil", "87538703000156", "Brasil", ["Astrofisica", "Calculo Numerico", "MatLab"]))
        empresas.add(new Empresa("Acaraje Quente", "AQ@outlook.com", "Bahia","41306-775","O quente e de pimenta!", "45795787000163", "Brasil", ["Gastronomia"]))
        empresas.add(new Empresa("Suco de Aracaju", "AS@gmail.com", "Sergipe","49075-530","O melhor do Brasil!", "18013336000154", "Brasil", ["Quimica"]))
        empresas.add(new Empresa("Madeira Madeira", "MMMoveis@gmail.com", "Acre","69900-196","Voce ja conhece a gente", "31093487000128", "Brasil", ["Marcenaria"]))

        candidatos.add(new Candidato("Manuela Carvalho Rodrigues", "ManuelaCR@gmail.com", "Sao Paulo","18402-100","Em busca de uma oportunidade", 76, "93693155356", ["Astrofisica", "Gastronomia"]))
        candidatos.add(new Candidato("Kauan Pereira Correia", "KPC@yahoo.com", "Alagoas","93334-300","Eu amo trabalhar com musica", 37, "82548563030", ["Java", "React"]))
        candidatos.add(new Candidato("Leila Barbosa Cavalcanti", "LeilaBarbosaCavalcanti@dayrep.com", "Bahia","45203-330","Escrevi o livro o significado das flores", 20 , "45179512514", ["Administracao", "Gestao"]))
        candidatos.add(new Candidato("Joao Cardoso Fernandes", "JoaoCardoso@gmail.com", "Sao Paulo","19901-714", "O melhor do Brasil!", 46 , "52403287733", ["Musica", "Violino"]))
        candidatos.add(new Candidato("Igor Cunha Dias", "IgorCunhaDias@armyspy.com", "Sao Paulo","69900-196","Voce ja me conhece", 55 , "91515878821", ["Neurocirurgia"]))
    }

    ArrayList<Candidato> getCandidatos(){
        return candidatos
    }

    ArrayList<Empresa> getEmpresas(){
        return empresas
    }

}
