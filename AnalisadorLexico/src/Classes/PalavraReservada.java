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
public class PalavraReservada {
    
    private String token, identificacao;

    public PalavraReservada() {
    }

    public PalavraReservada(String token, String identificacao) {
        this.token = token;
        this.identificacao = identificacao;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "PalavraReservada{" + "token=" + token + ", identificacao=" + identificacao + '}';
    }
}
