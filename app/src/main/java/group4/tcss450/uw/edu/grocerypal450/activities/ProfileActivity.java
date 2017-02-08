package group4.tcss450.uw.edu.grocerypal450.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import group4.tcss450.uw.edu.grocerypal450.R;
import group4.tcss450.uw.edu.grocerypal450.fragment.ProfileFragment;

/**
 * This class handles all fragments related to a user's profile, such as
 * searching for recipes, editing inventory, and editing shopping lists.
 */
public class ProfileActivity extends AppCompatActivity {

    private ProfileFragment mProfileFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mProfileFragment = new ProfileFragment();
        Bundle args = new Bundle();
        Intent sourceIntent = getIntent();
        ArrayList<String> userStuff = sourceIntent.getStringArrayListExtra("userInfo");
        args.putStringArrayList("userInfo", userStuff);
        mProfileFragment.setArguments(args);
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.ProfileActivity_Frame, mProfileFragment, ProfileFragment.TAG)
                .commit();
    }
}
