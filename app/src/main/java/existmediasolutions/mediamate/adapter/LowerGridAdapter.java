package existmediasolutions.mediamate.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import existmediasolutions.mediamate.R;
import existmediasolutions.mediamate.views.FacilityGridViewItem;

import static android.R.attr.data;

/**
 * Created by tye on 9/9/2017.
 */

public class LowerGridAdapter extends ArrayAdapter {

    private Context mContext;
    private int layoutResourceId;

    public LowerGridAdapter(Context context, List items) {
        super(context, R.layout.facilitygridviewitem, items);
        this.mContext = context;
    }

/*
    public FacilityGridViewItem itemBuilder(int position){
        String text = data.get(position).getTitle();
        Image image = data.get(position).getImage();
        String details = data.get(position).getDetails();

        FacilityGridViewItem thisItem = new FacilityGridViewItem(text,details,image);
        return thisItem;
    }
*/

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        FacilityGridViewItem item = (FacilityGridViewItem)getItem(position);
        View viewToUse = null;

        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            holder = new ViewHolder();
            holder.FacilityTitle = (TextView)viewToUse.findViewById(R.id.griditemtext);
            holder.FacilityImage = (ImageView) viewToUse.findViewById(R.id.griditemimage);
            viewToUse.setTag(holder);
        } else {
            viewToUse = convertView;
            holder = (ViewHolder) viewToUse.getTag();
        }
        return viewToUse;
    }

    static class ViewHolder {
        TextView FacilityTitle;
        ImageView FacilityImage;
    }

}
