package Singleton.hunger;

public class CEO extends Staff {
    /**
     * 作为静态的成员变量  在声明的时候已经初始化，这样就保证了对象的唯一性
     */
    private static CEO ceo = new CEO();

    /**
     * 将构造函数私有化  是单列的主要条件
     */
    private CEO(){

    }

    /**
     * 公有的静态函数，暴露 对外获取静态对象的接口
     * @return
     */
    public static CEO getCeo(){
        return ceo;
    }
}
