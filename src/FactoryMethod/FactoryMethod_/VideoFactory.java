package FactoryMethod.FactoryMethod_;

public class VideoFactory extends Factory {
    @Override
    public Video produceVideo(Class clz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
