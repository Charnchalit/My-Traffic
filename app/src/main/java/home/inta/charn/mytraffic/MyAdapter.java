package home.inta.charn.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.ContentHandler;

/**
 * Created by User on 21/2/2559.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private int[] iconInts;
    private String[] titleStrings, detailShortStrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] detailShortStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.detailShortStrings = detailShortStrings;
    } // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        // About Icon
        ImageView iconImageView = (ImageView) view.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        //About Title
        TextView titleTextView = (TextView) view.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        //About Detail
        TextView detailTextView = (TextView) view.findViewById(R.id.textView3);
        detailTextView.setText(detailShortStrings[i]);

        return view;
    }
}  // Main Class
