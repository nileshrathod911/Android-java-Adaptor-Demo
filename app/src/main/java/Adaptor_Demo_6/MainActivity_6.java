package Adaptor_Demo_6;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.my_application_two_android_project.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity_6 extends AppCompatActivity {

    ListView listView_6;

    int[]arr_animal_6={R.drawable.animal_black_panther,R.drawable.animal_cat,R.drawable.animal_dog,R.drawable.animal_dolphin,R.drawable.animal_fox,R.drawable.animal_horse,R.drawable.animal_lion,R.drawable.animal_panda,R.drawable.animal_perot};

    String[]animal_name_6={"BlackPanther","Cat","Dog","Dolphin","Fox","Horse","Lion","Panda","Perot"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);

        listView_6=findViewById(R.id.list_view_id_6);
        ArrayList<HashMap<String,?>>arrayList_6=new ArrayList<>();

        for (int i=0;i<arr_animal_6.length;i++){
            HashMap<String,String>hashMap_6=new HashMap<>();
            hashMap_6.put("image",arr_animal_6[i]+"");
            hashMap_6.put("name",animal_name_6[i]);
            arrayList_6.add(hashMap_6);
        }

        String[] from={"image","name"};
        int[] to={R.id.img_view_id_6,R.id.txt_id_6};

        custom_Adaptor_6 customAdaptor6=new custom_Adaptor_6(this,arrayList_6,R.layout.ui_view_6,from,to);
        listView_6.setAdapter(customAdaptor6);

    }
}