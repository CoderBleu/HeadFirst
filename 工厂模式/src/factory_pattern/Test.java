package factory_pattern;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws Exception {
        // VideoFactory pythonVideoFactory = new PythonVideoFactory();
        // VideoFactory javaVideoFactory = new JavaVideoFactory();
        // // 录制Python课程视频
        // Video pythonVideo = pythonVideoFactory.getVideo();
        // pythonVideo.produce();
        // // 录制Java课程视频
        // Video javaVideo = javaVideoFactory.getVideo();
        // javaVideo.produce();

        // 从文件或数据库等外部渠道获取 工厂类名
        String factoryName = "factory_pattern.JavaVideoFactory";
        // 通过反射机制获取工厂类
        Class c = Class.forName(factoryName);
        VideoFactory factory = (VideoFactory) c.getDeclaredConstructor().newInstance();
        // 生产产品
        Video video = factory.getVideo();
        video.produce();
    }
}
