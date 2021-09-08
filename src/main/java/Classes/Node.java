package Classes;

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
    
    private T car;
    private Node<T> next;
    private Node<T> previuos;

    public Node<T> getPreviuos() {
        return previuos;
    }

    public void setPreviuos(Node<T> previuos) {
        this.previuos = previuos;
    }
    

    public Node(T car, Node<T> next) {
        this.car = car;
        this.next = next;
    }

    public T getCar() {
        return car;
    }

    public void setCar(T car) {
        this.car = car;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    public String showInformation(){
        
        return car.toString();
    }
    
    
    
    
    

}
