package Data;

import java.util.ArrayList;

public class DataHandling {

    ArrayList<User> JuniorElite = new ArrayList<>();
    

    public void addUser() {
        User u = new User("a", "a", "a", "a", 201291, 99, false, true, true);
        JuniorElite.add(u);
        System.out.println("Brugeren er tilføjet, yo");
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

    public ArrayList<User> getJuniorElite() {
        return JuniorElite;
    }
}
