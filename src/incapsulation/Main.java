package incapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(70, false);
        // duplex busenoje atspausdintu lapu kiekis neteisingas kai ivedamos nelyginis skaicius(pvz.:15);
        System.out.println("Esamu lapu kiekis: " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(10);
        System.out.println("Buvo atspausdinta " + pagesPrinted + " lapai, galutinis kiekis " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(15);
        System.out.println("Buvo atspausdinta " + pagesPrinted + " lapai, galutinis kiekis " + printer.getPagesPrinted());
    }
}
