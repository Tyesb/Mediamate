package existmediasolutions.mediamate.models;

/**
 * Created by tye on 9/21/2017.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MotelModel implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("UserData")
    @Expose
    private String userData;
    @SerializedName("ThemeModel")
    @Expose
    private ThemeModel themeModel;
    @SerializedName("ThemeModelId")
    @Expose
    private Integer themeModelId;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("Motellong")
    @Expose
    private Double motellong;
    @SerializedName("MotelLat")
    @Expose
    private Double motelLat;
    @SerializedName("MotelVideo")
    @Expose
    private String motelVideo;
    @SerializedName("Rooms")
    @Expose
    private Integer rooms;
    @SerializedName("PhoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("FacilitiesModels")
    @Expose
    private ArrayList<FacilitiesModel> facilitiesModels = null;
    @SerializedName("Advertisers")
    @Expose
    private List<Advertiser> advertisers = null;
    @SerializedName("DeviceModel")
    @Expose
    private List<Object> deviceModel = null;
    private final static long serialVersionUID = -5489811845184601624L;

    /**
     * No args constructor for use in serialization
     *
     */
    public MotelModel() {
    }

    /**
     *
     * @param id
     * @param advertisers
     * @param phoneNumber
     * @param motelVideo
     * @param themeModelId
     * @param facilitiesModels
     * @param address
     * @param name
     * @param deviceModel
     * @param motelLat
     * @param themeModel
     * @param userData
     * @param motellong
     * @param rooms
     */
    public MotelModel(Integer id, String name, String userData, ThemeModel themeModel, Integer themeModelId, String address, Double motellong, Double motelLat, String motelVideo, Integer rooms, String phoneNumber, ArrayList<FacilitiesModel> facilitiesModels, List<Advertiser> advertisers, List<Object> deviceModel) {
        super();
        this.id = id;
        this.name = name;
        this.userData = userData;
        this.themeModel = themeModel;
        this.themeModelId = themeModelId;
        this.address = address;
        this.motellong = motellong;
        this.motelLat = motelLat;
        this.motelVideo = motelVideo;
        this.rooms = rooms;
        this.phoneNumber = phoneNumber;
        this.facilitiesModels = facilitiesModels;
        this.advertisers = advertisers;
        this.deviceModel = deviceModel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public ThemeModel getThemeModel() {
        return themeModel;
    }

    public void setThemeModel(ThemeModel themeModel) {
        this.themeModel = themeModel;
    }

    public Integer getThemeModelId() {
        return themeModelId;
    }

    public void setThemeModelId(Integer themeModelId) {
        this.themeModelId = themeModelId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getMotellong() {
        return motellong;
    }

    public void setMotellong(Double motellong) {
        this.motellong = motellong;
    }

    public Double getMotelLat() {
        return motelLat;
    }

    public void setMotelLat(Double motelLat) {
        this.motelLat = motelLat;
    }

    public String getMotelVideo() {
        return motelVideo;
    }

    public void setMotelVideo(String motelVideo) {
        this.motelVideo = motelVideo;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<FacilitiesModel> getFacilitiesModels() {
        return facilitiesModels;
    }

    public void setFacilitiesModels(ArrayList<FacilitiesModel> facilitiesModels) {
        this.facilitiesModels = facilitiesModels;
    }

    public List<Advertiser> getAdvertisers() {
        return advertisers;
    }

    public void setAdvertisers(List<Advertiser> advertisers) {
        this.advertisers = advertisers;
    }

    public List<Object> getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(List<Object> deviceModel) {
        this.deviceModel = deviceModel;
    }

}