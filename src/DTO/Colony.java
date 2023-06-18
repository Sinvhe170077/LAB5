/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Nguyen Van Si
 */
public class Colony extends Organization{
    protected String place;

    public Colony() {
    }

    

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }

    @Override
    public void communicatebyTool() {
        System.out.println("THE COLONY COMMUNICATE BY SOUND");
    }
    public void enroll() {
        System.out.println("an annual cycle of growth that begins i spring");
    }
    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }
public void grow() {
    System.out.println("an annual cycle of growth that begins in spring");
}
    @Override
    public String toString() {
        return "the colony size is: " + size + ",the colony’s place is: " + place;
    }
    
    
    
}
