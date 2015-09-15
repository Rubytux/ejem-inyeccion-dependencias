/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journaldev.java.dependencyinjection.injector;

import com.journaldev.java.dependencyinjection.consumer.Consumer;
/**
 *
 * @author rubytux
 */
public interface MessageServiceInjector {
    
    public Consumer getConsumer();
}
