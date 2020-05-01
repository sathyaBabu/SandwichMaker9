package lsandwichmaker.sathya.adp.com.sandwichmaker9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;


public class ItemDivider extends  RecyclerView.ItemDecoration {
    // RecyclerView.RecycledViewPool

    private static final int[] ATTRS = new int[]{android.R.attr.listDivider};
    private Drawable divider;

    public ItemDivider(Context context) {
        final TypedArray styledAttributes = context.obtainStyledAttributes(ATTRS);
        divider = styledAttributes.getDrawable(0);
        styledAttributes.recycle();
    }

    public ItemDivider(Context context, int resId) {
        divider = ContextCompat.getDrawable(context, resId);
    }

    @Override
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();

        int count = parent.getChildCount();
        Log.d("tag"," Child count : "+count);

        for (int i = 0; i < count; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

           // RecyclerView.RecycledViewPool recycledViewPool =

            int top = child.getBottom() + params.bottomMargin;
            int bottom = top + divider.getIntrinsicHeight();

            divider.setBounds(left, top, right, bottom);
            divider.draw(canvas);
        }
   }
}
