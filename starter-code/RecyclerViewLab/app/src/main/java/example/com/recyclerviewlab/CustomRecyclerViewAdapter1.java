package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by owlslubic on 7/5/16.
 */
public class CustomRecyclerViewAdapter1 extends RecyclerView.Adapter<CustomViewHolder1>{
   List<CustomObject1> customObjectsList1;

    public CustomRecyclerViewAdapter1(List<CustomObject1> customObjects1){
        customObjectsList1 = customObjects1;
    }

    @Override
    public CustomViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom_layout_1, parent, false);
        CustomViewHolder1 viewHolder1 = new CustomViewHolder1(parentView);
        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder1 holder, final int position) {
        CustomObject1 customObject1 = customObjectsList1.get(position);
       //skipped the setText part..do I need it?
        holder.mTextView1.setOnClickListener(new View.OnClickListener(){

            //do i need to do this for view2, 3 etc?

            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Row "+position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return customObjectsList1.size();
    }
}
