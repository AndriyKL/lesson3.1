public class Main {
    public static void main(String[] args) {

        SamsungPhone samsung = new SamsungPhone("Interceptor", "Galaxy A51", 6144, 128, "64mn");

        samsung.setName("Disruptor");

        System.out.println(samsung);

        samsung.phoneCalling();
        samsung.messageSending();
        samsung.takingPicture();
        samsung.recordingVideo();

        NokiaPhone nokia = new NokiaPhone("Terminator", "3310", 16 , 0.016);

        System.out.println(nokia);
        nokia.phoneCalling();
        nokia.messageSending();
    }
}
