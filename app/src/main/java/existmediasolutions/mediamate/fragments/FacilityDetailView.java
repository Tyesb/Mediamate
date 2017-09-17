package existmediasolutions.mediamate.fragments;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.labo.kaji.fragmentanimations.CubeAnimation;
import com.squareup.picasso.Picasso;

import existmediasolutions.mediamate.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FacilityDetailView.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FacilityDetailView#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FacilityDetailView extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String FacilityImageUrl;
    private String FacilityDetailsString;

    private OnFragmentInteractionListener mListener;

    public FacilityDetailView() {
        // Required empty public constructor
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return CubeAnimation.create(CubeAnimation.UP, enter, 100);
    }

    // TODO: Rename and change types and number of parameters
    public static FacilityDetailView newInstance(String faciltyDetailsString, String faciltyImageString) {
        FacilityDetailView fragment = new FacilityDetailView();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, faciltyDetailsString);
        args.putString(ARG_PARAM2, faciltyImageString );
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            FacilityImageUrl = getArguments().getString(ARG_PARAM1);
            FacilityDetailsString = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_facility_detail_view, container, false);
        TextView facilityDetailStringDisplay = (TextView) root.findViewById(R.id.FacilityDetailTextView);
        ImageView facilityDetailImageDisplay = (ImageView) root.findViewById(R.id.FacilityDetailViewImage);
        updateDisplayProperties(facilityDetailStringDisplay, facilityDetailImageDisplay);
        return inflater.inflate(R.layout.fragment_facility_detail_view, container, false);
    }

    private void updateDisplayProperties(TextView textView, ImageView imageView){
        textView.setText(FacilityDetailsString);
        updateImageView(imageView);

    }

    private void updateImageView(ImageView imageView){
        Picasso.with(getContext()).load((FacilityImageUrl)).placeholder(R.drawable.spaicon)
                .into(imageView);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
