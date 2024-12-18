package Adaptor_Demo_5;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.my_application_two_android_project.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity_5 extends AppCompatActivity {

    ListView listView_5;

    int[]arr_animal_5={R.drawable.animal_black_panther,R.drawable.animal_cat,R.drawable.animal_dog,R.drawable.animal_dolphin,R.drawable.animal_fox,R.drawable.animal_horse,R.drawable.animal_lion,R.drawable.animal_panda,R.drawable.animal_perot};

    String[]animal_name_5={"BlackPanther","Cat","Dog","Dolphin","Fox","Horse","Lion","Panda","Perot"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        listView_5=findViewById(R.id.list_view_id_5);

       // ArrayList<HashMap<String,?>>arrayList_5=new ArrayList<>();
        ArrayList<HashMap<String,String>> arrayList_5=new ArrayList<>();

        for (int i=0;i<animal_name_5.length;i++){
            HashMap<String,String>hashMap_5=new HashMap<String,String>();
            hashMap_5.put("Images",arr_animal_5[i]+"");
            hashMap_5.put("Name",animal_name_5[i]);
            arrayList_5.add(hashMap_5);
        }

        String[]from={"Images","Name","surname"};
        int[]to={R.id.img_view_id_5,R.id.txt_id_5};

        SimpleAdapter simpleAdapter_5=new SimpleAdapter(this,arrayList_5,R.layout.ui_view_5,from,to);
        listView_5.setAdapter(simpleAdapter_5);


    }
}