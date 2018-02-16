/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author mdeme
 */
public class PalavraReservada_Posicao {
    private PalavraReservada palavraReservada;
    private int linha, coluna;

    public PalavraReservada_Posicao() {
    }

    public PalavraReservada_Posicao(PalavraReservada palavraReservada, int linha, int coluna) {
        this.palavraReservada = palavraReservada;
        this.linha = linha;
        this.coluna = coluna;
    }

    public PalavraReservada getPalavraReservada() {
        return palavraReservada;
    }

    public void setPalavraReservada(PalavraReservada palavraReservada) {
        this.palavraReservada = palavraReservada;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    @Override
    public String toString() {
        return "PalavraReservada_Posicao{linha=" + linha + ", coluna=" + coluna + '}';
    }
    
}
