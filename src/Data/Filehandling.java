package Data;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Filehandling {

    public static final boolean DEBUG = true;
    String inFilename = "members.txt";
    String outFilename = "members.txt";
    String inFileID = "id.txt";

    public void writeObject(ArrayList<User> members) {
        ObjectOutputStream out = null;
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(inFilename);
            out = new ObjectOutputStream(fout);
            out.writeObject(members);
            out.flush();
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                if (DEBUG) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public ArrayList<User> readObject() {
        ObjectInputStream objectinputstream = null;
        try {
            
            FileInputStream file = new FileInputStream(outFilename);
            objectinputstream = new ObjectInputStream(file);
            ArrayList members =(ArrayList<User>) objectinputstream.readObject();
            
            return members;
            
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } finally {
            try {
                objectinputstream.close();
            } catch (IOException ex) {
                if (DEBUG) {
                    ex.printStackTrace();
                }
            }
        }
        return new ArrayList<User>();
    }
        public void writeWithBufferedWriter(int ID){
        BufferedWriter out = null;
        try {
            File file = new File(inFileID);
            out = new BufferedWriter(new FileWriter(file));
            out.write(ID);
            out.flush();
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
    
    
        public int readWithBufferedReader() {
            int str = 1;
        try {
            File file = new File(inFileID);
            FileReader fr = new FileReader(file);
            BufferedReader in = new BufferedReader(fr);
            str = in.read();
            
        } catch (FileNotFoundException ex) {
            if(DEBUG) ex.printStackTrace();
        } catch (IOException ex) {
            if(DEBUG) ex.printStackTrace();
        }
        return str;
    } 

}
