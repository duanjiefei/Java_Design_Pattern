package Prototype;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig = new Pig();
        pig.setName("peiqi");
        pig.setDate(date);

        System.out.println(pig);


        Pig pig2 = (Pig) pig.clone();
        date.setTime(1000L);
        pig2.setDate(date);
        pig2.setName("nv peiqi");
        System.out.println(pig2);
    }
}
