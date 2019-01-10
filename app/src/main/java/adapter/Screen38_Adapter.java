package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vaibhav.screen38.R;

import java.util.ArrayList;

import model.Screen38_Model;

public class Screen38_Adapter extends RecyclerView.Adapter<Screen38_Adapter.ViewHolder> {

    Context context;
    ArrayList<Screen38_Model>screen38_models;

    public Screen38_Adapter(Context context, ArrayList<Screen38_Model> screen38_models) {
        this.context = context;
        this.screen38_models = screen38_models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_screen38,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imgpicgiral.setImageResource(screen38_models.get(position).getImgpicgiral());
        holder.profileimage.setImageResource(screen38_models.get(position).getProfileimage());
        holder.tv1.setText(screen38_models.get(position).getTv1());
        holder.tv2.setText(screen38_models.get(position).getTv2());
        holder.tv3.setText(screen38_models.get(position).getTv3());
        holder.tv4.setText(screen38_models.get(position).getTv4());
        holder.tv5.setText(screen38_models.get(position).getTv5());
        holder.tv6.setText(screen38_models.get(position).getTv6());
        holder.tv7.setText(screen38_models.get(position).getTv7());
    }

    @Override
    public int getItemCount() {
        return screen38_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgpicgiral;
        ImageView profileimage;
        TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7;
        public ViewHolder(View itemView) {
            super(itemView);

            imgpicgiral = itemView.findViewById(R.id.imgpicgiral);
            profileimage = itemView.findViewById(R.id.profileimage);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
            tv3 = itemView.findViewById(R.id.tv3);
            tv4 = itemView.findViewById(R.id.tv4);
            tv5 = itemView.findViewById(R.id.tv5);
            tv6 = itemView.findViewById(R.id.tv6);
            tv7 = itemView.findViewById(R.id.tv7);
        }
    }
}
