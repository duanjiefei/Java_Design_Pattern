package Singleton.hunger;



public class HungerSingletonTesr {
    public static void main(String[] args) {
        Company company = new Company();

        CEO ceo = CEO.getCeo();
        CEO ceo1 = CEO.getCeo();


        company.addStaff(ceo);
        company.addStaff(ceo1);

        Worker worker = new Worker();
        Worker worker1 = new Worker();

        company.addStaff(worker);
        company.addStaff(worker1);

        VP vp = new VP();
        VP vp1 = new VP();

        company.addStaff(vp);
        company.addStaff(vp1);

        company.showStaff();


/*
        staff ==Singleton.hunger.CEO@5e481248  静态对象的唯一性
        staff ==Singleton.hunger.CEO@5e481248
        staff ==Singleton.hunger.Worker@66d3c617
        staff ==Singleton.hunger.Worker@63947c6b
        staff ==Singleton.hunger.VP@2b193f2d
        staff ==Singleton.hunger.VP@355da254
*/



    }
}
