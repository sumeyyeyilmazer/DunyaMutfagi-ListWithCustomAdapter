package e.smyye.dunyamutfagi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

 public ListView foodListView;
 public List<Food> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        foodListView = findViewById(R.id.foodListV);

        list();

        FoodAdaptor adaptor = new FoodAdaptor(MainActivity.this, foodList);
        foodListView.setAdapter(adaptor);


    }

 public void list(){
//Nesneler oluşturulup listeye eklenir
     foodList.add( new Food("Türkiye", "İskender", R.drawable.turk));
     foodList.add( new Food("Amerika", "Hamburger", R.drawable.amerika2));
     foodList.add( new Food("İtalya", "Pizza", R.drawable.italya));
     foodList.add( new Food("Japonya", "Suşi", R.drawable.japon));


 }


}
