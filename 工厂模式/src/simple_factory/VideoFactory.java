package simple_factory;

public class VideoFactory {
    /**
     * 使用if else 判断类型，type 为 Java 则返回 JavaVideo， type为Python则返回 PythonVideo
     */
    public Video getVideo(String type) {
        // equalsIgnoreCase()作用是用来比较字母的长度和字符是否相同，且不区分大小写。
        if ("Java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("Python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 使用反射来创建对象
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return video;
    }
}
