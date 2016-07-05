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
    public void onBindViewHolder(CustomViewHolder2 holder, int position) {
        CustomObject2 customObject2 = customObjectList2.get(position);


    }

    @Override
    public int getItemCount() {
        return customObjectList2.size();
    }
}
