/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
    to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to 
    edit this template
 */

package com.zero.hunger.care4dublinapp;

import java.util.ArrayList; // Importing ArrayList

/**
 * 09.03.26
 * @author Aidas Kibas
 * MyQueue.java
 */

public class MyQueue implements QueueInterface{ /* Ensuring MyQueue implements 
    QueueInterface allowing the methods from that class.*/

    private ArrayList<Issue> queue = new ArrayList<>(); /* Creating an 
    ArrayList called queue.*/
    
    /* Here the enqueue method will add the issue and add it to the rear of the
    queue.*/
    
    public void enqueue(Object item){    
        queue.add((Issue) item);       
    }
    
    /* Here the dequeue method checks if the queue is NOT empty, thus removing
    the first item in the queue. Otherwise it returns null.*/
    
    public Object dequeue(){
        if(!(queue.isEmpty())){
            return queue.remove(0);
        } else{
            return null;
        }
    }
    
    /* Here the peek method also checks if the queue is NOT empty, thus getting
    the first element in the queue (not removing). Otherwise return null.*/
    
    public Object peek(){
        if(!(queue.isEmpty())){
            return queue.get(0);
        } else{
            return null;
        }
    }
    
    /* Here the isEmpty method returns the empty queue.*/
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    /* Here the display method checks if the queue is empty, thus returning
    the error message. Then a String msg is declared as empty String and the 
    code loops the issues and converts them to a string allowing it to be 
    displayed on the display area easily.*/
    
    public String display(){
        if(queue.isEmpty()){
            return "There are no records in the queue...\n";
        }
        
        String msg = "";
        
        for (Issue i : queue){
            msg += i.toString() + "\n";
        }
        
        return msg;
        
    }
}
