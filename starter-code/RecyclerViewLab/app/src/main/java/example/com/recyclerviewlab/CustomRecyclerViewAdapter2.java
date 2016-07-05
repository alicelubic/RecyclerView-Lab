package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by owlslubic on 7/5/16.
 */
public class CustomRecyclerViewAdapter2 extends RecyclerView.Adapter<CustomViewHolder2> {
    List<CustomObject2> customObjectList2;

    public CustomRecyclerViewAdapter2(List<CustomObject2> customObjects2){
        customObjectList2 = customObjects2;
    }

    @Override
    public CustomViewHolder2 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_layout_2, parent, false);
        CustomViewHolder2 viewHolder2 = new CustomViewHolder2(parentView);
        return viewHolder2;
    }


    @Override
    public void onBindViewHolder(final CustomViewHolder2 holder, final int position) {
        holder.mTextView1.setBackgroundColor(customObjectList2.get(position).getmColor(‎)).parseInteger;
        holder.mTextView2.setText(customObjectList2.get(position).getmTitle());
        holder.mTextView3.setText(customObjectList2.get(position).getmDescription());
        holder.mLayout2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(holder.mCheckBox.isChecked()){
                    holder.mCheckBox.setChecked(false);
                    Toast.makeText(view.getContext(), "Unchecked!", Toast.LENGTH_SHORT).show();
                }
                else{
                    holder.mCheckBox.setChecked(true);
                    Toast.makeText(view.getContext(), "Checked!", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }

    @Override
    public int getItemCount() {
        return customObjectList2.size();
    }
}
