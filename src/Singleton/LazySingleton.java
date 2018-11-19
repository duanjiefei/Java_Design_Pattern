package Singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private LazySingleton(){
        System.out.println("LazySingleton is created");
    }

    /**
     * 当遇到多线程时，懒汉式大概率会失效，会得到多个实体对象，不能够保证实体对象的唯一性
     * @return
     */
    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
