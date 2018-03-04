/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osama.hellomockito;

import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


/*
 * @author sam
 */
public class CalculatorTest extends TestCase {
    
    Calculator calculator = null;
        
  
      
  
  
    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
    @Mock
    CalculatorService service;
    
    //CalculatorService service = mock(CalculatorService.class);
    
    public CalculatorTest(String testName) {
        super(testName);
        
    }
    
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator(service);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    @Test
    public void testAdd() {
        when (service.add(2,3)).thenReturn(5);
        assertEquals(5, calculator.perform(2,3));
        verify(service).add(2, 3);        
    }
}
