package existmediasolutions.mediamate.models;

/**
 * Created by tye on 9/21/2017.
 */

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThemeModel implements Serializable
{

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("LeftButtonUrl")
    @Expose
    private String leftButtonUrl;
    @SerializedName("RightButtonUrl")
    @Expose
    private String rightButtonUrl;
    @SerializedName("BottomButtonUrl")
    @Expose
    private String bottomButtonUrl;
    @SerializedName("UserData")
    @Expose
    private String userData;
    private final static long serialVersionUID = -8504858012822357132L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ThemeModel() {
    }

    /**
     *
     * @param id
     * @param bottomButtonUrl
     * @param rightButtonUrl
     * @param leftButtonUrl
     * @param userData
     */
    public ThemeModel(Integer id, String leftButtonUrl, String rightButtonUrl, String bottomButtonUrl, String userData) {
        super();
        this.id = id;
        this.leftButtonUrl = leftButtonUrl;
        this.rightButtonUrl = rightButtonUrl;
        this.bottomButtonUrl = bottomButtonUrl;
        this.userData = userData;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeftButtonUrl() {
        return leftButtonUrl;
    }

    public void setLeftButtonUrl(String leftButtonUrl) {
        this.leftButtonUrl = leftButtonUrl;
    }

    public String getRightButtonUrl() {
        return rightButtonUrl;
    }

    public void setRightButtonUrl(String rightButtonUrl) {
        this.rightButtonUrl = rightButtonUrl;
    }

    public String getBottomButtonUrl() {
        return bottomButtonUrl;
    }

    public void setBottomButtonUrl(String bottomButtonUrl) {
        this.bottomButtonUrl = bottomButtonUrl;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

}