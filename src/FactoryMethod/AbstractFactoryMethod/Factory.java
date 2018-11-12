package FactoryMethod.AbstractFactoryMethod;

/**
 * 抽象工厂 ： 为创建    一组相关或者相互依赖     的对象 提供一个接口（抽象类），而不需要指定具体的产品类
 */
public abstract class Factory {
    public abstract Video getVideo();
    public abstract Article getArticle();
}
