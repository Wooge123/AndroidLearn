package me.yukang.recyclerviewcomplex;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private DemoAdapter mAdapter;

    int colors[] = {android.R.color.holo_red_dark,
            android.R.color.holo_blue_dark,
            android.R.color.holo_orange_dark};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycler_view);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int type = mRecyclerView.getAdapter().getItemViewType(position);

                if (type == 3) return gridLayoutManager.getSpanCount();
                else return 1;

            }
        });
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
                int spanSize = layoutParams.getSpanSize();
                int spanIndex = layoutParams.getSpanIndex();
                outRect.top = 20;
                if (spanSize != gridLayoutManager.getSpanCount()) {
                    if (spanIndex == 1) {
                        outRect.left = 10;
                    } else {
                        outRect.right = 10;
                    }
                }
            }
        });
        mAdapter = new DemoAdapter(this);
        initData();
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initData() {

        List<DataModelOne> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DataModelOne data = new DataModelOne();
            data.avatarColor = colors[0];
            data.name = "name" + 1;
            list1.add(data);
        }

        List<DataModelTwo> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DataModelTwo data = new DataModelTwo();
            data.avatarColor = colors[1];
            data.name = "name" + 1;
            data.content = "content ";
            list2.add(data);
        }

        List<DataModelThree> list3 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            DataModelThree data = new DataModelThree();
            data.avatarColor = colors[2];
            data.name = "name" + 1;
            data.content = "content ";
            data.contentColor = colors[2];
            list3.add(data);
        }

        mAdapter.addList(list1, list2, list3);
        mAdapter.notifyDataSetChanged();
    }

}
