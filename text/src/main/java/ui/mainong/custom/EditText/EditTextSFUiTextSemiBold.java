package ui.mainong.custom.EditText;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class EditTextSFUiTextSemiBold extends AppCompatEditText {

    public EditTextSFUiTextSemiBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public EditTextSFUiTextSemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditTextSFUiTextSemiBold(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/sfuitext_semibold.ttf");
            setTypeface(tf);
        }
    }

}