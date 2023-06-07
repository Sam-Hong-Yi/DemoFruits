package sg.edu.rp.c346.id22024848.demofruits;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;
    String display;
    String theFruit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        display="Fruits\n======\n";



        ArrayList<String> fruits;
        fruits=new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");
        theFruit=fruits.get(1);
        fruits.remove(0);

        fruits.set(2, "dragon fruit");

        for(int i=0; i<fruits.size();i++){
            display+=fruits.get(i)+"\n";
        }
        tv.setText(display);






    }
}

