package snakex.missionbangladesh.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class District_Activity extends AppCompatActivity {
    ListView simpleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayList<String> district_name = (ArrayList<String>) getIntent().getSerializableExtra("key");
        String Div_name = getIntent().getStringExtra("divname");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, district_name);
        simpleList.setAdapter(arrayAdapter);
       getSupportActionBar().setTitle(Div_name+" বিভাগ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}