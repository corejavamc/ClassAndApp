public class House {
    private int nobedrooms;
    private int nobathrooms;
    private int nofloors;
    private String style;
    private boolean garage;

    public House() {
    }

    public House(int nobedrooms, int nobathrooms, int nofloors, String style, boolean garage) {
        this.nobedrooms = nobedrooms;
        this.nobathrooms = nobathrooms;
        this.nofloors = nofloors;
        this.style = style;
        this.garage = garage;
    }

    public int getNobedrooms() {
        return nobedrooms;
    }

    public void setNobedrooms(int nobedrooms) {
        this.nobedrooms = nobedrooms;
    }

    public int getNobathrooms() {
        return nobathrooms;
    }

    public void setNobathrooms(int nobathrooms) {
        this.nobathrooms = nobathrooms;
    }

    public int getNofloors() {
        return nofloors;
    }

    public void setNofloors(int nofloors) {
        this.nofloors = nofloors;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public String getHouseInfo() {
        String result = "The house is a ";

        result = result + getNofloors() + " floor(s)" +
                 getStyle() + " style house with " +
                 getNobedrooms() + " bedrooms, " +
                 getNobathrooms() + " bathrooms, ";

        if (isGarage())
            result = result + "and with garage";
        else
            result = result + "and without any garage";

        return result;
    }
}
