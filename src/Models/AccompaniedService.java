package Models;

public class AccompaniedService {
    private String nameServices;
    private String unit;
    private String price;

    public AccompaniedService() {
    }

    public AccompaniedService(String nameServices, String unit, String price) {
        this.nameServices = nameServices;
        this.unit = unit;
        this.price = price;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AccompaniedService{" +
                "nameServices='" + nameServices + '\'' +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                '}';
    }
}
