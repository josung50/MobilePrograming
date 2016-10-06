package opensource.quickcoding2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    EditText InputNumber;
    TextView Result;
    int Count;
    int ComputerNumber;
    int MidNumber ,Start ,  End;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputNumber = (EditText) findViewById(R.id.inputNumber);
        Result = (TextView) findViewById(R.id.textView2);
        Count = 0;
        MidNumber = (End + Start) / 2;
        Random rnd = new Random();
        ComputerNumber = rnd.nextInt(1000); // 0~1000 생성
    }

    public void onClick(View v)
    {
        Button Bigger = (Button) findViewById(R.id.BiggerButton);
        Button Smaller = (Button) findViewById(R.id.SmallerButton);
        Button Bingo = (Button) findViewById(R.id.BingoButton);
        Button Send = (Button) findViewById(R.id.SendButton);

        String temp = InputNumber.getText().toString();
        int YourNumber = Integer.parseInt(temp);
        switch(v.getId())
        {
            case R.id.SendButton:
                //초기화//
                Count = 0;
                Start = 0;
                End = 1000;

                Result.setText("Your number is " + ComputerNumber + "?");

                if(ComputerNumber > YourNumber)
                    End = ComputerNumber;
                else if(ComputerNumber < YourNumber)
                    Start = ComputerNumber;

                MidNumber = (Start + End) / 2;
                break;
            case R.id.BiggerButton:
                if(MidNumber < YourNumber)
                {
                    Count++;
                    Start = MidNumber;
                    MidNumber = (Start + End) / 2;
                    Result.setText("Your number is " + MidNumber + "?");
                    System.out.println(MidNumber);
                }
                break;
            case R.id.SmallerButton:
                if(MidNumber > YourNumber)
                {
                    Count++;
                    End = MidNumber;
                    MidNumber = (Start + End) / 2;
                    Result.setText("Your number is " + MidNumber + "?");
                }
                break;
            case R.id.BingoButton:
                if(MidNumber == YourNumber) {
                    Result.setText("Count: " + Count);
                    Count = 0;
                }
                else
                    Result.setText("Wrong answer");
        }

    }

}