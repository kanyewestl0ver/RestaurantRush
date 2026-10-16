package rush.model;

public enum CustomerType {
    REGULAR("Regular");

    private final String label;

    CustomerType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
