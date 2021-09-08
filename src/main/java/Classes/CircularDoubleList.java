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
public class CircularDoubleList<T> implements IListable<T> {
    
    private Node first;
    private Node last;
    private Node thisOne;
    


    private int size = 0;
    
    


    public CircularDoubleList(){
    } 
    
    // GET AND SET
     void add(Vehicle slot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node getThisOne() {
        return thisOne;
    }

    public void setThisOne(Node thisOne) {
        this.thisOne = thisOne;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
 
    /*public void print(){
        
        Node now = getFirst();
        
        while (now != null){
            
            System.out.println("Marca: "+now.getCar().getBrand()+"Placa: "+now.getCar().getPlaque());     
        }}*/
    
    public String print() {

        Node current = first;
        String result = "";

        do{
            result += current.showInformation() + "\n";
            current = current.getNext();
        }while (current != first);

        return result;

    }
 
    public void add(Node node){
        
        Node current = first;
        
        if (first == null){
           
            first = node;
            last = node;
            last.setNext(first);
            last.setPreviuos(node);
        }else {
            last.setNext(node);
            node.setNext(first);
            node.setPreviuos(last);
            last=node;
            first.setPreviuos(last);        
            }}

   
}

    

    


