public class SamsungPhone extends Phone implements PhoneConnection, PhoneMedia {
    String camera;

    public SamsungPhone(String name, String model, double volRAM, double volStore, String camera) {
        super(name, model, volRAM, volStore);
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public void phoneCalling() {
        System.out.println("I'm calling someone special...");
    }

    @Override
    public void messageSending() {
        System.out.println("I'm sending a quick message...");
    }

    @Override
    public void takingPicture() {
        System.out.println("Let me take a picture...Done!");
    }

    @Override
    public void recordingVideo() {
        System.out.println("I've just recorded a 10 sec video on my new ultra " + this.getCamera() + " camera!");
    }

    @Override
    public String toString() {
        return "It's new Samsung \"" + this.getName() + "\" of model " + this.getModel() +" with volume of RAM " + this.getVolRAM() +  " MB, volume store " + this.getVolStore() +"GB and " + this.getCamera() + " camera.";
    }
}
