/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author itamar.souza
 */
public class Aluno {
     long controle;	
     String ra;	 
     String nome;	
     String endereco;	
     String cidade;

    /**
     * @return the controle
     */
    public long getControle() {
        return controle;
    }

    /**
     * @param controle the controle to set
     */
    public void setControle(long controle) {
        this.controle = controle;
    }

    /**
     * @return the ra
     */
    public String getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(String ra) {
        this.ra = ra;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
