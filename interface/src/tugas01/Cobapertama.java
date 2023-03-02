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
public class Cobapertama implements InterfaceA{
    public void methodSatuA(){
        System.out.println("Isi method pertama dari Interface A");
    }
    public String methodDuaA(){
        return atributA;
    }
    public static void main (String []args){
        Cobapertama obj = new Cobapertama();
        obj.methodSatuA();
        String pesan = obj.methodDuaA();
        System.out.println(pesan);
    }
}
