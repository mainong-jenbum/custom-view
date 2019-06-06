package ui.mainong.custom.TextView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class TextViewHelveticaNeueCondObl extends AppCompatTextView {

    public TextViewHelveticaNeueCondObl(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewHelveticaNeueCondObl(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewHelveticaNeueCondObl(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/HelveticaNeue-CondObl.ttf");
            setTypeface(tf);
        }
    }

}
