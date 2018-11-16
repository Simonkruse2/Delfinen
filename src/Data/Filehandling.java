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
    String inFilename = "members.txt";
    String outFilename = "members.txt";

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
        ArrayList<User> recordList = new ArrayList<>();
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

}
