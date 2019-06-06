package ui.mainong.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputLayout;

public class TextInputLayoutMedium extends TextInputLayout {
    public TextInputLayoutMedium(Context context) {
        super(context);
        init();
    }

    public TextInputLayoutMedium(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextInputLayoutMedium(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Roboto-Medium.ttf");
            setTypeface(tf);
        }
    }
}
