import java.util.Date;

public class LipProdacts extends Cosmetics {
    private String finishType;
    private String typeOfLipProdact;

    @Override
    public String toString() {
        return "LipProdacts{" +
                "finishType='" + finishType + '\'' +
                ", typeOfLipProdact='" + typeOfLipProdact + '\'' +
                '}';
    }

    public LipProdacts(String brand, String name, String assignment, Double volume, String shade, Boolean scent, String priceSegment, String areaOfUsage, String finishType, String typeOfLipProdact) {
        super(brand, name, assignment, volume, shade, scent, priceSegment, areaOfUsage);
        this.finishType = finishType;
        this.typeOfLipProdact = typeOfLipProdact;
    }

    public String getFinishType() {
        return finishType;
    }

    public void setFinishType(String finishType) {
        this.finishType = finishType;
    }

    public String getTypeOfLipProdact() {
        return typeOfLipProdact;
    }

    public void setTypeOfLipProdact(String typeOfLipProdact) {
        this.typeOfLipProdact = typeOfLipProdact;
    }
}
