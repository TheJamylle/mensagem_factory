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
public interface EnviaMensagem {
    public void envia(String msg);
    public void newMensagem(String msg);
    void addMensagem(Function<Conteudo,Object> obtemMsg, String msg);
}
