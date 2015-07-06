package com.andreslon.appdroid1;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.andreslon.appdroid1.fragments.CartFragment;
import com.andreslon.appdroid1.fragments.DefaultFragment;
import com.andreslon.appdroid1.fragments.HomeFragment;
import com.andreslon.appdroid1.fragments.DefaultFragment;
import com.andreslon.appdroid1.fragments.InvoicesFragment;
import com.andreslon.appdroid1.fragments.OrderFragment;
import com.andreslon.appdroid1.fragments.ProductsFragment;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar(); // Setear Toolbar como action bar

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

        if (savedInstanceState == null) {
            selectItem(navigationView.getMenu().getItem(0));
        }

    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {

            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // Marcar item presionado
                        menuItem.setChecked(true);
                        // Crear nuevo fragmento
                        String title = menuItem.getTitle().toString();
                        selectItem(menuItem);
                        return true;
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void selectItem(MenuItem menuItem) {
        String title = menuItem.getTitle().toString();

        Bundle args = new Bundle();
        Fragment fragment = new Fragment();
        switch (title) {
            case "Inicio":
                fragment = HomeFragment.newInstance();
                break;
            case "Productos":
                fragment = ProductsFragment.newInstance();
                break;
            case "Carrito":
                fragment = CartFragment.newInstance();
                break;
            case "Ordenes":
                fragment = OrderFragment.newInstance();
                break;
            case "Facturas":
                fragment = InvoicesFragment.newInstance();
                break;
            case "Cerrar Sesión":

                break;
            default:
                args.putString(DefaultFragment.ARG_SECTION_TITLE, title);
                fragment = DefaultFragment.newInstance(title);
                break;

        }


        fragment.setArguments(args);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main_content, fragment).commit();
        drawerLayout.closeDrawers();
        setTitle(title);
    }


}
