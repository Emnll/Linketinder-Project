import Models.Candidato
import Models.Empresa

import java.util.Scanner

class Menu{

    static void getMenu(){
        def scanner = new Scanner(System.in)
        int escolha
        TesteInicial teste = new TesteInicial()

        do{
            println("Escolha uma opcao:" +
                    "\n [1] Imprimir Candidatos" +
                    "\n [2] Imprimir Empresas" +
                    "\n [0] Sair do programa ")
            escolha = scanner.nextInt()
            switch(escolha){
                case 1:
                    ArrayList<Candidato> c = teste.getCandidatos()
                    if(c.isEmpty()){
                        print("Nao tem candidatos cadastrados!")
                        break
                    }
                    int i = 1
                    for(Candidato candidato:c){
                        println("$i . $candidato")
                        i++
                    }
                    break
                case 2:
                    ArrayList<Empresa> e = teste.getEmpresas()
                    if(e.isEmpty()){
                        print("Nao tem empresas cadastradas!")
                        break
                    }
                    int i = 1
                    for(Empresa empresa: e){
                        println("$i . $empresa")
                        i++
                    }
                    break
                case 0:
                    print("Ate mais!")
                    scanner.close()
                    break
                default:
                    println("Essa nao e uma opcao")
            }
        }while(escolha != 0)
    }
}
