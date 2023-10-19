package tarefa_anotation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        @tabelaAnotation(tabela = {"diego","pazzini"})
        List<String> nomeTabela = new ArrayList<>();
        nomeTabela.add("Diego");
        nomeTabela.add("Pazzini");
        System.out.println(nomeTabela);

    }
}