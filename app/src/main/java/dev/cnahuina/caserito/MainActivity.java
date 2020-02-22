package dev.cnahuina.caserito;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerSkills;

    String s1[], s2[];
    int images[] = {R.drawable.figma,
                    R.drawable.html5,
                    R.drawable.css,
                    R.drawable.angular,
                    R.drawable.flutter,
                    R.drawable.android,
                    R.drawable.sketch,
                    R.drawable.wordpress,
                    R.drawable.adobexd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerSkills = (RecyclerView)findViewById(R.id.recyclerSkills);
        s1 = getResources().getStringArray(R.array.skills);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter =  new MyAdapter(this,s1,s2,images);
        recyclerSkills.setAdapter(myAdapter);
        recyclerSkills.setLayoutManager(new LinearLayoutManager(this));

    }

}
