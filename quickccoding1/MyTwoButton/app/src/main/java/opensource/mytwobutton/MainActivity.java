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
    EditText InputNumber;
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
       String temp = InputNumber.getText().toString();
       String[] Numberlist = temp.split(",");
       int[] intlist = new int[Numberlist.length];
       for(int i=0; i<Numberlist.length; i++)
           intlist[i] = Integer.parseInt(Numberlist[i]);

       Button Min = (Button)findViewById(R.id.Min);
       Button Avg = (Button)findViewById(R.id.Avg);

       int result2;
       switch(v.getId())
       {
           case R.id.Avg: // 평균
               MyAvg AvgResult = new MyAvg();
               result2 = AvgResult.getResult(intlist);
               Result.setText("결과: " + result2);
               break;
           case R.id.Min: // 최소
               MyMin MinResult = new MyMin();
               result2 = MinResult.getResult(intlist);
               Result.setText("결과: " + result2);
               break;
       }
   }
}