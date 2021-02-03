/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.mensagem_factory;

import java.util.function.Function;

/**
 *
 * @author Jamylle
 */
class MensagemEmail extends AbstractMensagem{
    public MensagemEmail(String msg) {
        super(msg);
    }
    
    @Override
    public void enviar() {
        System.out.println("Mensagem enviada por Email");
        System.out.println(msg);
    }
}
