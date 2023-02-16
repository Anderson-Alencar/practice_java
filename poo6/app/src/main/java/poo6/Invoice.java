package poo6;

public class Invoice {

    private int itemCode;
    private String description;
    private int amount;
    private float unitCost;

    public Invoice(int itemCode, String description, int amount, float unitCost) {
        this.setItemCode(itemCode);
        this.setDescription(description);
        this.setAmount(amount);
        this.setUnitCost(unitCost);

    }

    public double getInvoiceAmount() {
        return amount * unitCost;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (this.amount < 0) {
            this.amount = 0;
        } else {
            this.amount = amount;
        }
    }

    public float getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(float unitCost) {
        if (this.unitCost < 0) {
            this.unitCost = 0;
        } else {
            this.unitCost = unitCost;
        }
    }

}
