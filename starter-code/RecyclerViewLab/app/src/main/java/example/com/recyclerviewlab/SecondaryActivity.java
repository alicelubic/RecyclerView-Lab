package example.com.recyclerviewlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondaryActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_secondary);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        List<CustomObject2> customObjectsList2 = new ArrayList<>();
        customObjectsList2.add(new CustomObject2("Hi", "idk", "#FFFFFF", false));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));
        customObjectsList2.add(new CustomObject2("title", "description", "color", true));

        CustomRecyclerViewAdapter2 adapter2 = new CustomRecyclerViewAdapter2(customObjectsList2);
        mRecyclerView.setAdapter(adapter2);

    }
}
