public class Bedroom extends Room {
    private int number;
    private BedroomType type;
    private double pricePerNight;

    public Bedroom(int number, BedroomType type, double pricePerNight) {
        super(type.getCapacity());
        this.type = type;
        this.number = number;
        this.pricePerNight = pricePerNight;
    }

    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type.getType();
    }

    public double getPricePerNight() {
        return this.pricePerNight;
    }
}
