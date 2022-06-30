public class NokiaPhone extends Phone implements PhoneConnection{

    public NokiaPhone(String name, String model, double volRAM, double volStore) {
        super(name, model, volRAM, volStore);
    }

    public String toString() {
        return "It's an old Nokia \"" + name + "\" of model " + model +" with volume of RAM " + volRAM +  " MB and volume store " + volStore +"GB";
    }
}
