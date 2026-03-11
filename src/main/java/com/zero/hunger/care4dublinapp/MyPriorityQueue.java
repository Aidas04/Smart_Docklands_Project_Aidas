/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zero.hunger.care4dublinapp;

import java.util.ArrayList; // Importing ArrayList

/**
 * 09.03.26
 * @author Aidas Kibas
 * MyPriorityQueue.java
 */

public class MyPriorityQueue implements PQInterface{ // Ensuring MyPriorityQueue implements PQInterface
 
    private ArrayList<Issue> pq = new ArrayList<>(); // Creating a ArrayList called pq
    
    /* The insert method adds the issue to the Priority Queue.*/
    
    public void insert(Object item){
        pq.add((Issue) item);
    }
    
    /* The isEmpty method returns the empty Priority Queue.*/
    
    public boolean isEmpty(){
        return pq.isEmpty();
    }
    
    /* The peek method checks if the pq is NOT empty thus getting the first 
    element in the pq. Otherwise returns null.*/
    
    public Object peek(){
        if(!(pq.isEmpty())){
            return pq.get(0);
        } else{
            return null;
        }
    }
    
    /* The removeHighest method checks if the pq is empty, thus returning null. 
    Otherwise i created an int variable called highest that is empty. Then a 
    for loop iterates the pq and if the current issues severity is higher than
    the severity of the int highest, then highest is the issue with the highest 
    severity. Then the highest issue is removed.*/
    
    public Object removeHighest(){
        if(pq.isEmpty()){
            return null;
        }
        
        int highest = 0;
        
        for(int i = 1; i<pq.size(); i++){
            if(pq.get(i).getSeverity() > pq.get(highest).getSeverity()){
                highest = i;
            }
        }
        return pq.remove(highest);
    }
    
    /* The display method checks if the pq is empty thus returning an error.
    Otherwise i created a msg variable that loops the pq and converts all
    issues into strings to ensure they can be displayed on the display area.*/
    
    public String display(){
        if(pq.isEmpty()){
            return "There are no records in the Priorty queue...\n";
        }
        
        String msg = "";
        
        for (Issue i : pq){
            msg += i.toString() + "\n";
        }
        
        return msg;
    }
}
