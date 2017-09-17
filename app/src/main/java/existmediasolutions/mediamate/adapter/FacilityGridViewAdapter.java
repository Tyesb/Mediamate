package existmediasolutions.mediamate.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import existmediasolutions.mediamate.R;
import existmediasolutions.mediamate.fragments.FacilityFragment.OnListFragmentInteractionListener;
import existmediasolutions.mediamate.fragments.dummy.DummyContent.DummyItem;
import existmediasolutions.mediamate.models.Facility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class FacilityGridViewAdapter extends RecyclerView.Adapter<FacilityGridViewAdapter.ViewHolder> {

    private final ArrayList<Facility> mValues;
    private final OnListFragmentInteractionListener mListener;

    public FacilityGridViewAdapter(ArrayList<Facility> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_facility, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).getFacilityTitle());
        holder.mContentView.setImageDrawable(mValues.get(position).getFacilityIcon());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
//                    mListener.onListFragmentInteraction(holder.mItem);
                    String title = mValues.get(position).getFacilityTitle();
                    mListener.onListFragmentInteraction(title, position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final ImageView mContentView;
        public Facility mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.griditemtext);
            mContentView = (ImageView) view.findViewById(R.id.griditemimage);
        }

            }
}
