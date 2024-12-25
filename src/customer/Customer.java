package customer;

public class Customer {
    private String customerId;
    private String name;
    private String phone;

    public Customer() {
        this.customerId = "Unknown";
        this.name = "Unknown";
        this.phone = "Unknown";
    }

    public Customer(String customerId, String name, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " (ID: " + customerId + ", Phone: " + phone + ")";
    }
}