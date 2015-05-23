package src.android.widget.custom.numberpicker.samples;

import android.widget.custom.NumberPicker;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class LightThemeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_light);

        NumberPicker np = (NumberPicker) findViewById(R.id.numberPicker);
        np.setMaxValue(20);
        np.setMinValue(0);
        np.setFocusable(true);
        np.setFocusableInTouchMode(true);
    }
}
