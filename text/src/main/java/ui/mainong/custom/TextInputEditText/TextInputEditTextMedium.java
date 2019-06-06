package ui.mainong.custom.TextInputEditText;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.google.android.material.textfield.TextInputEditText;

public class TextInputEditTextMedium extends TextInputEditText {
    public TextInputEditTextMedium(Context context) {
        super(context);
        init();
    }

    public TextInputEditTextMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextInputEditTextMedium(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Medium.ttf");
            setTypeface(tf);
        }
    }
}
