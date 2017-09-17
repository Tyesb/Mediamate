package existmediasolutions.mediamate.models;

import android.app.Application;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;

import existmediasolutions.mediamate.R;
import existmediasolutions.mediamate.views.FacilityGridViewItem;

/**
 * Created by tye on 9/9/2017.
 */

public class DeviceInformation extends Application {

    public int DeviceId;

    public DeviceInformation(int deviceId, String hotelName, int roomNumber, String userData, int theme_ID, String leftButtonUrl, String rightButtonUrl, String bottomButtonUrl, String motelAddress, double motelLong, double motelLat, String motelVideo) {
        DeviceId = deviceId;
        HotelName = hotelName;
        RoomNumber = roomNumber;
        UserData = userData;
        Theme_ID = theme_ID;
        LeftButtonUrl = leftButtonUrl;
        RightButtonUrl = rightButtonUrl;
        BottomButtonUrl = bottomButtonUrl;
        MotelAddress = motelAddress;
        MotelLong = motelLong;
        MotelLat = motelLat;
        MotelVideo = motelVideo;
        Facilities = new ArrayList<Facility>();
        Advertisers = new ArrayList<Advertiser>();

    }

    public String HotelName;
    public int RoomNumber;
    public String UserData;
    public int Theme_ID;
    public String LeftButtonUrl;
    public String RightButtonUrl;
    public String BottomButtonUrl;
    public String MotelAddress;
    public double MotelLong;
    public double MotelLat;
    public String MotelVideo;
    public ArrayList<Facility> Facilities;
    public ArrayList<Advertiser> Advertisers;




    public int getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(int deviceId) {
        DeviceId = deviceId;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String hotelName) {
        HotelName = hotelName;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getUserData() {
        return UserData;
    }

    public void setUserData(String userData) {
        UserData = userData;
    }

    public int getTheme_ID() {
        return Theme_ID;
    }

    public void setTheme_ID(int theme_ID) {
        Theme_ID = theme_ID;
    }

    public String getLeftButtonUrl() {
        return LeftButtonUrl;
    }

    public void setLeftButtonUrl(String leftButtonUrl) {
        LeftButtonUrl = leftButtonUrl;
    }

    public String getRightButtonUrl() {
        return RightButtonUrl;
    }

    public void setRightButtonUrl(String rightButtonUrl) {
        RightButtonUrl = rightButtonUrl;
    }

    public String getBottomButtonUrl() {
        return BottomButtonUrl;
    }

    public void setBottomButtonUrl(String bottomButtonUrl) {
        BottomButtonUrl = bottomButtonUrl;
    }

    public String getMotelAddress() {
        return MotelAddress;
    }

    public void setMotelAddress(String motelAddress) {
        MotelAddress = motelAddress;
    }

    public Double getMotelLong() {
        return MotelLong;
    }

    public void setMotelLong(Double motelLong) {
        MotelLong = motelLong;
    }

    public Double getMotelLat() {
        return MotelLat;
    }

    public void setMotelLat(Double motelLat) {
        MotelLat = motelLat;
    }

    public String getMotelVideo() {
        return MotelVideo;
    }

    public void setMotelVideo(String motelVideo) {
        MotelVideo = motelVideo;
    }

    public ArrayList<Facility> getFacilities() {
        return Facilities;
    }

    public void setFacilities(ArrayList<Facility> facilities) {
        Facilities = facilities;
    }

    public ArrayList<Advertiser> getAdvertisers() {
        return Advertisers;
    }

    public void setAdvertisers(ArrayList<Advertiser> advertisers) {
        Advertisers = advertisers;
    }







}
