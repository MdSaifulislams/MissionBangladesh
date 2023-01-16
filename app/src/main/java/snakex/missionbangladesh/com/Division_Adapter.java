package snakex.missionbangladesh.com;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Division_Adapter extends RecyclerView.Adapter<Division_Adapter.Divisionviewholder> {
        Context context;
        List<Division> divisionList;
    ArrayList<String> district_name;
    public Division_Adapter(Context context, List<Division> divisionList) {
        this.context = context;
        this.divisionList=divisionList;

    }

    @NonNull
    @Override
    public Divisionviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.simplo_row,parent,false);

        return new Divisionviewholder(view);
    }

    @Override
    public int getItemCount() {
        return divisionList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull Divisionviewholder holder, int position) {
        Division division = this.divisionList.get(position);
        holder.Division_name.setText(division.getName());

        holder.itemView.setOnClickListener(view -> {
            switch (position) {
                case 0:
                    district_name = new ArrayList<>();
                    district_name.add("ঢাকা");
                    district_name.add("নরসিংদী");
                    district_name.add("ফরিদপুর");
                    district_name.add("গোপালগঞ্জ");
                    district_name.add("মাদারীপুর");
                    district_name.add("শরীয়তপুর");
                    district_name.add("রাজবাড়ী");
                    district_name.add("গাজীপুর");
                    district_name.add("মানিকগঞ্জ");
                    district_name.add("মুন্সীগঞ্জ");
                    district_name.add("নারায়নগঞ্জ");
                    district_name.add("টাঙ্গাইল");
                    district_name.add("কিশোরগঞ্জ");
                    Intent intent = new Intent(context, District_Activity.class);
                    intent.putExtra("key", district_name);
                    intent.putExtra("divname",division.getName());
                    context.startActivity(intent);
                    break;
             //   চট্টগ্রাম, কুমিল্লা, কক্সবাজার, নোয়াখালী, ব্রাহ্মণবাড়িয়া, চাঁদপুর, লক্ষ্মীপুর, ফেনী, খাগড়াছড়ি, রাঙ্গামাটি, বান্দরবান
                    case 1:
                     district_name = new ArrayList<>();
                    district_name.add("চট্টগ্রাম");
                    district_name.add("কুমিল্লা");
                    district_name.add("কক্সবাজার");
                    district_name.add("নোয়াখালী");
                    district_name.add("ব্রাহ্মণবাড়িয়া");
                    district_name.add("চাঁদপুর");
                    district_name.add("লক্ষ্মীপুর");
                    district_name.add("ফেনী");
                    district_name.add("খাগড়াছড়ি");
                    district_name.add("রাঙ্গামাটি");
                    district_name.add("বান্দরবান");
                    Intent intent1 = new Intent(context, District_Activity.class);
                    intent1.putExtra("key", district_name);
                    intent1.putExtra("divname",division.getName());
                    context.startActivity(intent1);
                    break;


            }
        });
    }




   public class Divisionviewholder extends RecyclerView.ViewHolder{
        TextView Division_name;
        public Divisionviewholder(@NonNull View itemView) {
            super(itemView);
            Division_name=itemView.findViewById(R.id.name);

        }


   }
}
