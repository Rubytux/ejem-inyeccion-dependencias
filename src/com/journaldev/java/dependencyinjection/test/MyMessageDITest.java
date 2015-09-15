/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.java.dependencyinjection.test;

/**
 *
 * @author rubytux
 */
 
import com.journaldev.java.dependencyinjection.consumer.Consumer;
import com.journaldev.java.dependencyinjection.injector.EmailServiceInjector;
import com.journaldev.java.dependencyinjection.injector.MessageServiceInjector;
import com.journaldev.java.dependencyinjection.injector.SMSServiceInjector;
 
public class MyMessageDITest {
 
    public static void main(String[] args) {
        String msg = "Hola Hernán";
        String correo = "asdf@asdf.com";
        String telefono = "1234567890";
        MessageServiceInjector injector = null;
        Consumer app = null;
         
        
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, correo);
         
        
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, telefono);
    }
 
}
