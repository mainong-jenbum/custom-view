package ui.mainong.custom.TextView;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;

public class StrikeThrough extends TextViewRobotoRegular {


    public StrikeThrough(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public StrikeThrough(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public StrikeThrough(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setPaintFlags(getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }
}
