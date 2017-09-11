package me.yukang.recyclerviewcomplex;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yukang on 17-9-11.
 */

public class TypeTwoViewHolder extends TypeAbsViewHolder<DataModelTwo> {

    public ImageView avatar;

    public TextView name;

    public TextView content;

    public TypeTwoViewHolder(View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        content = itemView.findViewById(R.id.content);
        itemView.setBackgroundColor(Color.GREEN);
    }


    @Override
    public void bindHolder(DataModelTwo model) {
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
        content.setText(model.content);
    }
}
