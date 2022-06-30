public interface PhoneConnection {

    public default void phoneCalling() {
        System.out.println("I'm calling someone...");
    }

    public default void messageSending() {
        System.out.println("I'm sending a message...");
    }
}
