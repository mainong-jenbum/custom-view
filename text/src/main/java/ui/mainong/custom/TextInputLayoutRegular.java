package ui.mainong.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputLayout;

public class TextInputLayoutRegular extends TextInputLayout {
    public TextInputLayoutRegular(Context context) {
        super(context);
        init();
    }

    public TextInputLayoutRegular(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextInputLayoutRegular(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Regular.ttf");
            setTypeface(tf);
        }
    }
}
