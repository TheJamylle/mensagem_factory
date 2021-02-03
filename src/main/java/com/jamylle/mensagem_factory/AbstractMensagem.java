/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.mensagem_factory;

import java.util.function.Function;


public class AbstractMensagem implements Mensagem {
    String msg;
    private Function<Conteudo, Object> obtemMsg;
    
    public AbstractMensagem(Function<Conteudo, Object> obtemMsg, String msg) {
        this.msg = msg;
        this.obtemMsg = obtemMsg;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem enviada");
    }
    
}
