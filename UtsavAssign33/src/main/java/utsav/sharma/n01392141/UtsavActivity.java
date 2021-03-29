/*
Utsav Sharma N01392141 Section C
 */
package utsav.sharma.n01392141;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UtsavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.utsav_bottom_nav);
        UtsavFragment utsavFragment = new UtsavFragment();
        SharmaFragment sharmaFragment = new SharmaFragment();
        N01392141Fragment N01392141Fragment = new N01392141Fragment();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.utsav_nav_tab1){
                    setFragment(utsavFragment);
                    getSupportActionBar().setTitle(R.string.tab1_title);
                    return true;
                } else if (id == R.id.utsav_nav_tab2){
                    setFragment(sharmaFragment);
                    getSupportActionBar().setTitle(R.string.tab2_title);
                    return true;
                } else if(id == R.id.utsav_nav_tab3){
                    setFragment(N01392141Fragment);
                    getSupportActionBar().setTitle(R.string.tab3_title);
                    return true;
                }
                return false;
            }
        });
        navigationView.setSelectedItemId(R.id.utsav_nav_tab1);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.builder_exit_message)
                .setCancelable(false)
                .setPositiveButton(R.string.yes_msg, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        UtsavActivity.super.onBackPressed();
                    }
                })

                .setNegativeButton(R.string.no_msg, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.utsav_frame, fragment);
        fragmentTransaction.commit();

    }
}