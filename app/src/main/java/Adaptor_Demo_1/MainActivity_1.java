package Adaptor_Demo_1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.my_application_two_android_project.R;

public class MainActivity_1 extends AppCompatActivity {

    ListView listView_1;

    int[]arr_animal_1={R.drawable.animal_black_panther,R.drawable.animal_cat,R.drawable.animal_dog,R.drawable.animal_dolphin,R.drawable.animal_fox,R.drawable.animal_horse,R.drawable.animal_lion,R.drawable.animal_panda,R.drawable.animal_perot};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main1);

        listView_1=findViewById(R.id.list_view_id_1);
        Coustom_Adaptor_1 adaptor_1=new Coustom_Adaptor_1(arr_animal_1,this);
        listView_1.setAdapter(adaptor_1);

    }
}