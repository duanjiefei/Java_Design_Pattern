package FactoryMethod.AbstractFactoryMethod;

public class AbstractFactoryMethodTest {
    public static void main(String[] args) {
        Factory factory = new JavaFactory();
        Video video = factory.getVideo();
        Article article = factory.getArticle();
        video.produce();
        article.produce();
    }
}
