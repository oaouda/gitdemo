/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osama.hellomockito;

/**
 *
 * @author sam
 */
public class Calculator {
    CalculatorService service;
    
    Calculator(CalculatorService service) {
        this.service = service;
    }
        
    public int perform(int i, int j) {
        return service.add(i,j);
    }
    
}
