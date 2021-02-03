/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.mensagem_factory;

import java.util.function.Function;


public class EnviaMensagemEmail extends AbstractEnviaMensagem {

    @Override
    public void envia(String msg) {
        System.out.println("Enviando msg por Email");
    }

    @Override
    public Mensagem<MensagemEmail> newMensagem(String msg) {
         Mensagem<MensagemEmail> me = new Mensagem<MensagemEmail>();
         
    }

    @Override
    public void addMensagem(Function<Conteudo, Object> obtemMsg, String msg) {
        addMensagem(new MensagemEmail(obtemMsg,msg));
    }
    
}
