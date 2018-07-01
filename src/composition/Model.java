package composition;

public class Model {
    private String tableName;
    private int tableGaranty;

    public Model(String tableName, int tableGaranty) {
        this.tableName = tableName;
        this.tableGaranty = tableGaranty;
    }

    public String getTableName() {
        return tableName;
    }

    public int getTableGaranty() {
        return tableGaranty;
    }
}
