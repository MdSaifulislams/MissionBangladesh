package snakex.missionbangladesh.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class District_Activity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"ঢাকা",
            "নরসিংদী",
            "ফরিদপুর",
            "গোপালগঞ্জ",
            "মাদারীপুর",
            "শরীয়তপুর",
            "রাজবাড়ী" ,
            "গাজীপুর" ,
            "মানিকগঞ্জ" ,
            "মুন্সীগঞ্জ" ,
            "নারায়নগঞ্জ" ,
            "টাঙ্গাইল" ,
            "কিশোরগঞ্জ" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);

        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
       getSupportActionBar().setTitle("ঢাকা বিভাগ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}