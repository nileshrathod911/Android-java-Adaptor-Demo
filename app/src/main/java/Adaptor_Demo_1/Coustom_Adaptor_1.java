package Adaptor_Demo_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.my_application_two_android_project.R;

import java.util.zip.Inflater;

public class Coustom_Adaptor_1 extends BaseAdapter {
    int[] animal_arr;
    Context context;
    LayoutInflater inflater;

    Coustom_Adaptor_1(int[]animal_arr,Context context){
        this.animal_arr=animal_arr;
        this.context=context;
        inflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return animal_arr.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.coustom_img_view_3,null);
        ImageView imageView=view.findViewById(R.id.img_view_id_1);
        imageView.setImageResource(animal_arr[i]);
        return view;
    }
}
