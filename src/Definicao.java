/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31240550
 */
public class Definicao {
    private String palavra; //palavra original em ingles
    private String trad; //traducao da palavra
    
    Definicao() {
        palavra = null;
        trad = null;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getTrad() {
        return trad;
    }

    public void setTrad(String trad) {
        this.trad = trad;
    }
    
    public int getInitial(Definicao definicao) {
        return definicao.getPalavra().charAt(0)%26;
    }
}
