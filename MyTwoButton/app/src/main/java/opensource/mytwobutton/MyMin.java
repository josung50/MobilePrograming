package opensource.mytwobutton;

/**
 * Created by JSR on 2016-10-01.
 */
public class MyMin extends My{
    @Override
    int getResult(int[] list) {
        int Min = 9999999;
        for(int i=0; i<list.length; i++){
            if(Min > list[i])
                Min = list[i];}
        return Min;
    }
}
