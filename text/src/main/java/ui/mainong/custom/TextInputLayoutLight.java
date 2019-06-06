package ui.mainong.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputLayout;

public class TextInputLayoutLight extends TextInputLayout {
    public TextInputLayoutLight(Context context) {
        super(context);
        init();
    }

    public TextInputLayoutLight(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextInputLayoutLight(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Light.ttf");
            setTypeface(tf);
        }
    }
}
