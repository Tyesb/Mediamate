package existmediasolutions.mediamate;

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
import com.squareup.picasso.Picasso;

import existmediasolutions.mediamate.fragments.AroundMe;
import existmediasolutions.mediamate.fragments.MotelVideoView;

public class LauncherActivity extends AppCompatActivity implements MotelVideoView.OnFragmentInteractionListener {

    ImageView leftHomeButton;
    ImageView rightHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.TopCenter, MotelVideoView.newInstance(), "rageComicList")
                    .commit();
        }
        hideStatusBar();
        setViews();
        updateDisplayObjects();

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
}
