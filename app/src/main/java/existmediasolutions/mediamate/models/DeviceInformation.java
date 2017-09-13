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

    public void SimulateDataGet(){
        String detailsString = "A Brief Blurb describing the customers selection, the pool is found here; the cooked breakfast includes; yadayada";
        setHotelName("Test Hotel");
        setRoomNumber(1);
        setUserData("player@gmail.com");
        setTheme_ID(1);
        setLeftButtonUrl("http://103.242.48.22:65428/resources/new_layout/left_button.png");
        setRightButtonUrl("http://103.242.48.22:65428/resources/new_layout/right_button.png");
        setMotelAddress("107 Duke Street");
        setMotelLong(174.745331);
        setMotelLat(-36.866549);
        setMotelVideo("http://103.242.48.22:65428/resources/new_layout/main_roll.wmv");

    }


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
