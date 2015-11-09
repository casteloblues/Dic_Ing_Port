
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31240550
 */
public class Dicionario {
    private ArrayList<LinkedList<HashTable>> conjunto; //conjunto que contera as palavras do dicionario
    private int size;

    public Dicionario(int c) {
        conjunto = new ArrayList<LinkedList<HashTable>>(c);
        
        for (int i = 0; i < c; i++) {
            conjunto.add(new LinkedList<HashTable>());
        }
        size = 0;
    }
    
    public void incluir(Definicao definicao) throws Exception {
        if(checaPalavra(definicao)) {
            throw new Exception("Esta palavra ja existe no dicionario");
            int aux = buscaPalavra(definicao);
            System.out.println(conjunto.get(aux) + " " + conjunto.get(aux));
        }
    }
    
    public int buscaPalavra(Definicao definicao) {
         int busca = definicao.getInitial(definicao);
         return busca;
    }

    private boolean checaPalavra(Definicao definicao) {
        if(conjunto.get(definicao.getInitial(definicao))
                return true;
        else
            return false;
    }
    
}
