package opensource.mytwobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView InputNumber;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputNumber = (EditText)findViewById((R.id.InputNumber));
        Result = (TextView)findViewById(R.id.Result);
    }

   public void onClick(View v)
   {
       int [] list = {1 , 5 , 8 ,  9 , 40 , 21 , 4 , 5 , 10 , 7};
       Button Min = (Button)findViewById(R.id.Min);
       Button Avg = (Button)findViewById(R.id.Avg);

       int result2;

       switch(v.getId())
       {
           case R.id.Avg: // 평균
               MyAvg AvgResult = new MyAvg();
               result2 = AvgResult.getResult(list);
               Result.setText("결과: " + result2);
               break;
           case R.id.Min: // 최소
               MyMin MinResult = new MyMin();
               result2 = MinResult.getResult(list);
               Result.setText("결과: " + result2);
               break;
       }
   }
}