package com.example.inclassassignment07_jiaqiq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText nameEditText;
    EditText ageEditText;
    CheckBox genderCheckBox;
    EditText classNumberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.setTitle("Student List");

        nameEditText = findViewById(R.id.text_name);
        ageEditText = findViewById(R.id.text_age);
        genderCheckBox = findViewById(R.id.checkbox_gender);
        classNumberEditText = findViewById(R.id.text_class);
    }

    public void submitStudent(View view) {
        String name = nameEditText.getText().toString();
        int age = Integer.parseInt(ageEditText.getText().toString());
        boolean isGirl = genderCheckBox.isChecked();
        int classNumber = Integer.parseInt(classNumberEditText.getText().toString());

        Student student = new Student(name, age, isGirl, classNumber);
        Intent data = new Intent();
        data.putExtra(Keys.STUDENT, student);
        setResult(RESULT_OK, data);
        finish();
    }

}
