package Adaptor_Demo_4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.my_application_two_android_project.R;

import java.util.ArrayList;

public class MainActivity_4 extends AppCompatActivity {

    ListView listView_4;

    int[]arr_animal_4={R.drawable.animal_black_panther,R.drawable.animal_cat,R.drawable.animal_dog,R.drawable.animal_dolphin,R.drawable.animal_fox,R.drawable.animal_horse,R.drawable.animal_lion,R.drawable.animal_panda,R.drawable.animal_perot};

    String[]animal_name_4={"BlackPanther","Cat","Dog","Dolphin","Fox","Horse","Lion","Panda","Perot"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        listView_4=findViewById(R.id.listview_4);
        ArrayList arrayList_4=new ArrayList<>();

        for (int i=0;i<arr_animal_4.length;i++){
            arrayList_4.add(new Animal_4(arr_animal_4[i],animal_name_4[i]));
        }

        Adaptor_4 adaptor4=new Adaptor_4(this,R.layout.ui_view_4,arrayList_4);

        listView_4.setAdapter(adaptor4);



    }
}