package Singleton.hunger;

import java.util.ArrayList;

public class Company {

    private ArrayList<Staff> list = new ArrayList<>();

    public void addStaff(Staff staff){
        list.add(staff);
    }

    public void showStaff(){
        for (Staff staff :list){
            System.out.println("staff =="+staff.toString());
        }
    }
}
