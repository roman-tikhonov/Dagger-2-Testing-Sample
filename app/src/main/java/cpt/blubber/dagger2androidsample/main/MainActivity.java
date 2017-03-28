package cpt.blubber.dagger2androidsample.main;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import cpt.blubber.dagger2androidsample.R;
import cpt.blubber.dagger2androidsample.greeting.Greeter;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    Greeter greeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView greetingTextView = (TextView) findViewById(R.id.greeting);
        greetingTextView.setText(greeter.greet());

    }

}
