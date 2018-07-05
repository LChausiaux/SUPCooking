package supcooking.supinfo.com.supcooking.Model;

import android.media.Image;

public class Recipe
{
    private int id;
    private String name;
    private String type;
    private int cookingTime;
    private int preparationtTime;
    private String ingredients;
    private String preparationSteps;
    private int rate;
    private int picture;

    public Recipe(String name, int cookingTime, int preparationtTime, int rate, int picture) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.preparationtTime = preparationtTime;
        this.rate = rate;
        this.picture = picture;
    }

    public Recipe(int id, String name, String type, int cookingTime, int preparationtTime, String ingredients, String preparationSteps, int rate, int picture)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.cookingTime = cookingTime;
        this.preparationtTime = preparationtTime;
        this.ingredients = ingredients;
        this.preparationSteps = preparationSteps;
        this.rate = rate;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getPreparationtTime() {
        return preparationtTime;
    }

    public void setPreparationtTime(int preparationtTime) {
        this.preparationtTime = preparationtTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPreparationSteps() {
        return preparationSteps;
    }

    public void setPreparationSteps(String preparationSteps) {
        this.preparationSteps = preparationSteps;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
