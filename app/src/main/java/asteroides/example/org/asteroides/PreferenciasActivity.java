package asteroides.example.org.asteroides;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by JesúsRuiver on 28/11/2017.
 */

public class PreferenciasActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PreferenciasFragment()).commit();
    }
}
