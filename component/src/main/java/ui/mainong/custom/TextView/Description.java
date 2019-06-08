package ui.mainong.custom.TextView;

import android.content.Context;
import android.util.AttributeSet;

import androidx.core.content.ContextCompat;

import ui.mainong.custom.R;

public class Description extends TextViewRobotoBold {
    private Context context;

    public Description(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        init();
    }

    public Description(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    public Description(Context context) {
        super(context);
        this.context = context;
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTextSize(14);
            setTextColor(ContextCompat.getColor(context, R.color.colorDescription));
        }
    }
}
