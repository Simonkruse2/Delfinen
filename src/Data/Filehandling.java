package Data;

import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Filehandling {
    
    public static final boolean DEBUG = true;
    String inFilename = "C:\\Users\\simon\\Documents\\NetBeansProjects\\Delfinen\\files\\teams.txt";
    String outFilename = "C:\\Users\\simon\\Documents\\NetBeansProjects\\Delfinen\\files\\teams.txt";
    
    public void writeObject(ArrayList<User> juniorElite){
        ObjectOutputStream out = null;
        try {
            System.out.println(juniorElite);
            File file = new File(outFilename);
            out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(juniorElite);
            out.flush();
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                if(DEBUG) ex.printStackTrace();
            }
        }
    }
    public ArrayList<User> readObject(){
        ObjectInputStream in = null;
        try {
            File file = new File(outFilename);
            in = new ObjectInputStream(new FileInputStream(file));
            ArrayList juniorElite = (ArrayList<User>) in.readObject();
            return juniorElite;
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException ex) {
                if(DEBUG) ex.printStackTrace();
            }
        }
        return new ArrayList<User>();
    }
    
}
