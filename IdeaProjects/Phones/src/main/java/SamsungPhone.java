public class SamsungPhone extends Phone implements PhoneConnection, PhoneMedia {

    public SamsungPhone(String name, String model, double volRAM, double volStore) {
        super(name, model, volRAM, volStore);
    }

    public String toString() {
        return "It's new Samsung \"" + name + "\" of model " + model +" with volume of RAM " + volRAM +  " MB and volume store " + volStore +"GB";
    }
}
