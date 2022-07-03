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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolRAM() {
        return volRAM;
    }

    public void setVolRAM(double volRAM) {
        this.volRAM = volRAM;
    }

    public double getVolStore() {
        return volStore;
    }

    public void setVolStore(double volStore) {
        this.volStore = volStore;
    }

    public String toString() {
        return "It's a phone \"" + this.getName() + "\" of model " + this.getModel() +" with volume of RAM " + this.getVolRAM() +  " MB and volume store " + this.getVolStore() +"GB";
    }
}
