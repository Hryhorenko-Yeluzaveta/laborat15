public class Tours {

    private int id;
    private String name;
    private double price;
    private String status;
    private Client client;


    public Tours(int id, String name, double price, String status, Client client) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Tours{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", client=" + client +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public String setStatus(String status) {
        return status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
