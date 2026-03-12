/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
    to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to 
    edit this template
 */

package com.zero.hunger.care4dublinapp;

/**
 * 08.03.26
 * @author Aidas Kibas
 * Issue.java
 */

// This is the instantiable class for the environmental issue

public class Issue {
    
    // Data members required for this application
    
    private String name;
    private String issue;
    private int severity;
    private int id;
    private String status;
    
    // Constructor of the data members
    
    public Issue(String name, String issue, int severity, int id, 
            String status){
        
        this.name = name;
        this.issue = issue;
        this.severity = severity;
        this.id = id;
        this.status = status;
        
    }
    
    // Setters - allows for status to change based on pending or resolved issues
    
    public void setStatus(String status){
        this.status = status;
    }
    
    // Getters - allowing for output
    
    public String getName(){
        return name;
    }
    
    public String getIssue(){
        return issue;
    }
    
    public int getSeverity(){
        return severity;
    }
    
    public int getId(){
        return id;
    }
    
    public String getStatus(){
        return status;
    }
    
    /* toString method to be able to display the relevant information onto
    the display area easily */
    
    @Override
    public String toString(){
        return //"----------Record----------\n"+
                "ID: " +id+
                "\nName: " +name+
                "\nIssue: " +issue+
                "\nSeverity: " +severity+
                "\nStatus: " +status+ 
                "\n----------------------------\n";
    }
    
}
