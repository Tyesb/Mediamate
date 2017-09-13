package existmediasolutions.mediamate.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import existmediasolutions.mediamate.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MotelVideoView.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MotelVideoView#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MotelVideoView extends Fragment {

    private VideoView motelVideoView;


    private OnFragmentInteractionListener mListener;

    public MotelVideoView() {
        // Required empty public constructor
    }

    private void initVidView()
    {
        getVideo("http://103.242.48.22:65428/resources/new_layout/main_roll.wmv");
        startPlayback();
    }
    private void startPlayback()
    {
        motelVideoView.start();
    }

    private void getVideo(String motelVideoUrl)
    {
        motelVideoView.setVideoURI(Uri.parse(motelVideoUrl));
    }


    public static MotelVideoView newInstance() {
        MotelVideoView fragment = new MotelVideoView();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_video_view, container, false);
        motelVideoView = (VideoView) root.findViewById(R.id.homeVideoView);
        initVidView();
        return root;
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
