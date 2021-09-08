
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mafe
 */
public class ParkingSpots  <T extends Comparable<T> > {
    
    private CircularDoubleList<Vehicle> List;
    
    private Node Current ;

    
    public ParkingSpots(){
        
        List=new CircularDoubleList<Vehicle>();

        for(int i=0;i<10;i++){

            Vehicle slot=null;
            
            List.add(slot);
        } 
    } 

    public CircularDoubleList<Vehicle> getList() {
        return List;
    }

    public void setList(CircularDoubleList<Vehicle> list) {
        this.List = list;
    }

    public Node getCurrent() {
        return Current;
    }

    public void setCurrent(Node Current) {
        this.Current = Current;
    }
    
    
    
}
