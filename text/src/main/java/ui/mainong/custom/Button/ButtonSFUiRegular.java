package ui.mainong.custom.Button;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

public class ButtonSFUiRegular extends AppCompatButton {

    public ButtonSFUiRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public ButtonSFUiRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonSFUiRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/sfuitext_regular.ttf");
            setTypeface(tf);
        }
    }
}
