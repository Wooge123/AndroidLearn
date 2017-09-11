package me.yukang.recyclerviewcomplex;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yukang on 17-9-11.
 */

public class TypeThreeViewHolder extends TypeAbsViewHolder<DataModelThree> {

    public ImageView avatar;

    public TextView name;

    public TextView content;

    public ImageView contentImage;

    public TypeThreeViewHolder(View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        content = itemView.findViewById(R.id.content);
        contentImage = itemView.findViewById(R.id.contentImage);
        itemView.setBackgroundColor(Color.GRAY);
    }

    @Override
    public void bindHolder(DataModelThree model) {
        avatar.setBackgroundResource(model.avatarColor);
        name.setText(model.name);
        content.setText(model.content);
        contentImage.setBackgroundResource(model.contentColor);
    }
}
