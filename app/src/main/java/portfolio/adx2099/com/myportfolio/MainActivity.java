package portfolio.adx2099.com.myportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button spotifyButton = (Button) findViewById(R.id.button);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my spotify App", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final Button scoreButton = (Button) findViewById(R.id.button2);
        scoreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Score App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final Button libraryButton = (Button) findViewById(R.id.button3);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my library App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final Button buildButton = (Button) findViewById(R.id.button4);
        buildButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Build App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        final Button xyzButton = (Button) findViewById(R.id.button5);
        xyzButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my XYZ App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final Button capstoneButton = (Button) findViewById(R.id.button6);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"This button will launch my Capstone App",Toast.LENGTH_SHORT);
                toast.show();
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
