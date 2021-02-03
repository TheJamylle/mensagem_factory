/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.mensagem_factory;

import java.util.function.Function;


public class EnviaMensagemEmail extends AbstractEnviaMensagem {

    @Override
    public Mensagem envia(String msg) {
        return new MensagemEmail(msg);
    }
    
}
