package existmediasolutions.mediamate.models;

/**
 * Created by tye on 9/9/2017.
 */

public class Advertiser {

    String Id;
    String AdvertiserTitle;
    String AdvertiserSnippet;
    String AdvertiserBlurb;
    String AdvertiserAddress;
    Long AdvertiserLong;
    Long AdvertiserLat;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAdvertiserTitle() {
        return AdvertiserTitle;
    }

    public void setAdvertiserTitle(String advertiserTitle) {
        AdvertiserTitle = advertiserTitle;
    }

    public String getAdvertiserSnippet() {
        return AdvertiserSnippet;
    }

    public void setAdvertiserSnippet(String advertiserSnippet) {
        AdvertiserSnippet = advertiserSnippet;
    }

    public String getAdvertiserBlurb() {
        return AdvertiserBlurb;
    }

    public void setAdvertiserBlurb(String advertiserBlurb) {
        AdvertiserBlurb = advertiserBlurb;
    }

    public String getAdvertiserAddress() {
        return AdvertiserAddress;
    }

    public void setAdvertiserAddress(String advertiserAddress) {
        AdvertiserAddress = advertiserAddress;
    }

    public Long getAdvertiserLong() {
        return AdvertiserLong;
    }

    public void setAdvertiserLong(Long advertiserLong) {
        AdvertiserLong = advertiserLong;
    }

    public Long getAdvertiserLat() {
        return AdvertiserLat;
    }

    public void setAdvertiserLat(Long advertiserLat) {
        AdvertiserLat = advertiserLat;
    }

}
