/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.java.dependencyinjection.service;

/**
 *
 * @author rubytux
 */
public class EmailServiceImpl implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Correo enviado a: " + rec + " con Mensaje: " + msg);
    }
    
    
}
