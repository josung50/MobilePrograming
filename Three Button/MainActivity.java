package opensource.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Button button1 = (Button) findViewById(R.id.Button1);
        Button button2 = (Button) findViewById(R.id.Button2);
        Button button3 = (Button) findViewById(R.id.Button3);

        switch (v.getId()) {
            case R.id.Button1:
                Toast.makeText(getApplicationContext(), "Button1 Click", Toast.LENGTH_LONG).show();
                break;
            case R.id.Button2:
                Toast.makeText(getApplicationContext(), "Button2 Click", Toast.LENGTH_LONG).show();
                break;
            case R.id.Button3:
                Toast.makeText(getApplicationContext(), "Button3 Click", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
