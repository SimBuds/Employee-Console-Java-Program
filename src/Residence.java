// Casey Hsu - 101376814
public class Residence extends Employee {
    private String streetName;
    private String cityName;
    private String zipCode;
    private String province;
    private String country;
    public Residence(String streetName, String cityName, String zipCode, String province, String country) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.province = province;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\nStreet Name: " + streetName +
                "\nCity Name: " + cityName +
                "\nZip Code: " + zipCode +
                "\nProvince: " + province +
                "\nCountry: " + country + "\n";
    }
}
// Casey Hsu - 101376814
