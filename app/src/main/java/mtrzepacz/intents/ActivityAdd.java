package mtrzepacz.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Bundle bundle = getIntent().getExtras();
        Integer arg1 = bundle.getInt(MainActivity.PACKAGE_NAME + getResources().getString(R.string.arg_1_name),0);
        Integer arg2 = bundle.getInt(MainActivity.PACKAGE_NAME + getResources().getString(R.string.arg_2_name),0);

        Integer result = arg1 + arg2;
        Toast.makeText(getApplicationContext(),"add activity", Toast.LENGTH_LONG).show();
        Intent intent = new Intent();
        intent.putExtra(getResources().getString(R.string.result),result);
        intent.putExtra(getResources().getString(R.string.operation), getResources().getString(R.string.addition));
        setResult(RESULT_OK, intent);

        super.finish();
    }
}
