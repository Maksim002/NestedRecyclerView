package mainactivity.musicplayer.example.com.nestedrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import mainactivity.musicplayer.example.com.nestedrecyclerview.Intenti.Test;

public class MainActivity extends AppCompatActivity implements Listener{

    private Boolean simple = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.childRecyclerView);
        recyclerView.setAdapter(new ParentAdapter(getData(), this));
    }

    private List<ParentEntity> getData() {
        List<ParentEntity> list = new ArrayList<>();
        list.add(new ParentEntity(getChildList()));
        list.add(new ParentEntity(getChildList()));
        list.add(new ParentEntity(getChildList()));
        list.add(new ParentEntity(getChildList()));
        list.add(new ParentEntity(getChildList()));
        return list;
    }

    private List<ChildEntity> getChildList() {
        List<ChildEntity> list = new ArrayList<>();
        list.add(getChildData("1", "https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2"));
        list.add(getChildData("2", "https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2"));
        list.add(getChildData("3", "https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2"));
        list.add(getChildData("4", "https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2"));
        list.add(getChildData("8", "https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2"));
        list.add(getChildData("9", "https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2"));
        list.add(getChildData("10", "https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2"));
        list.add(getChildData("11", "https://qph.fs.quoracdn.net/main-qimg-2134f48c58e438fbb50cf2be03801ec2"));
        return list;
    }

    private ChildEntity getChildData(String title, String url) {
        return new ChildEntity(title, url);
    }

    @Override
    public void onChildItemClick(ChildEntity tag,int position) {
        Toast.makeText(this, tag.getTitle(), Toast.LENGTH_SHORT).show();
        switch (position){
            case 0:
                Intent intent = new Intent(MainActivity.this, Test.class);
                startActivity(intent);
                break;
        }
    }
}
