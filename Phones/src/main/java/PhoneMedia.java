public interface PhoneMedia {

    public default void takingPicture() {
        System.out.println("Let me take a picture...Done!");
    }
    public default void recordingVideo() {
        System.out.println("I've just recorded a 10 sec video!");
    }
}
