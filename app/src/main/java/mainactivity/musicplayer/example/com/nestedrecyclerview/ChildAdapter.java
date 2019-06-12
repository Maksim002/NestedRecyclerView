package mainactivity.musicplayer.example.com.nestedrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildViewHolder> {
    private List<ChildEntity> list = new ArrayList<>();
    private Listener listener;

    public ChildAdapter(Listener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_viewtype_two, viewGroup, false);
        return new ChildViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder childViewHolder, int i) {
        childViewHolder.bind(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void update(List<ChildEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }
}
