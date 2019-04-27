package Singleton.lazy;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private LazySingleton(){
        System.out.println("LazySingleton is created");
    }

    /**
     * 当遇到多线程时，懒汉式大概率会失效，会得到多个实体对象，不能够保证实体对象的唯一性
     * @return
     */
    public static  LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 优点 synchronized  能够保证  在多线程加载时，保证线程安全
     *
     * 缺点 每次加载时  都会加锁，降低效率
     * @return
     */
    public static synchronized LazySingleton getInstance1(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
