package timothy.hernandez.com.hernandeztimothyjoshualab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showmessageToast(View view){
        Toast.makeText(this, "4ITE is the best.", Toast.LENGTH_LONG).show();
    }
    public void showmessageSnackbar(View view){
        Snackbar.make(view, "This is the Next Button", Snackbar.LENGTH_LONG).show();
    }
}
