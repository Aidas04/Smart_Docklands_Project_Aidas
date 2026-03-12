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
 * MySLL.java
 */

public class MySLL implements SLLInterface{ /* Ensuring MySLL implements 
    SLLInterface which allows the methods from that class.*/

    private ArrayList<Issue> sll = new ArrayList<>(); /*\ Creating an ArrayList 
    called sll.*/
    
    // isEmpty method returns the empty sll
    
    public boolean isEmpty(){
        return sll.isEmpty();
    }
    
    // Insert method adds the issue into the Sll
    
    public void insert(Object item){
         sll.add((Issue) item);
     }
     
    /* The delete method takes id as its parameter and loops through the
    sll individually checking to ensure that the id matches the id of the issue
    if this is the case then it is removed and true is returned, else its 
    false.*/
    
    public boolean delete(int id){
         for(int i = 0; i < sll.size(); i++){
             if(sll.get(i).getId() == id){
                 sll.remove(i);
                 return true;
             }
         }
         return false;
     }
    
    /* The update method takes id and item as the parameters. It loops through
    the sll individually, it checks if the id matches the stored id
    then it sets the updated issue with the new object.*/
     
     public void update(int id, Object item){
         for(int i = 0; i < sll.size(); i++){
             if(sll.get(i).getId() == id){
                 sll.set(i, (Issue) item);
                 return;
             }
         }
     }
     
     /* The search method takes id as its parameter. It returns the issue from
     the sll if the id is matched. Else its null.*/ 
     
     public Object search(int id){
         for(Issue i : sll){
             if(i.getId() == id){
                 return i;
             }
         }
         return null;
     }
     
     /* The displayAll method checks if the sll is empty, thus returning an 
     error message.
     Otherwise a msg variable is declared and the loop iterates all the sll
     items returning them as strings to be displayed in the display area.*/
     
     public String displayAll(){
         if(sll.isEmpty()){
             return "There are no records yet...\n";
         }
         
         String msg = "";
         
         for(Issue i : sll){
             msg += i.toString() + "\n";
         }
         return msg;
     }
}
