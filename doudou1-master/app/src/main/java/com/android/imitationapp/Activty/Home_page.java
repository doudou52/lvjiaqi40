package com.android.imitationapp.Activty;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.android.imitationapp.Adapter.ItemAdapter;
import com.android.imitationapp.R;
import com.android.imitationapp.ui.dashboard.DashboardFragment;
import com.android.imitationapp.ui.home.HomeFragment;
import com.android.imitationapp.ui.my.MyFragment;
import com.android.imitationapp.ui.notifications.NotificationsFragment;
import com.android.imitationapp.ui.purchased.PurchasedFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Home_page extends AppCompatActivity {
    private TextView mTextMessage;
    private   BottomNavigationView navigationView;
    private Fragment fragment=null;
    private ViewPager viewPager;
    private ItemAdapter itemAdapter;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

     initView();
    }

    private void initView() {
      navigationView=findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

viewPager=findViewById(R.id.home_viewPager);

setViewPagerListener();

initFragment();

viewPager.setAdapter(itemAdapter);
viewPager.setOffscreenPageLimit(5);
    }

    private void initFragment() {
final ArrayList<Fragment>fragmentsList=new ArrayList<>(5);
fragmentsList.add(new HomeFragment());
fragmentsList.add(new DashboardFragment());
fragmentsList.add(new NotificationsFragment());
fragmentsList.add(new PurchasedFragment());
fragmentsList.add(new MyFragment());

itemAdapter=new ItemAdapter(getSupportFragmentManager(),fragmentsList){
    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }
};

    }

    private void setViewPagerListener() {

viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
          navigationView.getMenu().getItem(position).setChecked(true);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
});

    }




    private   BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    FragmentManager manager=getSupportFragmentManager();
                    FragmentTransaction transaction=manager.beginTransaction();
                    Fragment fragment=null;
                    switch (menuItem.getItemId()){
                        case R.id.navigation_itme1:
                           viewPager.setCurrentItem(0);
                           return true;
                           case R.id.navigation_item2:
                            viewPager.setCurrentItem(1);
                            return true;
                        case R.id.navigation_item3:
                            viewPager.setCurrentItem(2);
                            return true;
                        case R.id.navigation_item4:
                            viewPager.setCurrentItem(3);
                            return true;
                        case R.id.navigation_item5:
                            viewPager.setCurrentItem(4);

                            return true;

                    }
                    return false;
                }

            };
}
