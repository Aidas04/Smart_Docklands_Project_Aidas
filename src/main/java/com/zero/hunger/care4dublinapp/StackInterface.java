/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
    to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to 
    edit this template
 */

package com.zero.hunger.care4dublinapp;

/**
 * 08.03.26
 * @author Aidas Kibas
 * StackInterface.java
 */

/* An Interface class is responsible for providing the methods that will be
used by the application. The methods are declared here but must be given 
function in their designated classes (i.e StackInterface - MyStack). The
application will not compile until all of the declared methods are used.*/

public interface StackInterface {
    
    public void push(Object item);
    public Object pop();
    public Object peek();
    public boolean isEmpty();
    
}
