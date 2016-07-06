package example.com.recyclerviewlab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by owlslubic on 7/5/16.
 */
public class CustomViewHolder1 extends RecyclerView.ViewHolder {

    public TextView mTextView1, mTextView2, mTextView3;
    public RelativeLayout mLayout1;


    public CustomViewHolder1(View itemView) {
        super(itemView);

        mTextView1 = (TextView) itemView.findViewById(R.id.textview_color1);
        mTextView2 = (TextView) itemView.findViewById(R.id.textview_title1);
        mTextView3 = (TextView) itemView.findViewById(R.id.textview_desc1);
        mLayout1 = (RelativeLayout) itemView.findViewById(R.id.layout1);}

    public Context getContext() {
        return mTextView1.getContext();
    }


    }

