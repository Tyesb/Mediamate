package existmediasolutions.mediamate;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
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

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import existmediasolutions.mediamate.fragments.AroundMe;
import existmediasolutions.mediamate.fragments.FacilityDetailView;
import existmediasolutions.mediamate.fragments.FacilityFragment;
import existmediasolutions.mediamate.fragments.MotelVideoView;
import existmediasolutions.mediamate.fragments.dummy.DummyContent;
import existmediasolutions.mediamate.handler.ApiClient;
import existmediasolutions.mediamate.handler.ApiHandler;
import existmediasolutions.mediamate.handler.ApiInterface;
import existmediasolutions.mediamate.models.Advertiser;
import existmediasolutions.mediamate.models.DeviceInformation;
import existmediasolutions.mediamate.models.FacilitiesModel;
import existmediasolutions.mediamate.models.Facility;
import existmediasolutions.mediamate.models.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LauncherActivity extends AppCompatActivity implements MotelVideoView.OnFragmentInteractionListener, FacilityFragment.OnListFragmentInteractionListener,
        FacilityFragment.OnFacilityFragmentReadyListener, FacilityDetailView.OnFragmentInteractionListener, ApiHandler.onApiCallbackResponse, OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    ApiHandler apiHandler = new ApiHandler();
    ImageView leftHomeButton;
    ImageView rightHomeButton;
    ArrayList<Facility> mainMenu = new ArrayList<Facility>();
    ApiInterface apiInterface;
    DeviceInformation deviceInformation;
    ArrayList<Facility> lfacilities = new ArrayList<Facility>();
    String facilityImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/92/Backyardpool.jpg/1200px-Backyardpool.jpg";
    SupportMapFragment mMapFragment;
    private LatLngBounds.Builder bounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        apiCall();
        buildMainMenu();
        if (savedInstanceState == null) {
//            android.support.v4.app.Fragment mMapFragment = SupportMapFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
//                    .add(R.id.TopCenter, MotelVideoView.newInstance(), "VideoView")
//                    .add(R.id.TopCenter, mMapFragment, "AroundMe")
                    .add(R.id.LowGridView, FacilityFragment.newInstance(mainMenu.size(), mainMenu))
//                    .add(R.id.LowGridView, FacilityFragment.newInstance(deviceInformation.Facilities.size(),deviceInformation.getFacilities()), "Faciltiy Grid View")
                    .commit();
        }
        hideStatusBar();
        setViews();
        setOnFocusListeners();


    }

    public void buildMainMenu() {
        mainMenu.add(new Facility("Compendium", getResources().getDrawable(R.drawable.reception), "The Motels Compendium", ""));
        mainMenu.add(new Facility("Facilities", getResources().getDrawable(R.drawable.pool), "More Details About The Facilities Availble Here", ""));
        mainMenu.add(new Facility("Around Me", getResources().getDrawable(R.drawable.massage_facility), "Show Partnered Business Near You", ""));
        mainMenu.add(new Facility("Requests", getResources().getDrawable(R.drawable.spaicon), "Request Services", ""));

    }

    public void apiCall() {
        apiHandler.GetDeviceInfo(this);
    }

    public void convertFacility(){
        for (FacilitiesModel facility :deviceInformation.getMotelModel().getFacilitiesModels()) {
            Facility lFacilty = new Facility(facility.getFacilityTitle(),getResources().getDrawable(R.drawable.reception),facility.getDescription(),facility.getFaclityImage());
            lfacilities.add(lFacilty);
        }
    }

    private void BuildBullshitObjects(){
        lfacilities.add(new Facility("Spa", getResources().getDrawable(R.drawable.spaicon), "details about this", facilityImageUrl));
        lfacilities.add(new Facility("Sauna", getResources().getDrawable(R.drawable.sauna), "details about this", facilityImageUrl));
        lfacilities.add(new Facility("Pool", getResources().getDrawable(R.drawable.pool), "details about this", facilityImageUrl));
        lfacilities.add(new Facility("Bar", getResources().getDrawable(R.drawable.bar), "details about this", facilityImageUrl));
        lfacilities.add(new Facility("Restaurant", getResources().getDrawable(R.drawable.resturaunt), "details about this", facilityImageUrl));
        lfacilities.add(new Facility("Go Back", getResources().getDrawable(R.drawable.go_back), "details about this", facilityImageUrl));
    }

    //TODO: Move these to fragments
    public void setViews() {
        leftHomeButton = (ImageView) findViewById(R.id.homeLeftButton);
        rightHomeButton = (ImageView) findViewById(R.id.homeRightButton);
    }

    public void updateImageViews(ImageView imageView, String Url) {
        String imageUri = Url;

        Picasso.with(this).load(imageUri).placeholder(R.drawable.spaicon)
                .into(imageView);
    }

    //"103.242.48.22:65428/resources/new_layout/left_button.png"
    //"103.242.48.22:65428/resources/new_layout/right_button.png"
    public void updateDisplayObjects() {
        updateImageViews(leftHomeButton, deviceInformation.getMotelModel().getThemeModel().getLeftButtonUrl());
        updateImageViews(rightHomeButton, deviceInformation.getMotelModel().getThemeModel().getRightButtonUrl());
    }

    //Hide Action Bar
    private void hideStatusBar() {
        getWindow().getDecorView().setSystemUiVisibility(3846);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        //you can leave it empty
    }

    public void setOnFocusListeners(){
        leftHomeButton.setOnFocusChangeListener(
                new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if (hasFocus) {
                        v.setBackgroundColor(Color.parseColor("#ffffff"));
                    } else {
                        v.setBackgroundColor(Color.parseColor("#000000"));
                    }
                }
                }

        );
    }

    public void onFacilityComplete(View v){
        v.requestFocus();
    }

    public void onApiCallbackListener(DeviceInformation device) {
        deviceInformation = device;
        convertFacility();
        BuildBullshitObjects();
        updateDisplayObjects();
        addNewVideoView();
    }

    public void addNewVideoView(){
        Bundle bundle = new Bundle();
        bundle.putString("VideoUri",deviceInformation.getMotelModel().getMotelVideo());
        MotelVideoView videoViewFrag = new MotelVideoView();
        videoViewFrag.setArguments(bundle);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.TopCenter, videoViewFrag, "VideoView")
                .commit();
    }
    @Override
    public void onListFragmentInteraction(String title, int position) {
        if (title == "Compendium") {
            swapToVideoView();
        } else if (title == "Facilities") {
            swapToFacilitysMenu();
        } else if (title == "Around Me") {
            swapToMapView();
        } else if (title == "Go Back") {
            swapToMainMenu();
        } else if (title == "Requests") {
            sendRequest();
        } else {
            Facility facility = this.lfacilities.get(position);
            swapToFacilitiesDetailView(facility.getFacilityDescription(), facility.getFacilityImage());
        }

    }

    private void swapToMainMenu() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.LowGridView, FacilityFragment.newInstance(mainMenu.size(), mainMenu))
                .commit();

    }

    private void swapToFacilitiesDetailView(String facilityDescription, String facilityImage) {
        Bundle bundle = new Bundle();
        bundle.putString("FacilityDescription",facilityDescription);
        bundle.putString("FacilityImage", facilityImage);
        FacilityDetailView facilityDetailFrag = new FacilityDetailView();
        facilityDetailFrag.setArguments(bundle);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.TopCenter, facilityDetailFrag)
                .commit();
    }

    @Override
    public void onMapReady(GoogleMap googleMap){
        googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(deviceInformation.getMotelModel().getMotelLat(), deviceInformation.getMotelModel().getMotellong()), 15));
        makeMarkers(googleMap);
    }

    public void makeMarkers(GoogleMap googleMap){
        bounds = new LatLngBounds.Builder();
        for (Advertiser advertiser: deviceInformation.getMotelModel().getAdvertisers()) {
            if (advertiser.getAdvertiserLat() != null) {
                googleMap.addMarker(new MarkerOptions()
                        .position(new LatLng(advertiser.getAdvertiserLat(), advertiser.getAdvertiserLong()))
                        .title(advertiser.getAdvertiserTitle())
                        .snippet(advertiser.getAdvertiserSnippet())

                );
                bounds.include(new LatLng(advertiser.getAdvertiserLat(), advertiser.getAdvertiserLong()));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(bounds.build(), 20));
            }
        }
    }
    @Override
    public boolean onMarkerClick(final Marker marker) {
        Toast.makeText(this, marker.getSnippet(), Toast.LENGTH_SHORT).show();
        return true;
    };


    private void swapToMapView() {
        mMapFragment = SupportMapFragment.newInstance();
        mMapFragment.getMapAsync(this);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.TopCenter, mMapFragment, "AroundMe")
                .commit();

    }

    private void swapToFacilitysMenu(){
        getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.LowGridView, FacilityFragment.newInstance(lfacilities.size(),lfacilities))
            .commit();
    }

    private void swapToVideoView(){
        Bundle bundle = new Bundle();
        bundle.putString("VideoUri",deviceInformation.getMotelModel().getMotelVideo());
        MotelVideoView videoViewFrag = new MotelVideoView();
        videoViewFrag.setArguments(bundle);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.TopCenter, videoViewFrag, "VideoView")
                .commit();
    }

    private void sendRequest(){
        apiHandler.sendRequest();
    }
}

