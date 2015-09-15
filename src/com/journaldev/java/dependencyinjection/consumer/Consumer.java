/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.java.dependencyinjection.consumer;

/**
 *
 * @author rubytux
 */
public interface Consumer {
    
    void processMessages(String msn, String rec);
}
