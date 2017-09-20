package existmediasolutions.mediamate.models;

/**
 * Created by tye on 9/9/2017.
 */
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Advertiser implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("AdvertiserTitle")
    @Expose
    private String advertiserTitle;
    @SerializedName("AdvertiserSnippet")
    @Expose
    private String advertiserSnippet;
    @SerializedName("AdvertiserBlurb")
    @Expose
    private String advertiserBlurb;
    @SerializedName("AdvertiserImage")
    @Expose
    private String advertiserImage;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("AdvertiserLat")
    @Expose
    private Double advertiserLat;
    @SerializedName("AdvertiserLong")
    @Expose
    private Double advertiserLong;
    @SerializedName("MotelModelId")
    @Expose
    private Integer motelModelId;
    private final static long serialVersionUID = -4766075538928307081L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Advertiser() {
    }

    /**
     *
     * @param id
     * @param advertiserBlurb
     * @param advertiserLong
     * @param advertiserSnippet
     * @param address
     * @param advertiserTitle
     * @param advertiserImage
     * @param motelModelId
     * @param advertiserLat
     */
    public Advertiser(Integer id, String advertiserTitle, String advertiserSnippet, String advertiserBlurb, String advertiserImage, String address, Double advertiserLat, Double advertiserLong, Integer motelModelId) {
        super();
        this.id = id;
        this.advertiserTitle = advertiserTitle;
        this.advertiserSnippet = advertiserSnippet;
        this.advertiserBlurb = advertiserBlurb;
        this.advertiserImage = advertiserImage;
        this.address = address;
        this.advertiserLat = advertiserLat;
        this.advertiserLong = advertiserLong;
        this.motelModelId = motelModelId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvertiserTitle() {
        return advertiserTitle;
    }

    public void setAdvertiserTitle(String advertiserTitle) {
        this.advertiserTitle = advertiserTitle;
    }

    public String getAdvertiserSnippet() {
        return advertiserSnippet;
    }

    public void setAdvertiserSnippet(String advertiserSnippet) {
        this.advertiserSnippet = advertiserSnippet;
    }

    public String getAdvertiserBlurb() {
        return advertiserBlurb;
    }

    public void setAdvertiserBlurb(String advertiserBlurb) {
        this.advertiserBlurb = advertiserBlurb;
    }

    public String getAdvertiserImage() {
        return advertiserImage;
    }

    public void setAdvertiserImage(String advertiserImage) {
        this.advertiserImage = advertiserImage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAdvertiserLat() {
        return advertiserLat;
    }

    public void setAdvertiserLat(Double advertiserLat) {
        this.advertiserLat = advertiserLat;
    }

    public Double getAdvertiserLong() {
        return advertiserLong;
    }

    public void setAdvertiserLong(Double advertiserLong) {
        this.advertiserLong = advertiserLong;
    }

    public Integer getMotelModelId() {
        return motelModelId;
    }

    public void setMotelModelId(Integer motelModelId) {
        this.motelModelId = motelModelId;
    }

}
//public class Advertiser {
//
//    String Id;
//    String AdvertiserTitle;
//    String AdvertiserSnippet;
//    String AdvertiserBlurb;
//    String AdvertiserAddress;
//    Long AdvertiserLong;
//    Long AdvertiserLat;
//
//    public String getId() {
//        return Id;
//    }
//
//    public void setId(String id) {
//        Id = id;
//    }
//
//    public String getAdvertiserTitle() {
//        return AdvertiserTitle;
//    }
//
//    public void setAdvertiserTitle(String advertiserTitle) {
//        AdvertiserTitle = advertiserTitle;
//    }
//
//    public String getAdvertiserSnippet() {
//        return AdvertiserSnippet;
//    }
//
//    public void setAdvertiserSnippet(String advertiserSnippet) {
//        AdvertiserSnippet = advertiserSnippet;
//    }
//
//    public String getAdvertiserBlurb() {
//        return AdvertiserBlurb;
//    }
//
//    public void setAdvertiserBlurb(String advertiserBlurb) {
//        AdvertiserBlurb = advertiserBlurb;
//    }
//
//    public String getAdvertiserAddress() {
//        return AdvertiserAddress;
//    }
//
//    public void setAdvertiserAddress(String advertiserAddress) {
//        AdvertiserAddress = advertiserAddress;
//    }
//
//    public Long getAdvertiserLong() {
//        return AdvertiserLong;
//    }
//
//    public void setAdvertiserLong(Long advertiserLong) {
//        AdvertiserLong = advertiserLong;
//    }
//
//    public Long getAdvertiserLat() {
//        return AdvertiserLat;
//    }
//
//    public void setAdvertiserLat(Long advertiserLat) {
//        AdvertiserLat = advertiserLat;
//    }
//
//}
