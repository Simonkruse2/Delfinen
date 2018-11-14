/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen;

import Data.DataHandling;
import Data.Filehandling;
import Data.User;

/**
 *
 * @author simon
 */
public class Delfinen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Tunnelsnakes rule!");
         Filehandling f = new Filehandling();
         User u = new User("a", "a", "a", "a", 201291, 99, false, true, true);
         DataHandling d = new DataHandling();
         d.addUser();
         f.writeObject(d.getJuniorElite());
         System.out.println(f.readObject());
         
    }
  
}
