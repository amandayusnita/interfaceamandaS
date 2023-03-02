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
public class ujibank implements bank {
    public void menabung(){
        System.out.println("menabung");    
    }
    public void transfer(){
        System.out.println("transfer");    
    }
     public void menarik(){
        System.out.println("menarik");    
    }
    public static void main(String[]args){
        ujibank obj = new ujibank();
        obj.menabung();
        obj.transfer();
        obj.menarik();
    }
    
    
    
}
