package FactoryMethod.FactoryMethod_;

/**
 * 简单工厂方法测试
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.produceVideo(JavaVideo.class);
        video.produce();

        Video video1 = videoFactory.produceVideo(PythonVideo.class);
        video1.produce();

    }
}
