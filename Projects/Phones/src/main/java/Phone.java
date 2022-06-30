public abstract class Phone {

    public String name;
    public String model;
    public double volRAM;
    public double volStore;

    public Phone(String name, String model, double volRAM, double volStore) {
        this.name = name;
        this.model = model;
        this.volRAM = volRAM;
        this.volStore = volStore;
    }
}
