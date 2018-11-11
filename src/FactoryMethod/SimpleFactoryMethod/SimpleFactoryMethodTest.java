package FactoryMethod.SimpleFactoryMethod;

/**
 * 简单工厂方法测试
 */
public class SimpleFactoryMethodTest {
    public static void main(String[] args) {
        Video video = SimpleVideoFactory.produceVideo("Java");
        video.produce();
        Video video1 = SimpleVideoFactory.produceVideo("Python");
        video1.produce();

        Video video2 = SimpleVideoFactory.produceVideo(JavaVideo.class);
        video2.produce();

        Video video3 = SimpleVideoFactory.produceVideo(PythonVideo.class);
        video3.produce();
    }
}
