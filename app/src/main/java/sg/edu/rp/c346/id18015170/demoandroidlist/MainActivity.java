package sg.edu.rp.c346.id18015170.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAndroid;
    ArrayList<AndroidVersion> AndroidList;
    ArrayAdapter<AndroidVersion> aaAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);
        AndroidList = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        AndroidList.add(item1);
        AndroidList.add(item2);
        AndroidList.add(item3);

        aaAndroid = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, AndroidList);
        lvAndroid.setAdapter(aaAndroid);


    }
}
