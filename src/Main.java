/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Chain<String> x= new Chain<>();
        
          System.out.println("Initial size is" + x.size());
          
          if(x.isEmpty())
              System.out.println("The list is empty");
          else System.out.println("The list is not empty");
          
         x.add(0, new String("A"));
         x.add(0, new String("B"));
         x.add(0, new String("C"));
         x.add(0, new String("D"));
         
          System.out.println("List size is" + x.size());
          
          System.out.println("The list is" + x);
          
          int index= x.indexOf(new String"C");
          if(index<0)
              System.out.println("B not found");
          else System.out.println("The index of B is" + index);
          
          System.out.println("Element at 0 is" + x.get(0));
          System.out.println("Element at 3 is" + x.get(3));
          
          System.out.println(x.remove(1) + " removed");
          
          System.out.println("The list is " + x);
          System.out.println(x.remove(2) + " removed");
          System.out.println("The list is " + x);
          
          if(x.isEmpty())
              System.out.println("The lsit is empty");
          else System.out.println("The list is not empty");
          
          System.out.println("List size is" + x.size());
          
          Iterator y=x.iterator();
          System.out.println("The list is");
          while(y.hasNext())
              System.out.println(y.next() + " ");
          System.out.println();
    }
}
