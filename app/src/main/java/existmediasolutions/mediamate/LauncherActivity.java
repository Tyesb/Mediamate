package existmediasolutions.mediamate;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import existmediasolutions.mediamate.fragments.AroundMe;
import existmediasolutions.mediamate.fragments.FacilityDetailView;
import existmediasolutions.mediamate.fragments.FacilityFragment;
import existmediasolutions.mediamate.fragments.MotelVideoView;
import existmediasolutions.mediamate.fragments.dummy.DummyContent;
import existmediasolutions.mediamate.models.DeviceInformation;
import existmediasolutions.mediamate.models.Facility;

public class LauncherActivity extends AppCompatActivity implements MotelVideoView.OnFragmentInteractionListener, FacilityFragment.OnListFragmentInteractionListener, FacilityDetailView.OnFragmentInteractionListener{

    ImageView leftHomeButton;
    ImageView rightHomeButton;
    ArrayList<Facility> mainMenu = new ArrayList<Facility>();
    DeviceInformation deviceInformation = new  DeviceInformation(1,"A Brief Blurb describing the customers selection, the pool is found here; the cooked breakfast includes; yadayada",
    202,
    "Test Hotel",
    1,
    "player@gmail.com",
    "http://103.242.48.22:65428/resources/new_layout/left_button.png",
    "http://103.242.48.22:65428/resources/new_layout/right_button.png",
    "107 Duke Street",
    174.745331,
    -36.866549,
    "http://103.242.48.22:65428/resources/new_layout/main_roll.wmv");
    String facilityImageUrl = "http://swpool.azureedge.net/cdn/farfuture/7mwzsesooaBw9yz3t08UecJ8iUGI1z1MLm3OPTKn_wU/md5:4c26bfdd8215af9418764c0c268af60c/sites/default/files/styles/pool_photo_gallery_thumbnail/public/Gallery/Inground%20Pools/california_negative_edge_swimming_pool.jpg?itok=oLzhp6c3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        BuildBullshitObjects();
        buildMainMenu();
        if (savedInstanceState == null) {
//            android.support.v4.app.Fragment mMapFragment = SupportMapFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.TopCenter, MotelVideoView.newInstance(), "VideoView")
//                    .add(R.id.TopCenter, mMapFragment, "AroundMe")
                    .add(R.id.LowGridView, FacilityFragment.newInstance(mainMenu.size(), mainMenu))
//                    .add(R.id.LowGridView, FacilityFragment.newInstance(deviceInformation.Facilities.size(),deviceInformation.getFacilities()), "Faciltiy Grid View")
                    .commit();
        }
        hideStatusBar();
        setViews();
        updateDisplayObjects();

    }

    public void buildMainMenu(){
        mainMenu.add(new Facility("Compendium", getResources().getDrawable(R.drawable.reception), "The Motels Compendium", facilityImageUrl));
        mainMenu.add(new Facility("Facilities", getResources().getDrawable(R.drawable.pool), "More Details About The Facilities Availble Here", facilityImageUrl));
        mainMenu.add(new Facility("Around Me", getResources().getDrawable(R.drawable.massage_facility), "Show Partnered Business Near You", facilityImageUrl));
        mainMenu.add(new Facility("Requests", getResources().getDrawable(R.drawable.spaicon), "Request Services", facilityImageUrl));

    }


    private void BuildBullshitObjects(){
        deviceInformation.Facilities.add(new Facility("Spa", getResources().getDrawable(R.drawable.spaicon), "details about this", facilityImageUrl));
        deviceInformation.Facilities.add(new Facility("Sauna", getResources().getDrawable(R.drawable.sauna), "details about this", facilityImageUrl));
        deviceInformation.Facilities.add(new Facility("Pool", getResources().getDrawable(R.drawable.pool), "details about this", facilityImageUrl));
        deviceInformation.Facilities.add(new Facility("Bar", getResources().getDrawable(R.drawable.bar), "details about this", facilityImageUrl));
        deviceInformation.Facilities.add(new Facility("Restaurant", getResources().getDrawable(R.drawable.resturaunt), "details about this", facilityImageUrl));
        deviceInformation.Facilities.add(new Facility("Go Back", getResources().getDrawable(R.drawable.go_back), "details about this", facilityImageUrl));
    }

    //TODO: Move these to fragments
    public void setViews() {
        leftHomeButton = (ImageView) findViewById(R.id.homeLeftButton);
        rightHomeButton = (ImageView) findViewById(R.id.homeRightButton);
    }

    public void updateImageViews(ImageView imageView, String Url){
        String imageUri = Url;

        Picasso.with(this).load(("http://" + imageUri)).placeholder(R.drawable.spaicon)
                .into(imageView);
    }

    public void updateDisplayObjects(){
        updateImageViews(leftHomeButton, "103.242.48.22:65428/resources/new_layout/left_button.png");
        updateImageViews(rightHomeButton, "103.242.48.22:65428/resources/new_layout/right_button.png");
    }

    //Hide Action Bar
    private void hideStatusBar()
    {
        getWindow().getDecorView().setSystemUiVisibility(3846);
    }

    @Override
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }

    @Override
    public void onListFragmentInteraction(String title, int position ) {
        if (title == "Compendium") {
            swapToVideoView();
        } else if (title == "Facilities") {
            swapToFacilitysMenu();
        } else if (title == "Around Me"){
            swapToMapView();
        } else if (title == "Go Back"){
            swapToMainMenu();
        } else {
            Facility facility = deviceInformation.Facilities.get(position);
            swapToFacilitiesDetailView(facility.getFacilityDescription(), facility.getFacilityImage());
        }


    }

    private void swapToMainMenu(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.LowGridView, FacilityFragment.newInstance(mainMenu.size(), mainMenu))
                .commit();

    }
    private void swapToFacilitiesDetailView(String facilityDescription, String facilityImage){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.TopCenter, FacilityDetailView.newInstance(facilityDescription, facilityImage))
                .commit();
    }

    private void swapToMapView(){
        android.support.v4.app.Fragment mMapFragment = SupportMapFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.TopCenter, mMapFragment, "AroundMe")
                .commit();

    }

    private void swapToFacilitysMenu(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.LowGridView, FacilityFragment.newInstance(deviceInformation.Facilities.size(),deviceInformation.getFacilities()), "Faciltiy Grid View")
                .commit();
    }

    private void swapToVideoView(){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.TopCenter, MotelVideoView.newInstance(), "VideoView")
                .commit();
    }
}

