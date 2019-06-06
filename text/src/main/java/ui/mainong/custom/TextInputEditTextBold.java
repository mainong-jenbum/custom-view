package ui.mainong.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.google.android.material.textfield.TextInputEditText;

public class TextInputEditTextBold extends TextInputEditText {
    public TextInputEditTextBold(Context context) {
        super(context);
        init();
    }

    public TextInputEditTextBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextInputEditTextBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Bold.ttf");
            setTypeface(tf);
        }
    }
}
