/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas01;

/**
 *
 * @author hp
 */
public class Cobakedua implements InterfaceA {
    public void methodSatuA (){
    System.out.println("isi method pertama dari interface B");
}
    public String methodDuaA(){
        return atributA;
    }
    public void methodSatuB(){
        System.out.println("isi  method pertama dari interface B");
    }
    public void methodDuaB(){
        System.out.println("isi method kedua dari interface B");
    }
    public static void main (String[]args){
        Cobakedua obj = new Cobakedua();
        String pesan = obj.methodDuaA();
        System.out.println(pesan);
        obj.methodSatuA();
        obj.methodSatuB();
        obj.methodDuaB();
    }
}
