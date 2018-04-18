/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisaocomatosdefala.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author tatia
 */
public class Mensagem {

    private String msgId;
    private String mensagem;
    private LocalDateTime datahora;
    private String de;
    private String para;
    private List<Verbo> verbos;
	
    
    public Mensagem() {
	}
    
    public Mensagem(String msgId, String mensagem) {
		super();
		this.msgId = msgId;
		this.mensagem = mensagem;
	}

	/**
     * @return the datahora
     */
    public LocalDateTime getDatahora() {
        return datahora;
    }

    /**
     * @param datahora the datahora to set
     */
    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }



    /**
     * @return the verbos
     */
    public List<Verbo> getVerbos() {
        return verbos;
    }

    /**
     * @param verbos the verbos to set
     */
    public void setVerbos(List<Verbo> verbos) {
        this.verbos = verbos;
    }

    /**
     * @return the msgId
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * @param msgId the msgId to set
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
}
