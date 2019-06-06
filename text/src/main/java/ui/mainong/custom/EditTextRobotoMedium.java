package ui.mainong.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class EditTextRobotoMedium extends AppCompatEditText {

    public EditTextRobotoMedium(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public EditTextRobotoMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditTextRobotoMedium(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Medium.ttf");
            setTypeface(tf);
        }
    }

}