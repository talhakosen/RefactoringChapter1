package refactoring.tkosen.com.refactoring;

import android.provider.Settings;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import refactoring.tkosen.com.refactoring.chapter1.Customer;
import refactoring.tkosen.com.refactoring.chapter1.Movie;
import refactoring.tkosen.com.refactoring.chapter1.Rental;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

}
