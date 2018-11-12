package FactoryMethod.AbstractFactoryMethod;

/**
 * 优点  ： 能够保证创建的产品为同一个产品族
 */
public class JavaFactory extends Factory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
