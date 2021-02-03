/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamylle.mensagem_factory;

/**
 *
 * @author Jamylle
 */
public class Principal {
    public static void main(String[] args) {
        Mensagem ms = new MensagemEmail("Heyy");
        ms.enviar();
        
        Mensagem mn = new MensagemNotificacao("Testandoo");
        mn.enviar();
    }
}
