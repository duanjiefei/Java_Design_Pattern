package FactoryMethod.AbstractFactoryMethod;

/**
 *
 */
public class PythonFactory extends Factory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
