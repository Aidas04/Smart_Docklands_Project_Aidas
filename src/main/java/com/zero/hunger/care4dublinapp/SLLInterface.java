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
 * SLLInterface.java
 */

/* An Interface class is responsible for providing the methods that will be
used by the application. The methods are declared here but must be given 
function in their designated classes (i.e StackInterface - MyStack). The
application will not compile until all of the declared methods are used.*/

public interface SLLInterface {
    
    public void insert(Object item);
    public boolean delete(int id);
    public void update(int id, Object item);
    public Object search(int id);
    public String displayAll();
    public boolean isEmpty();
    
}
