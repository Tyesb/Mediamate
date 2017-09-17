package existmediasolutions.mediamate.models;

import android.graphics.drawable.Drawable;

/**
 * Created by tye on 9/9/2017.
 */

public class Facility {
    public Facility(String facilityTitle, Drawable facilityIcon, String facilityDescription, String facilityImage) {
        FacilityTitle = facilityTitle;
        FacilityIcon = facilityIcon;
        FacilityDescription = facilityDescription;
        FacilityImage = facilityImage;

    }

    String FacilityTitle;
    Drawable FacilityIcon;
    String FacilityDescription;
    String FacilityImage;

    public Drawable getFacilityIcon() {
        return FacilityIcon;
    }

    public void setFacilityIcon(Drawable facilityIcon) {
        FacilityIcon = facilityIcon;
    }

    public void setFacilityImage(String facilityImage) {
        FacilityImage = facilityImage;
    }



    public String getFacilityTitle() {
        return FacilityTitle;
    }

    public void setFacilityTitle(String facilityTitle) {
        FacilityTitle = facilityTitle;
    }

    public String getFacilityImage() {
        return FacilityImage;
    }

    public String getFacilityDescription() {
        return FacilityDescription;
    }

    public void setFacilityDescription(String facilityDescription) {
        FacilityDescription = facilityDescription;
    }


}
