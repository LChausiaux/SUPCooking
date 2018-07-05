package supcooking.supinfo.com.supcooking;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;

import supcooking.supinfo.com.supcooking.Adapter.RecipeListAdapter;
import supcooking.supinfo.com.supcooking.Model.Recipe;

public class ListActivity extends AppCompatActivity {

    ArrayList<Recipe> recipeList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        BottomNavigationViewHelper.removeShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        recipeList.add(new Recipe("Test 1", 3, 10, 30, R.drawable.recipe));
        recipeList.add(new Recipe("Test 2", 5, 10, 30, R.drawable.recipe));
        recipeList.add(new Recipe("Test 3", 4, 15, 20, R.drawable.recipe));
        recipeList.add(new Recipe("Test 4", 1, 20, 50, R.drawable.recipe));
        recipeList.add(new Recipe("Test 5", 3, 40, 5, R.drawable.recipe));

        RecipeListAdapter recipeListAdapter = new RecipeListAdapter(this, recipeList);
        GridView gridRecipes = findViewById(R.id.recipe_grid);
        gridRecipes.setAdapter(recipeListAdapter);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_new_recipe:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_logout:
                    return true;
            }
            return false;
        }
    };

}
