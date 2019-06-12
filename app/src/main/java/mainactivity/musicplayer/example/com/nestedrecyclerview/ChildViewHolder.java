package mainactivity.musicplayer.example.com.nestedrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class ChildViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView textView;
    private Listener listener;
    private int position;

    public ChildViewHolder(@NonNull View itemView, final Listener listener) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
        this.listener = listener;
        this.position = getPosition();
    }

    public void bind(final ChildEntity childEntity) {
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onChildItemClick(childEntity,position);
            }
        });

        Glide.with(itemView)
                .asBitmap()
                .load(childEntity.getUrl())
                .apply(new RequestOptions()
                        .transforms(new CenterCrop(),
                                new RoundedCorners(15)))
                .into(imageView);
        textView.setText(childEntity.getTitle());
    }
}
