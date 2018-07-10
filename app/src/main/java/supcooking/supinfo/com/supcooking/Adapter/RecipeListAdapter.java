package supcooking.supinfo.com.supcooking.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import supcooking.supinfo.com.supcooking.Model.Recipe;
import supcooking.supinfo.com.supcooking.R;
import supcooking.supinfo.com.supcooking.RecipeActivity;

public class RecipeListAdapter extends BaseAdapter
{
    private Context context;
    private ArrayList<Recipe> recipeList;

    public RecipeListAdapter(Context context, ArrayList<Recipe> recipeList) {
        this.context = context;
        this.recipeList = recipeList;
    }

    @Override
    public int getCount() {
        return recipeList.size();
    }

    @Override
    public Recipe getItem(int i) {
        return recipeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View listItem, ViewGroup parent) {
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.recipe_list_item, parent, false);

        //Click listener
        listItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Intent intent = new Intent(context, RecipeActivity.class);
                intent.putExtra("Recipe", "id recipe");
                context.startActivity(intent);
            }
        });

        final Recipe recipe = getItem(i);
        TextView name = listItem.findViewById(R.id.name_recipe);
        ImageView image = listItem.findViewById(R.id.image_recipe);
        RatingBar rating = listItem.findViewById(R.id.rating_recipe);
        TextView time = listItem.findViewById(R.id.time_recipe);

        name.setText(recipe.getName());
        image.setImageResource(recipe.getPicture());
        rating.setRating(recipe.getRate());
        time.setText((recipe.getCookingTime() + recipe.getPreparationtTime()) + " mns");

        return listItem;
    }
}