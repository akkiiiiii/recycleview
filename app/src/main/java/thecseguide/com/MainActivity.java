package thecseguide.com;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView DisplayStudentMarksRecycleview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayStudentMarksRecycleview = findViewById(R.id.DisplayStudentMarksRecycleview);

        AdapterForRecycleview adapterForRecycleview = new AdapterForRecycleview(MainActivity.this,MainActivity.this,AddStudentData());
        DisplayStudentMarksRecycleview.setAdapter(adapterForRecycleview);

    }


    private List<studentDataClass> AddStudentData(){

        List<studentDataClass> studentList = new ArrayList();

        studentList.add(new studentDataClass("Rahul Arora",18,500));
        studentList.add(new studentDataClass("Rohit Sharma",21,520));
        studentList.add(new studentDataClass("Keshav",18,550));
        studentList.add(new studentDataClass("John",21,595));
        studentList.add(new studentDataClass("Akshay Sharma",22,600));
        studentList.add(new studentDataClass("Aman Kanwar",23,644));
        studentList.add(new studentDataClass("Lakhwinder Singh",20,547));
        studentList.add(new studentDataClass("Kashvi",19,352));
        studentList.add(new studentDataClass("Simran Kaur",24,744));
        studentList.add(new studentDataClass("Aniket Ahuja",22,780));
        studentList.add(new studentDataClass("Vaibhav",19,533));
        studentList.add(new studentDataClass("Divya Dawar",23,643));
        studentList.add(new studentDataClass("Sanjay",22,574));

        return studentList;
    }
}