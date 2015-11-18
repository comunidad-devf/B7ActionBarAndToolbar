package devf.b7actionbarandtoolbar;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolbar();
        setupIconHomeActionBar();
        setupDrawerLayout();
        setupNavigationView();
    }

    private void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupIconHomeActionBar() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);

    }

    private void setupDrawerLayout() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    private void setupNavigationView () {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.action_call:
//                        replacerFragment(new Fragment());
                        Toast.makeText(MainActivity.this, R.string.action_call, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_search:
//                        replacerFragment(new Fragment());
                        Toast.makeText(MainActivity.this, R.string.action_search, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_settings:
//                        replacerFragment(new Fragment());
                        Toast.makeText(MainActivity.this, R.string.action_settings, Toast.LENGTH_SHORT).show();
                        break;
                }

                item.setChecked(true);
                mDrawerLayout.closeDrawer(GravityCompat.START);

                return false;
            }
        });

    }

    private void replacerFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            case R.id.action_call:
                Toast.makeText(this, R.string.action_call, Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_search:
                Toast.makeText(this, R.string.action_search, Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(this, R.string.action_settings, Toast.LENGTH_SHORT).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
