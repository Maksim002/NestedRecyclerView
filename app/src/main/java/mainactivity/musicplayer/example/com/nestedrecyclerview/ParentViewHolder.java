package mainactivity.musicplayer.example.com.nestedrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ParentViewHolder extends RecyclerView.ViewHolder {
    private RecyclerView childRecyclerView;
    private ChildAdapter adapter;

    public ParentViewHolder(@NonNull View itemView, Listener listener) {
        super(itemView);
        childRecyclerView = itemView.findViewById(R.id.childRecyclerView);
        childRecyclerView.setAdapter(adapter = new ChildAdapter(listener));
    }

    public void bind(ParentEntity data) {
        adapter.update(data.getList());
    }
}
