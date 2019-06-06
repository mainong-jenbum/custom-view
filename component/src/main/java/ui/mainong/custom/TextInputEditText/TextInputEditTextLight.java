package ui.mainong.custom.TextInputEditText;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.google.android.material.textfield.TextInputEditText;

public class TextInputEditTextLight extends TextInputEditText {
    public TextInputEditTextLight(Context context) {
        super(context);
        init();
    }

    public TextInputEditTextLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextInputEditTextLight(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Light.ttf");
            setTypeface(tf);
        }
    }
}
