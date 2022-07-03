public class NokiaPhone extends Phone implements PhoneConnection{

    public NokiaPhone(String name, String model, double volRAM, double volStore) {
        super(name, model, volRAM, volStore);
    }

    @Override
    public void phoneCalling() {
        System.out.println("I'm calling someone ...");
    }

    @Override
    public void messageSending() {
        System.out.println("Wait! I'm sending a message...");
    }

    @Override
    public String toString() {
        return "It's an old Nokia \"" + this.getName() + "\" of model " + this.getModel() +" with volume of RAM " + this.getVolRAM() +  " MB and volume store " + this.getVolStore() +"GB";
    }
}
