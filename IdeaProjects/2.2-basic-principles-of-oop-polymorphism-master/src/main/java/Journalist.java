public class Journalist extends Human{

    public String agency;
    public Object camera;
    public Object dataStorage;

    public void searchMaterial() {
        System.out.println("Looking for something interesting");
    }

    public void interview() {
        System.out.println("Let's have an interview session please!");
    }
}
