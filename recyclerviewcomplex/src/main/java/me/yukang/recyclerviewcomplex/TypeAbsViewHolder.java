package me.yukang.recyclerviewcomplex;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by yukang on 17-9-11.
 */

public abstract class TypeAbsViewHolder<T> extends RecyclerView.ViewHolder {

    public TypeAbsViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindHolder(T model);
    
}
