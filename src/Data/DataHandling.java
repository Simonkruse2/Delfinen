package Data;

import java.util.ArrayList;

public class DataHandling {

    //Flyttes til medlemscontroller
    private ArrayList<User> members = new ArrayList<>();
    private int id;
    
    public DataHandling(){
        Filehandling f = new Filehandling();
        id = f.readWithBufferedReader();
        members = f.readObject();
    }

    public void addUser(User user) {
        members.add(user);
    }

    public void removeUser(User user) {
        members.remove(user);
    }

    public ArrayList<User> getMembers() {
        return members;
    }
    
    public int addID(){
        return id;
    }
}


//    
//    public void removeOrder(){
//        try{
//        int cPizza = ui.choosePizza();
//        if(!orderList.contains(Integer.valueOf(cPizza))){
//            ui.printMessage("Dette pizza nummer er ikke i bestillinger..");
//            return;
//        }
//            try{
//                new FileHandling().writeToFile("salg.txt", cPizza+"");
//            }catch(IOException e){
//                ui.printMessage("Der opstod en fejl..");
//                removeOrder();
//            }
//        orderList.remove(Integer.valueOf(cPizza));
//        ui.printMessage("Bestilling fjernet og tilføjet til salgs liste..");
//        }catch(NumberFormatException e){
//            removeOrder();
//        }
//    }
//    
//    public ArrayList<Integer> getOrders(){
//        return orderList;
//    }
