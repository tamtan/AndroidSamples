package vinh.tan.tam.com.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Repo> list;

    public void setList(List<Repo> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.itemlayout, parent, false);
        RVViewHolder holder = new RVViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RVViewHolder) {
            RVViewHolder holder1 = (RVViewHolder) holder;
            holder1.tvName.setText(list.get(position).getPropertyId());
        }
    }

    @Override
    public int getItemCount() {

        return list != null ? list.size() : 0;
    }

    class RVViewHolder extends RecyclerView.ViewHolder {

        public TextView tvName;

        public RVViewHolder(@NonNull View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.textView);
        }

    }

}

