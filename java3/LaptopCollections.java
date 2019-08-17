/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sample;

/**
 *
 * @author HP
 */
import java.util.*;
public class LaptopCollections {
    public static void main(String[] args){
        List<Fruits> ar=new ArrayList<Fruits>();
        Fruits f1=new Fruits(1,"Apple",20);
        Fruits f2=new Fruits(2,"Orange",80);
        Fruits f3=new Fruits(3,"Cocoa",50);
        ar.add(f1);
        ar.add(f2);
        ar.add(f3);
        Iterator<Fruits> itr=ar.iterator();
        while(itr.hasNext()){
            //Fruits temp=itr.next();
            //System.out.println(temp.id+" "+temp.name+" "+temp.price);
            System.out.println(itr.next());
        }
        Collections.sort(ar,new SortById());
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
class Fruits implements Comparable<Fruits>{
        int id;
        String name;
        float price;
        Fruits(int id,String name,float price){
            this.id=id;
            this.name=name;
            this.price=price;
        }
        public String toString(){
            return this.id+" "+this.name+" "+this.price;
        }
        
        @Override 
            public int compareTo(Fruits f){
                //return (int)(this.price-f.price);
                return this.name.compareTo(f.name);
            }
}
class SortByPrice implements Comparator<Fruits>{
    @Override
    public int compare(Fruits f1,Fruits f2){
        return (int)(f1.price-f2.price);
    }
}
class SortByName implements Comparator<Fruits>{
    @Override
    public int compare(Fruits f1,Fruits f2){
        return f1.name.compareTo(f2.name);
    }
}
class SortById implements Comparator<Fruits>{
    @Override
    public int compare(Fruits f1,Fruits f2){
        return (f2.id-f1.id);
    }
}
