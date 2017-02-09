package group4.tcss450.uw.edu.grocerypal450.models;

import java.util.ArrayList;

/**
 * This class will be used to model a recipe returned as JSON
 * from a Yummly API call to a Java object for handling within the app.
 */
public class Recipe {

    public String mRecipeName;
    public String mRecipeId;
    public ArrayList<String> mIngredients;
}
