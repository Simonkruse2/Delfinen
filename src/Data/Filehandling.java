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

/**
 *
 * @author Renz Oliver De Chavez, Vincent Tran, Jacob Hildebrandt & Simon
 * Kristopher Kruse Bentzen.
 */
public class Filehandling {

    /**
     * Pathdirectory to our .txt files.
     */
    public static final boolean DEBUG = true;
    String inFilename = "members.txt";
    String outFilename = "members.txt";
    String inFilenameRestance = "restance.txt";
    String outFilenameRestance = "restance.txt";
    String inFilenameJuniorTeams = "juniorTeams.txt";
    String outFilenameJuniorTeams = "juniorTeams.txt";
    String inFilenameSeniorTeams = "seniorTeams.txt";
    String outFilenameSeniorTeams = "seniorTeams.txt";
    String inFileID = "id.txt";

    /**
     *
     * @param members - Writes object, in ArrayList form, to .txt file
     * containing user.
     */
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

    /**
     *
     * @return ArrayList<User> containing all objects from .txt.
     */
    public ArrayList<User> readObject() {
        ObjectInputStream objectinputstream = null;
        try {

            FileInputStream file = new FileInputStream(outFilename);
            objectinputstream = new ObjectInputStream(file);
            ArrayList members = (ArrayList<User>) objectinputstream.readObject();

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

    /**
     *
     * @param members - writes
     */
    public void writeObjectRestance(ArrayList<User> members) {
        ObjectOutputStream out = null;
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(inFilenameRestance);
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

    /**
     *
     * @return
     */
    public ArrayList<User> readObjectRestance() {
        ObjectInputStream objectinputstream = null;
        try {

            FileInputStream file = new FileInputStream(outFilenameRestance);
            objectinputstream = new ObjectInputStream(file);
            ArrayList restance = (ArrayList<User>) objectinputstream.readObject();

            return restance;

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

    /**
     *
     * @param ID
     */
    public void writeWithBufferedWriter(int ID) {
        BufferedWriter out = null;
        try {
            File file = new File(inFileID);
            out = new BufferedWriter(new FileWriter(file));
            out.write(Integer.toString(ID));
            out.flush();
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

    /**
     *
     * @return
     */
    public int readWithBufferedReader() {
        String str;
        try {
            File file = new File(inFileID);
            FileReader fr = new FileReader(file);
            BufferedReader in = new BufferedReader(fr);
            str = in.readLine();
            return Integer.parseInt(str);
        } catch (FileNotFoundException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        } catch (IOException ex) {
            if (DEBUG) {
                ex.printStackTrace();
            }
        }
        return 0;
    }

    public void juniorWriteObjectTeams(ArrayList<User> juniorTeams) {
        ObjectOutputStream out = null;
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(inFilenameJuniorTeams);
            out = new ObjectOutputStream(fout);
            out.writeObject(juniorTeams);
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

    /**
     *
     * @return
     */
    public ArrayList<User> juniorReadObjectTeams() {
        ObjectInputStream objectinputstream = null;
        try {

            FileInputStream file = new FileInputStream(outFilenameJuniorTeams);
            objectinputstream = new ObjectInputStream(file);
            ArrayList juniorTeams = (ArrayList<User>) objectinputstream.readObject();

            return juniorTeams;

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
    
     public void seniorWriteObjectTeams(ArrayList<User> seniorTeams) {
        ObjectOutputStream out = null;
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(inFilenameSeniorTeams);
            out = new ObjectOutputStream(fout);
            out.writeObject(seniorTeams);
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

    /**
     *
     * @return
     */
    public ArrayList<User> seniorReadObjectTeams() {
        ObjectInputStream objectinputstream = null;
        try {

            FileInputStream file = new FileInputStream(outFilenameSeniorTeams);
            objectinputstream = new ObjectInputStream(file);
            ArrayList seniorTeams = (ArrayList<User>) objectinputstream.readObject();

            return seniorTeams;

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
