package Adaptor_Demo_6;

import android.content.Context;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class custom_Adaptor_6 extends SimpleAdapter {
    Context context_6;
    ArrayList<HashMap<String,?>>arrayList6;

    public custom_Adaptor_6(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
        this.context_6=context;
        this.arrayList6=(ArrayList<HashMap<String,?>>)data;
    }
}
