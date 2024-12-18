package Adaptor_Demo_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.my_application_two_android_project.R;

import java.util.ArrayList;

public class Adaptor_4 extends ArrayAdapter<Animal_4> {

    ArrayList<Animal_4> animal_4ArrayList;
    LayoutInflater layoutInflater_4;

    public Adaptor_4(Context context, int resource, ArrayList<Animal_4> objects) {
        super(context, resource, objects);
        animal_4ArrayList=objects;
        layoutInflater_4=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=layoutInflater_4.inflate(R.layout.ui_view_4,null);
        ImageView imageView=view.findViewById(R.id.img_view_id_4);
        TextView textView=view.findViewById(R.id.txt_id_4);
        imageView.setImageResource(animal_4ArrayList.get(position).animal_img_4);
        textView.setText(animal_4ArrayList.get(position).animal_name_4);
        return view;
    }
}
