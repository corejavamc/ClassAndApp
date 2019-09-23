public class House {
    private String style;
    private int nobedrooms;
    private double nobathrooms;
    private int nofloors;
    private boolean garage;

    public House() {
    }

    public House(int nobedrooms, double nobathrooms, int nofloors, String style, boolean garage) {
        this.nobedrooms = nobedrooms;
        this.nobathrooms = nobathrooms;
        this.nofloors = nofloors;
        this.style = style;
        this.garage = garage;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getNobedrooms() {
        return nobedrooms;
    }

    public void setNobedrooms(int nobedrooms) {
        this.nobedrooms = nobedrooms;
    }

    public double getNobathrooms() {
        return nobathrooms;
    }

    public void setNobathrooms(double nobathrooms) {
        this.nobathrooms = nobathrooms;
    }

    public int getNofloors() {
        return nofloors;
    }

    public void setNofloors(int nofloors) {
        this.nofloors = nofloors;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public String getHouseInfo() {
        String result = "The house is a ";

        result = result +
                 getStyle() + " style house with " +
                 getNofloors() + " floor(s)" +
                 getNobedrooms() + " bedrooms, " +
                 getNobathrooms() + " bathrooms, ";

        if (isGarage())
            result = result + "and with a garage";
        else
            result = result + "and without any garage";

        return result;
    }
}
