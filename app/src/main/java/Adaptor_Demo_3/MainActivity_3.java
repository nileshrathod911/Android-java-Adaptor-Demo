package Adaptor_Demo_3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.my_application_two_android_project.R;

public class MainActivity_3 extends AppCompatActivity {

    String[]arr_name_3={"  ","Name","Divya","kavita","Reena","samir","destiny","nikunj","Divya","kavita","Reena","samir","destiny","nikunj","Name","Divya","kavita","Reena","samir","destiny","nikunj","Name","Divya","kavita","nikunj"};
    Spinner spinner_3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        spinner_3=findViewById(R.id.spinner_id_3);

        spinner_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Name is : "+arr_name_3[i], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<String>arrayAdapter_3=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arr_name_3);
        spinner_3.setAdapter(arrayAdapter_3);

    }
}