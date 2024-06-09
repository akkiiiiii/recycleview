package thecseguide.com;


/* @author www.thecseguide.com

This is an adapter for recycle-view it is used to show the data in recycle-view
in this adapter their are three main methods to understand

1. onCreateViewHolder() = We return the layout we want to use to display out data in recycle-view.

2. onBindViewHolder() = In this method we set our data in every layout with the help of index number.

3. getItemCount() = In this method we tell our adapter about what is the size of our recycleview is going to be. So that our recycleview generates layouts according to that

*/

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterForRecycleview extends RecyclerView.Adapter<AdapterForRecycleview.MyViewHolder> {

    Activity activity;
    Context context;

    List<studentDataClass> studentDataClassList;

    public AdapterForRecycleview(Activity activity, Context context, List<studentDataClass> studentDataClassList) {
        this.activity = activity;
        this.context = context;
        this.studentDataClassList = studentDataClassList;
    }

    @NonNull
    @Override
    public AdapterForRecycleview.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_layout_for_recycleview,parent,false);
        return new MyViewHolder(view);
    }




    @Override
    public void onBindViewHolder(@NonNull AdapterForRecycleview.MyViewHolder holder, int position) {

        // We are using String.valueOf() of function to convert our int values in string
        holder.AgeTxt.setText(activity.getString(R.string.age)+String.valueOf(studentDataClassList.get(position).Age));
        holder.MarksTxt.setText(activity.getString(R.string.marks)+String.valueOf(studentDataClassList.get(position).Marks + "/800"));


        holder.NameTxt.setText(activity.getString(R.string.name)+studentDataClassList.get(position).name);

    }

    @Override
    public int getItemCount() {
        return studentDataClassList.size();
    }


    // Here we are declaring the components we used in the creation of holder layout by using findViewById
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView NameTxt;
        TextView MarksTxt;
        TextView AgeTxt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            NameTxt = itemView.findViewById(R.id.NameTxt);
            MarksTxt = itemView.findViewById(R.id.MarksTxt);
            AgeTxt = itemView.findViewById(R.id.AgeTxt);

        }
    }
}
