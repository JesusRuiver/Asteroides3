package asteroides.example.org.asteroides;

import android.app.Activity;
import android.os.Bundle;

import static asteroides.example.org.asteroides.R.layout.acercade;

/**
 * Created by JesúsRuiver on 27/11/2017.
 */

public class AcercaDeActivity extends Activity{

    @Override public void onCreate(Bundle savedInsranceState){
        super.onCreate(savedInsranceState);
        setContentView(acercade);
    }
}
