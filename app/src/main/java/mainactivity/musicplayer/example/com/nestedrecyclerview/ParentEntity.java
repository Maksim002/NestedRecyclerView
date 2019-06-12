package mainactivity.musicplayer.example.com.nestedrecyclerview;

import java.util.List;

public class ParentEntity {
    private List<ChildEntity> list;

    public ParentEntity(List<ChildEntity> list) {
        this.list = list;
    }

    public List<ChildEntity> getList() {
        return list;
    }

    public void setList(List<ChildEntity> list) {
        this.list = list;
    }
}
