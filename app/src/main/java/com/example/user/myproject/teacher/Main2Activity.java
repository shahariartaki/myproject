package com.example.user.myproject.teacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.myproject.R;

public class Main2Activity extends AppCompatActivity {
ListView listView;
    String [] techerName={"DR. MD. MIJANUR RAHMAN ","MD. SHAHNEWAZ KHAN","MD. SHAFIUL ALAM CHOWDHURY ","MST. NAJNIN SULTANA "," MD. CHOWDHURY SAJADUL ISLAM","DR. A.H.M. SAIFULLAH SADI","DR. MD. AKHTARUZZAMAN","TANZILLAH WAHID"};
    String [] techerposition={"Chairman","Professor","Associate Professor"," Assistant Professor","  Assistant Professor"," Assistant Professor"," Assistant Professor","Senior Lecturer"};
    String [] techeredu={"Phd,MSC,BSC","Phd,MSC,BSC","Phd,MSC,BSC"," Phd,MSC,BSC","  Phd,MSC,BSC"," Phd,MSC,BSC","MSC,BSC","MSC,BSC"};
    Integer [] logo={R.drawable.mizanur,R.drawable.shanewaz,R.drawable.saiful,R.drawable.naznin,R.drawable.sajadul,R.drawable.sadi,R.drawable.aktaruzzaman,R.drawable.tazila};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CostomAdapter costomAdapter=new CostomAdapter(Main2Activity.this,techerName,techerposition,techeredu,logo);
        listView=(ListView)findViewById(R.id.lv);
        listView.setAdapter(costomAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String item =(String) listView.getItemAtPosition(position);
                Toast.makeText(Main2Activity.this,item,Toast.LENGTH_LONG).show();

            }
        });

    }
}
