package lstview.com.tr.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    final List<Kisi> kisiler = new ArrayList<Kisi>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kisiler.add(new Kisi("Ahmet Yılmaz", false));
        kisiler.add(new Kisi("Ayşe Küçük", true));
        kisiler.add(new Kisi("Fatma Bulgurcu", true));
        kisiler.add(new Kisi("İzzet Altınmeşe", false));
        kisiler.add(new Kisi("Melek Subaşı", true));
        kisiler.add(new Kisi("Selim Serdilli", false));
        kisiler.add(new Kisi("Halil İbrahim", false));
        final ListView listemiz = (ListView) findViewById(R.id.liste);
        final OzelAdapter adaptorumuz = new OzelAdapter(this, kisiler);
        listemiz.setAdapter(adaptorumuz);

     listemiz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             Toast.makeText(MainActivity.this,"selam"+" "+kisiler.get(position).getIsim(), Toast.LENGTH_LONG).show();
         }
     });


    }
}