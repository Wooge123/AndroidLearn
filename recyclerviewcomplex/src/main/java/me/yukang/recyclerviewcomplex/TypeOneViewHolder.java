package me.yukang.recyclerviewcomplex;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yukang on 17-9-11.
 */

public class TypeOneViewHolder extends TypeAbsViewHolder<DataModelOne> {

    public ImageView avatar;

    public TextView name;

    public TypeOneViewHolder(View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        itemView.setBackgroundColor(Color.BLACK);
    }

    @Override
    public void bindHolder(DataModelOne model) {
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
    }
}
