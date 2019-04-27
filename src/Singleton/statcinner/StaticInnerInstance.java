package Singleton.statcinner;


public class StaticInnerInstance {

    private StaticInnerInstance(){

    }

    private StaticInnerInstance getInstance(){
        return InstanceHolder.innerInstance;
    }

    /**
     * 静态内部类  里的成员变量在开始时并不会被初始化
     *
     * StaticInnerInstance 初始化时并不会加载innerInstance  对象
     *
     *只有当调用 StaticInnerInstance.getInstance（）时才会被创建  ，保证了延迟加载单列
     */
    static class InstanceHolder {
        public static final StaticInnerInstance innerInstance = new StaticInnerInstance();
    }
}
