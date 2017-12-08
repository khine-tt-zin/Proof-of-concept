package com.kttz.padc_proof_of_concept.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by bingbing on 12/8/2017 AD.
 */

public abstract class BaseViewHolder<W> extends RecyclerView.ViewHolder implements View.OnClickListener {

    private W mData;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setData(W data);

}
