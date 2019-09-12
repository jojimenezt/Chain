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
    
    void CheckIndex(int index){
        if (index<0||index>=size) {
            throw new IndexOutOfBoundsException("index = "+index+"  size = "+size);
        }
    }
    
    public String get(int index){
        checkIndex(index)
    }
    
    public int indexOf(String theElement){
        
    }
    
    public String remove(int index){
        
    }
    
    public void add(int index,String theElement){
        
    }
    
    public String toString(){
        
    }
    
    public Iterator<String> iterator(){
        
    }
    
    private class ChainIterator implements Iterator<String>{
        
    }
    
    public static void main(String[] args) {
        
    }
}
