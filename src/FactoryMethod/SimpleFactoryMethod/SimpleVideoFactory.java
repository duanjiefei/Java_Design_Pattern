package FactoryMethod.SimpleFactoryMethod;


/**
 *
 *
 * 简单工厂方法/静态工厂方法
 */
public class SimpleVideoFactory {
    /**
     * 简单工厂方法  或者 静态工厂方法，根据传入的参数类型，决定产品的输出类型
     * @param videoType
     * @return
     */
    public static Video produceVideo(String videoType){
        if (videoType.equalsIgnoreCase("Java")){
            return new JavaVideo();
        }else if (videoType.equalsIgnoreCase("Python")){
            return new PythonVideo();
        }else {
            return null;
        }
    }

    /**
     * 用反射获取  需要生产的具体产品类
     * @param clz
     * @return
     */
    public static Video produceVideo(Class clz){
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
