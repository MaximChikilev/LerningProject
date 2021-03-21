import java.util.Date;
import java.util.Objects;

abstract class Cosmetics {
    private String brand;
    private String name;
    private String assignment;
    private Double volume;
    private Date expireDate;
    private String shade;
    private Boolean scent;
    private String priceSegment;
    private String areaOfUsage;

    public Cosmetics(String brand, String name, String assignment, Double volume,  String shade, Boolean scent, String priceSegment, String areaOfUsage) {
        this.brand = brand;
        this.name = name;
        this.assignment = assignment;
        this.volume = volume;
        this.shade = shade;
        this.scent = scent;
        this.priceSegment = priceSegment;
        this.areaOfUsage = areaOfUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cosmetics)) return false;
        Cosmetics cosmetics = (Cosmetics) o;
        return Objects.equals(getBrand(), cosmetics.getBrand()) && Objects.equals(getName(), cosmetics.getName()) && Objects.equals(getAssignment(),
                cosmetics.getAssignment()) && Objects.equals(getVolume(), cosmetics.getVolume()) && Objects.equals(getExpireDate(),
                cosmetics.getExpireDate()) && Objects.equals(getShade(), cosmetics.getShade()) && Objects.equals(getScent(),
                cosmetics.getScent()) && Objects.equals(getPriceSegment(), cosmetics.getPriceSegment()) && Objects.equals(getAreaOfUsage(),
                cosmetics.getAreaOfUsage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getName(), getAssignment(), getVolume(), getExpireDate(),
                getShade(), getScent(), getPriceSegment(), getAreaOfUsage());
    }

    public String getAreaOfUsage() {
        return areaOfUsage;
    }

    public void setAreaOfUsage(String areaOfUsage) {
        this.areaOfUsage = areaOfUsage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getShade() {
        return shade;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public Boolean getScent() {
        return scent;
    }

    public void setScent(Boolean scent) {
        this.scent = scent;
    }

    public String getPriceSegment() {
        return priceSegment;
    }

    public void setPriceSegment(String priceSegment) {
        this.priceSegment = priceSegment;
    }
}



