package mainactivity.musicplayer.example.com.nestedrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter<ParentViewHolder> {
    private List<ParentEntity> data;
    private Listener listener;

    public ParentAdapter(List<ParentEntity> data, Listener listener) {
        this.data = data;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_viewtype_one, viewGroup, false);
        return new ParentViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
