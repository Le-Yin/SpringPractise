package beans;

/**
 * Created by chelseayin on 2017/7/5.
 */
public class Address {

    private String city;
    private String detailAddress;

    public Address(String city, String detailAddress) {
        this.city = city;
        this.detailAddress = detailAddress;
        System.out.println(this.toString() + " created successfully. ");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    @Override
    public String toString() {
        return city + " | " + detailAddress;
    }

}
