/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zero.hunger.care4dublinapp;

/**
 *
 * @author User
 */
public interface QueueInterface {
    
    public void enqueue(Object item);
    public Object dequeue();
    public Object peek();
    public boolean isEmpty();
    public String display();
    
}
