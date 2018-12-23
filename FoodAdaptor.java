package e.smyye.dunyamutfagi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class FoodAdaptor extends BaseAdapter {

    public  List<Food> aFoodList;
    LayoutInflater alayoutInflater;

    public FoodAdaptor(Activity activity, List<Food> aFoodList) {
        this.alayoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.aFoodList = aFoodList;
    }

    @Override
    public int getCount() {
        return aFoodList.size();
    }

    @Override
    public Object getItem(int position) {
        return aFoodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

     final View rowView = alayoutInflater.inflate(R.layout.row_layout, null);

       TextView  countryName = rowView.findViewById(R.id.countryNameTxt);
       TextView  foodName = rowView.findViewById(R.id.foodNameTxt);
        LinearLayout rLayout = rowView.findViewById(R.id.rowLayout);

      final Food aFoodTemp = aFoodList.get(position);

        countryName.setText(aFoodTemp.getContryName());
        foodName.setText(aFoodTemp.getFoodName());
        rLayout.setBackgroundResource(aFoodTemp.getBackground());

        foodName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aFoodTemp.getFoodName() == "İskender"){
                    Intent intent = new Intent(rowView.getContext(), TrActivity.class);
                    rowView.getContext().startActivity(intent);
                }

            }
        });



        return rowView;
    }
}
