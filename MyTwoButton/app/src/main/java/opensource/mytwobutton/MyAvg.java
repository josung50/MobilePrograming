package opensource.mytwobutton;

/**
 * Created by JSR on 2016-10-01.
 */
public class MyAvg extends My{
    @Override
    int getResult(int[] list) {
        int Sum = 0;
        for(int i=0; i<list.length; i++)
            Sum += list[i];

        return Sum / list.length;
    }
}
