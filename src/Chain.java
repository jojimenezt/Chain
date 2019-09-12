/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class Chain<String> implements LinearList<String>,Iterable<String>{
    protected ChainNode<String> firstNode;
    protected int size;
    
    public Chain(){
        firstNode=null;
        size=0;
    }
    
    /*public Chain(ChainNode<String> firstNode, int size) {
        this.firstNode = firstNode;
        this.size = size;
    }*/
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public int size(){
        return size;
    }
    
    void checkIndex(int index){
        if (index<0||index>=size) {
            throw new IndexOutOfBoundsException("index = "+index+"  size = "+size);
        }
    }
    
    public String get(int index){
        
    }
    
    public int indexOf(String theElement){
        ChainNode<String> currentNode=firstNode;
        int index=0;
        while(currentNode !=null && !currentNode.element.equals(theElement)){
            currentNode=currentNode.next;
            index++;
        }
        if (currentNode==null) 
            return -1;
        else 
            return index;
    }
    
    public String remove(int index){
        
    }
    
    public void add(int index,String theElement){
        
    }
    
    public String toString(){
        StringBuilder s=new StringBuilder("[");
        for (String x : this) {
            s.append(Objects.toString(x)+", ");
        }
        
        if (size>0)
            s.setLength(s.length()-2);
        
        s.append("]");
    }
    
    public Iterator<String> iterator(){
        return new ChainIterator();
    }
    
    private class ChainIterator implements Iterator<String>{
        private ChainNode<String> nextNode;
        public ChainIterator(){
            nextNode=firstNode;
        }
        
        public boolean hasNext(){
            return nextNode!=null;
        }
        
        public String next(){
            if (nextNode!=null) {
                String elementToReturn=nextNode.element;
                nextNode=nextNode.next;
                return elementToReturn;
            }else{
                throw new NoSuchElementException("No next element");
            }
        }
        
        public void remove(){
            throw new UnsupportedOperationException("remove not supported");
        }
    }
    
    public static void main(String[] args) {
        
    }
}
