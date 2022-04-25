public class Laptop {
    private String model;
    private int price;
    private double weight;
    private boolean oS;



    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isoS() {
        return oS;
    }

    public void setoS(boolean oS) {
        this.oS = oS;
    }
}
