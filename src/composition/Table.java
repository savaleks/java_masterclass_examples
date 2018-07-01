package composition;

public class Table {
    private int price;
    private int legsNumber;
    private String material;
    private Model model;

    public Table(int price, int legsNumber, String material, Model model) {
        this.price = price;
        this.legsNumber = legsNumber;
        this.material = material;
        this.model = model;
    }

    public void setTableParameters(){
        System.out.println("kaina: " + this.price + ",\nkoju skaicius: " + this.legsNumber
        + ",\npadarytas is: " + this.material + ",\nstalo modelis: " + model.getTableName() + ".");
    }

    public int getPrice() {
        return price;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public String getMaterial() {
        return material;
    }

    public Model getModel() {
        return model;
    }
}
