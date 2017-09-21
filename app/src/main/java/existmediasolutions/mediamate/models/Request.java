package existmediasolutions.mediamate.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("MotelModelId")
    @Expose
    private String motelModelId;
    @SerializedName("roomNo")
    @Expose
    private String roomNo;
    @SerializedName("requestInfo")
    @Expose
    private String requestInfo;
    @SerializedName("CategoryModel")
    @Expose
    private Object categoryModel;
    @SerializedName("CategoryModelId")
    @Expose
    private String categoryModelId;
    @SerializedName("RequestTime")
    @Expose
    private String requestTime;

    /**
     * No args constructor for use in serialization
     *
     */
    public Request() {
    }

    /**
     *
     * @param categoryModel
     * @param requestTime
     * @param roomNo
     * @param requestInfo
     * @param categoryModelId
     * @param motelModelId
     */
    public Request(String motelModelId, String roomNo, String requestInfo, Object categoryModel, String categoryModelId, String requestTime) {
        super();
        this.motelModelId = motelModelId;
        this.roomNo = roomNo;
        this.requestInfo = requestInfo;
        this.categoryModel = categoryModel;
        this.categoryModelId = categoryModelId;
        this.requestTime = requestTime;
    }

    public String getMotelModelId() {
        return motelModelId;
    }

    public void setMotelModelId(String motelModelId) {
        this.motelModelId = motelModelId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(String requestInfo) {
        this.requestInfo = requestInfo;
    }

    public Object getCategoryModel() {
        return categoryModel;
    }

    public void setCategoryModel(Object categoryModel) {
        this.categoryModel = categoryModel;
    }

    public String getCategoryModelId() {
        return categoryModelId;
    }

    public void setCategoryModelId(String categoryModelId) {
        this.categoryModelId = categoryModelId;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

}