package experiment.com.anew.madhu.assignment;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
    public final static String MESSAGE_KEY="experiment.com.anew.madhu.assignment.message_key";
    public final static String MESSAGE_KEY2="experiment.com.anew.madhu.assignment.message_key2";
    public final static String MESSAGE_KEY3="experiment.com.anew.madhu.assignment.message_key3";
    public final static String MESSAGE_KEY4="experiment.com.anew.madhu.assignment.message_key4";
    public final static String MESSAGE_KEY5="experiment.com.anew.madhu.assignment.message_key5";
    public final static String MESSAGE_KEY6="experiment.com.anew.madhu.assignment.message_key6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        TextView tvFirst = (TextView) findViewById(R.id.textView7);
        TextView tvSecond = (TextView) findViewById(R.id.textView8);
        TextView tvThird = (TextView) findViewById(R.id.textView9);
        TextView tvFourth = (TextView) findViewById(R.id.textView10);
        TextView tvFifth = (TextView) findViewById(R.id.textView11);
        TextView tvSixth = (TextView) findViewById(R.id.textView12);

        Intent intent=getIntent();
        String message  = intent.getStringExtra(MESSAGE_KEY);
        String message2 = intent.getStringExtra(MESSAGE_KEY2);
        String message3 = intent.getStringExtra(MESSAGE_KEY3);
        String message4 = intent.getStringExtra(MESSAGE_KEY4);
        String message5 = intent.getStringExtra(MESSAGE_KEY5);
        String message6 = intent.getStringExtra(MESSAGE_KEY6);

        tvFirst.setText(message);
        tvSecond.setText(message2);
        tvThird.setText(message3);
        tvFourth.setText(message4);
        tvFifth.setText(message5);
        tvSixth.setText(message6);


    }
}
