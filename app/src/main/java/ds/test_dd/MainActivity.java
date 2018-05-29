package ds.test_dd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int pelusa;
    private int chanclas;
    private String hijopu_de_windows;

    private int sonido;

    //If sonido1=chanclas then "no estás chingando bien"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    private void culpable() {
        // Windows 10 era el culpable, pues guarda los usuarios en un sitio de credenciales y tenía asociado a
        // GitHub, mi cuenta y por eso decía que no tenía permiso.
    }
}
