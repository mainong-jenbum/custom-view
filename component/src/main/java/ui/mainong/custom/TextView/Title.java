package ui.mainong.custom.TextView;

import android.content.Context;
import android.util.AttributeSet;

public class Title extends TextViewRobotoBold {
    public Title(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Title(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Title(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTextSize(20);
        }
    }
}
