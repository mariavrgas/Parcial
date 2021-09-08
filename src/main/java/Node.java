/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mafe
 */
public class Node<T extends Comparable>{
    
    private Vehicle car;
    private Node<T> next;

    public Node(Vehicle car, Node<T> next) {
        this.car = car;
        this.next = next;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    
    
    
    

}
