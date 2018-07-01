package composition;

public class Room {
    private String name;
    private Table table;
    private Bed bed;

    public Room(String name, Table table, Bed bed) {
        this.name = name;
        this.table = table;
        this.bed = bed;
    }

    public Table getTable(){
        return this.table;
    }

    public void makeBed(){
        System.out.println("Mano kambaryje yra lova.");
        bed.make();
    }
}
