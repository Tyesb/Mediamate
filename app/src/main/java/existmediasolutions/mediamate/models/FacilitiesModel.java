package existmediasolutions.mediamate.models;

/**
 * Created by tye on 9/21/2017.
 */

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FacilitiesModel implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("FacilityTitle")
    @Expose
    private String facilityTitle;
    @SerializedName("FaclityImage")
    @Expose
    private String faclityImage;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("MotelModelId")
    @Expose
    private Integer motelModelId;
    private final static long serialVersionUID = 1858191397257056341L;

    /**
     * No args constructor for use in serialization
     *
     */
    public FacilitiesModel() {
    }

    /**
     *
     * @param faclityImage
     * @param facilityTitle
     * @param id
     * @param description
     * @param motelModelId
     */
    public FacilitiesModel(Integer id, String facilityTitle, String faclityImage, String description, Integer motelModelId) {
        super();
        this.id = id;
        this.facilityTitle = facilityTitle;
        this.faclityImage = faclityImage;
        this.description = description;
        this.motelModelId = motelModelId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFacilityTitle() {
        return facilityTitle;
    }

    public void setFacilityTitle(String facilityTitle) {
        this.facilityTitle = facilityTitle;
    }

    public String getFaclityImage() {
        return faclityImage;
    }

    public void setFaclityImage(String faclityImage) {
        this.faclityImage = faclityImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMotelModelId() {
        return motelModelId;
    }

    public void setMotelModelId(Integer motelModelId) {
        this.motelModelId = motelModelId;
    }

}