/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas02;

/**
 *
 * @author hp
 */
public class ujisuperhero implements superhero {
    public void superman(){
        System.out.println("superman");    
    }
    public void spiderman(){
        System.out.println("spiderman");    
    }
     public void thor(){
        System.out.println("thor");    
    }
    public static void main(String[]args){
        ujisuperhero obj = new ujisuperhero();
        obj.superman();
        obj.spiderman();
        obj.thor();
    }
    
    
    
}
