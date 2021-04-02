package simple_factory;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video1 = videoFactory.getVideo("python");
        if (video1 == null) {
            return;
        }
        video1.produce();

        Video video2 = videoFactory.getVideo(JavaVideo.class);
        if (video2 == null) {
            return;
        }
        video2.produce();
    }
}
