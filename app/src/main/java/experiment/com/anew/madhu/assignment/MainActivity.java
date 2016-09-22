package experiment.com.anew.madhu.assignment;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public final static String MESSAGE_KEY="experiment.com.anew.madhu.assignment.message_key";
    public final static String MESSAGE_KEY2="experiment.com.anew.madhu.assignment.message_key2";
    public final static String MESSAGE_KEY3="experiment.com.anew.madhu.assignment.message_key3";
    public final static String MESSAGE_KEY4="experiment.com.anew.madhu.assignment.message_key4";
    public final static String MESSAGE_KEY5="experiment.com.anew.madhu.assignment.message_key5";
    public final static String MESSAGE_KEY6="experiment.com.anew.madhu.assignment.message_key6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void compute(View v) {

        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        EditText e3 = (EditText) findViewById(R.id.editText3);
        EditText e4 = (EditText) findViewById(R.id.editText4);
        EditText e5 = (EditText) findViewById(R.id.editText5);
        EditText e6 = (EditText) findViewById(R.id.editText6);

        String message= e1.getText().toString();
        String message2= e2.getText().toString();
        String message3= e3.getText().toString();
        String message4= e4.getText().toString();
        String message5= e5.getText().toString();
        String message6= e6.getText().toString();

            Intent intent=new Intent (this,SecondActivity.class);
            intent.putExtra(MESSAGE_KEY,message);
            intent.putExtra(MESSAGE_KEY2,message2);
            intent.putExtra(MESSAGE_KEY3,message3);
            intent.putExtra(MESSAGE_KEY4,message4);
            intent.putExtra(MESSAGE_KEY5,message5);
            intent.putExtra(MESSAGE_KEY6,message6);
            startActivity(intent);

    }

}
