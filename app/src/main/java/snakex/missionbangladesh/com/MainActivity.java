package snakex.missionbangladesh.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Division> divisionList;
RecyclerView recyclerView;
Division_Adapter adapter;
@Override
protected void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 setContentView(R.layout.activity_main);
	 divisionList =new ArrayList<>();
	 divisionList.add(new Division("ঢাকা"));
	 divisionList.add(new Division("চট্টগ্রাম"));
	 divisionList.add(new Division("রাজশাহী"));
	 divisionList.add(new Division("খুলনা"));
	 divisionList.add(new Division("সিলেট"));
	 divisionList.add(new Division("বরিশাল"));
	 divisionList.add(new Division("রংপুর"));
	 divisionList.add(new Division("ময়মনসিংহ"));

	 recyclerView =findViewById(R.id.recyclerView);
	adapter = new Division_Adapter(this, divisionList);
	StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
	recyclerView.setLayoutManager(staggeredGridLayoutManager);
	recyclerView.setAdapter(adapter);
	Log.i("TAG", "onCreate: "+divisionList.toString());
}
}