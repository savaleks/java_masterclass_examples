package composition;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(120, 4, "wood", new Model("safari", 2));
        Bed bed = new Bed("relax", "soft", new BedSize(40, 210, 120));

        Room room = new Room("Toms", table, bed);
        room.makeBed();

        System.out.println("----------------------");

        System.out.println("Taip pat yra stalas. Stalo parametrai:");
        room.getTable().setTableParameters();

    }
}
