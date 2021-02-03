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
    public MensagemEmail(Function<Conteudo, Object> obtemMsg, String msg) {
        super(obtemMsg, msg);
    }
    
    
}
