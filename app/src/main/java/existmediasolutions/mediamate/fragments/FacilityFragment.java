package existmediasolutions.mediamate.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.labo.kaji.fragmentanimations.CubeAnimation;
import com.labo.kaji.fragmentanimations.FlipAnimation;

import java.util.ArrayList;

import existmediasolutions.mediamate.R;
import existmediasolutions.mediamate.adapter.FacilityGridViewAdapter;
import existmediasolutions.mediamate.fragments.dummy.DummyContent;
import existmediasolutions.mediamate.fragments.dummy.DummyContent.DummyItem;
import existmediasolutions.mediamate.models.Facility;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class FacilityFragment extends Fragment {
    private ArrayList<Facility> buttons;
    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 4;
    private OnListFragmentInteractionListener mListener;
    private OnFacilityFragmentReadyListener readyListener;
    private ImageButton conBreak;
    private ImageButton cookedBreak;
    private ImageButton roomServ;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public FacilityFragment() {
    }

    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return FlipAnimation.create(FlipAnimation.UP, enter, 1000);
    }
    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static FacilityFragment newInstance(int columnCount, ArrayList<Facility> Buttons) {
        FacilityFragment fragment = new FacilityFragment();
        fragment.buttons = Buttons;
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        ViewGroup parent = (ViewGroup) getActivity().findViewById(R.id.LowGridView);

        View view = inflater.inflate(R.layout.fragment_facility_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            final RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new FacilityGridViewAdapter(buttons, mListener));
            recyclerView.requestFocus();
        }

        readyListener.onFacilityComplete(view);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
            readyListener = (OnFacilityFragmentReadyListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
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
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(String title, int position);
    }

    public interface OnFacilityFragmentReadyListener{
        public void onFacilityComplete(View v);
    }
}
