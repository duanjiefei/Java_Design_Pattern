package FactoryMethod.FactoryMethod_;


/**
 *
 *
 * 工厂方法
 *
 * 工厂的抽象类，产品的生产由具体的工厂去实现
 */
public abstract class Factory {
    /**
     * 工厂方法
     * @param clz
     * @return
     */
    public abstract Video produceVideo(Class clz);



}
