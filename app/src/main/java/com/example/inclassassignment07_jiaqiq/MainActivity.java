package com.example.inclassassignment07_jiaqiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView studentInfoDisplay;
    Button addStudentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Student List");

        studentInfoDisplay = findViewById(R.id.text_student_info);
        addStudentButton = findViewById(R.id.button_add_another_student);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Keys.REQUEST_CODE && resultCode == RESULT_OK) {
            Student student = (Student) data.getSerializableExtra(Keys.STUDENT);
            String existingInfo = studentInfoDisplay.getText().toString();
            studentInfoDisplay.setText(existingInfo + student.toString());
        }
    }

    public void addStudent(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, Keys.REQUEST_CODE);
    }


}
