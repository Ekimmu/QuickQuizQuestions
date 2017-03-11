package com.example.android.quickquizquestions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.id.list;
import static com.example.android.quickquizquestions.R.string.score;
import static com.example.android.quickquizquestions.R.string.thanks;

public class MainActivity extends AppCompatActivity {

    int finalScore;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Score button was pressed by user to call incFinalScore
     *
     * Just a simple call to check the state of the varies resources
     * if correct answer
     *          then add to final score
     *  if incorrect then skip it.
     *
     * get user name
     *
     * Toast user for victory dance !
     *
     * @param view
     */

    public void incFinalScore(View view) {

        RadioButton ansOne = (RadioButton) findViewById(R.id.ans_1d);
        if (ansOne.isChecked()) {
            finalScore = finalScore + 1;
        }
        CheckBox ansTwo = (CheckBox) findViewById(R.id.ans_2a);
        if (ansTwo.isChecked()) {
            finalScore = finalScore + 1;
        }
        RadioButton ansThree = (RadioButton) findViewById(R.id.ans_3b);
        if (ansThree.isChecked()) {
            finalScore = finalScore + 1;
        }
        CheckBox ansFour = (CheckBox) findViewById(R.id.ans_4a);
        if (ansFour.isChecked()) {
            finalScore = finalScore + 1;
        }
        CheckBox ansFiveA = (CheckBox) findViewById(R.id.ans_5a);
        if (ansFiveA.isChecked()) {
            finalScore = finalScore + 1;
        }
        CheckBox ansFiveB = (CheckBox) findViewById(R.id.ans_5b);
        if (ansFiveB.isChecked()) {
            finalScore = finalScore + 1;
        }
        CheckBox ansFiveC = (CheckBox) findViewById(R.id.ans_5c);
        if (ansFiveC.isChecked()) {
            finalScore = finalScore + 1;
        }
        CheckBox ansFiveD = (CheckBox) findViewById(R.id.ans_5d);
        if (ansFiveD.isChecked()) {
            finalScore = finalScore + 1;
        }
        EditText nameOFUser = (EditText) findViewById(R.id.ans_6a);
        userName = nameOFUser.getText().toString();
        finalScore = finalScore + 1;
        toastUsScore(view);
    }

    /**
     * prepare and toast user.
     *
     * @param view
     */
    public void toastUsScore(View view) {
        Toast.makeText(this, " Well Played\n" + userName + " your score is\n" + finalScore + " out of 9", Toast.LENGTH_LONG).show();
        finalScore = 0;
    }

}
