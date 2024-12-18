package Adaptor_Demo_2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.my_application_two_android_project.R;

public class MainActivity_2 extends AppCompatActivity {
    ListView listView_2;
    String[]arr_name_2={"  ","Name","Divya","kavita","Reena","samir","destiny","nikunj","Divya","kavita","Reena","samir","destiny","nikunj","Name","Divya","kavita","Reena","samir","destiny","nikunj","Name","Divya","kavita","Reena","samir","destiny","nikunj","Name","Divya","kavita","Reena","samir","destiny","nikunj","Name","Divya","kavita","Reena","samir","destiny","nikunj"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        listView_2=findViewById(R.id.list_view_id_2);
        ArrayAdapter<String>arrayAdapter_2=new ArrayAdapter<>(this,R.layout.custom_ui_2,R.id.txt_id_2,arr_name_2);
        listView_2.setAdapter(arrayAdapter_2);

    }
}