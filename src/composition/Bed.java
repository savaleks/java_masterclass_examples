package composition;

public class Bed {
    private String model;
    private String softness;
    private BedSize bedSize;

    public Bed(String model, String softness, BedSize bedSize) {
        this.model = model;
        this.softness = softness;
        this.bedSize = bedSize;
    }

    public void make(){
        System.out.println("Lova labai minksta.");
    }

    public String getModel() {
        return model;
    }

    public String getSoftness() {
        return softness;
    }

    public BedSize getBedSize() {
        return bedSize;
    }
}
