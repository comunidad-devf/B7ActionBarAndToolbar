package devf.b7actionbarandtoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_call:
                Toast.makeText(this,R.string.action_call,Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_search:
                Toast.makeText(this,R.string.action_search,Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(this,R.string.action_settings,Toast.LENGTH_SHORT).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
