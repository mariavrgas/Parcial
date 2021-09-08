/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe

 */
public class CircularDoubleList <T extends Comparable<T> > implements IListable<T> {
    
    private Node<T> first;
    private Node<T> next;
    private Node<T> Previous;
    Node<T> current;
    private Vehicle c; 



    public CircularDoubleList(){
    } 
    
    // GET AND SET
    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return Previous;
    }

    public void setPrevious(Node<T> Previous) {
        this.Previous = Previous;
    }
    
    public Node<T> getCurrent() {
        return current;
    }

    public void setCurrent(Node<T> current) {
        this.current = current;
    }
    
    public void print(){
        
        Node now = getFirst();
        
        while (now != null){
            
            System.out.println("Marca: "+now.getCar().getBrand()+"Placa: "+now.getCar().getPlaque());     
        }
            
    }

    public Vehicle getC() {
        return c;
    }

    public void setC(Vehicle c) {
        this.c = c;
    }


    void add(Vehicle slot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    


    
    
    
    
    
    
}
