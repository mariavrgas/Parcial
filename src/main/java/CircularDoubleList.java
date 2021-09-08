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

    public int size = 0;
    
    


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
        
        CircularDoubleList<Vehicle> newCar = new CircularDoubleList<Vehicle>();
       
        Node<T> node = new Node(slot);
        
        Node current = getFirst();
        
        if (this.first == null){
            this.first  = ;
        }
        
        /*public void add(String name , int age){
        
       Students student = new Students(name,age);
               
       Node node = new Node(student);
       
       Node recent = getHead();
       
       if (this.head == null){
           this.head = node; 
       }else {
           Node last = getHead();
           
           while(last.getNext() != null){
                last = last.getNext();
            }

            last.setNext(node);
       }*/
    }

    

    
    
    


    
    
    
    
    
    
}
