/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.java.dependencyinjection.consumer;

import com.journaldev.java.dependencyinjection.service.MessageService;
/**
 *
 * @author rubytux
 */
public class MyDIApplication implements Consumer {

    private MessageService service;
    
    public MyDIApplication(MessageService svc ){
        this.service = svc;
    }
    @Override
    public void processMessages(String msn, String rec) {
        this.service.sendMessage(msn, rec);
    }
    
}
