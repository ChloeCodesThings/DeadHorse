package com.example.android.deadhorse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String itemToBeTracked = "";
    String thisVerb = "";

    public void addTrackedThing(View view) {

        EditText trackedThing = (EditText) findViewById(R.id.tracked_thing);
        String nameOfTrackedThing = trackedThing.getText().toString();

        itemToBeTracked = nameOfTrackedThing;

        displayItemToBeTracked(itemToBeTracked);

    }

    private void displayItemToBeTracked(String itemToBeTracked) {
        TextView sampleSentence = (TextView) findViewById(R.id.sample_sentence_noun);
        sampleSentence.setText(itemToBeTracked);
    }

    public void addVerb(View view) {

        EditText theVerb = (EditText) findViewById(R.id.the_verb);
        String verbUsedForItem = theVerb.getText().toString();

        thisVerb = verbUsedForItem;

        displayVerb(thisVerb);

    }

    private void displayVerb(String thisVerb) {
        TextView sampleSentence = (TextView) findViewById(R.id.sample_sentence_verb);
        sampleSentence.setText("I've " + thisVerb);
    }

}


