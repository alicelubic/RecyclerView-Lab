package example.com.recyclerviewlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_main);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        List<CustomObject1> customObjectsList1 = new ArrayList<>();
        customObjectsList1.add(new CustomObject1("Hi", "idk", "color")); //change all mcolor to ints
        customObjectsList1.add(new CustomObject1("title", "description", "color"));
        customObjectsList1.add(new CustomObject1("title", "description", "color"));
        customObjectsList1.add(new CustomObject1("title", "description", "color"));
        customObjectsList1.add(new CustomObject1("title", "description", "color"));
        customObjectsList1.add(new CustomObject1("title", "description", "color"));
        customObjectsList1.add(new CustomObject1("title", "description", "color"));
        customObjectsList1.add(new CustomObject1("title", "description", "color"));
        customObjectsList1.add(new CustomObject1("title", "description", "color"));
        customObjectsList1.add(new CustomObject1("title", "description", "color"));

        CustomRecyclerViewAdapter1 adapter1 = new CustomRecyclerViewAdapter1(customObjectsList1);
        mRecyclerView.setAdapter(adapter1);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondaryActivity.class);
                startActivity(intent);
            }
        }

        );


    }
}
