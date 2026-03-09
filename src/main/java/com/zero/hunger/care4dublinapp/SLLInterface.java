/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zero.hunger.care4dublinapp;

/**
 * 08.03.26
 * @author Aidas Kibas
 * SLLInterface.java
 */
public interface SLLInterface {
    
    public void insert(Object item);
    public boolean delete(int id);
    public void update(int id, Object item);
    public Object search(int id);
    public String displayAll();
    public boolean isEmpty();
    
}
