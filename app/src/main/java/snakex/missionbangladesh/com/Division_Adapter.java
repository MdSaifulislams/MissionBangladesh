package snakex.missionbangladesh.com;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Division_Adapter extends RecyclerView.Adapter<Division_Adapter.Divisionviewholder> {
        Context context;
        List<Division> divisionList;

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
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(context,District_Activity.class);
                context.startActivity(intent);
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
