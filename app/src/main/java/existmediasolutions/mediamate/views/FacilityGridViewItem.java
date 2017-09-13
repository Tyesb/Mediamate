package existmediasolutions.mediamate.views;

import android.media.Image;

/**
 * Created by tye on 9/9/2017.
 */

public class FacilityGridViewItem {

    String FacilityGridItemTitle;
    String FacilityGridItemDetails;
    Image FacilityGridItemImage;

    public FacilityGridViewItem(String facilityGridItemTitle, String facilityGridItemDetails, Image facilityGridItemImage) {
        FacilityGridItemTitle = facilityGridItemTitle;
        FacilityGridItemDetails = facilityGridItemDetails;
        FacilityGridItemImage = facilityGridItemImage;
    }

    public String getFacilityGridItemDetails() {
        return FacilityGridItemDetails;
    }

    public void setFacilityGridItemDetails(String facilityGridItemDetails) {
        FacilityGridItemDetails = facilityGridItemDetails;
    }

    public Image getFacilityGridItemImage() {
        return FacilityGridItemImage;
    }

    public void setFacilityGridItemImage(Image facilityGridItemImage) {
        FacilityGridItemImage = facilityGridItemImage;
    }

    public String getFacilityGridItemTitle() {
        return FacilityGridItemTitle;
    }

    public void setFacilityGridItemTitle(String facilityGridItemTitle) {
        FacilityGridItemTitle = facilityGridItemTitle;
    }


}
