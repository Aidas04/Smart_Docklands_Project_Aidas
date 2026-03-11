/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zero.hunger.care4dublinapp;

import java.util.ArrayList; // Required to import java.util to allow ArrayList/Stack

/**
 * 09.03.26
 * @author Aidas Kibas
 * MyStack.java
 */
public class MyStack implements StackInterface{ // This class implements the StackInterface class
    
    private ArrayList<Issue> stack = new ArrayList<>(); // Here i declare the ArrayList called Stack
    
    // isEmpty() method returns the stack is empty when called
    public boolean isEmpty(){ 
        return stack.isEmpty();
    }
    
    // peek() uses the get(0) method to get the top element of the stack if not empty
    public Object peek(){
        if(!(stack.isEmpty())){
        return stack.get(0);
        } else{ // If the stack is empty then it will be null - nothing
            return "There are no recently solved records yet...\n";
        }
    }
    
    /* push method uses the add method to the top of the stack ensuring
    the recently solved function is satisfied.
    */
    public void push(Object item){
        
        stack.add(0, (Issue)item);
        
    }
    
    /* The pop method uses remove if the stack is not empty, removing the top
    element. If the stack is empty then it will return null - nothing.*/
    public Object pop(){
        
        if(stack.isEmpty()){
            return null;
        } else{
            return stack.remove(0)+"\n";
        }
    }
    
}
