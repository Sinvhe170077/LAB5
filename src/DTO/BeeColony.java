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
public class BeeColony extends Colony implements  Role{

   private String type;

    public BeeColony() {
    }

    public BeeColony(int size,String place, String type ) {
        super(place, size);
        this.type = type;
    }

    

    

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony’s type is " + type + ", size is about " + size + ", and the place is  "+ place;
    }

    @Override
    public void createWork() {
        System.out.println("Worker bees perform all the work of the bees");
    }

 
    
}
