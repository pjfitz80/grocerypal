
package group4.tcss450.uw.edu.grocerypal450.fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import group4.tcss450.uw.edu.grocerypal450.R;

/**
 * This fragment display's the user's name and email and offers
 * navigation options to the other fragments in the application.
 * @author Michael Lambion
 * @author Nico Tandyo
 * @author Patrick Fitzgerald
 */
public class ProfileFragment extends Fragment {
    /**
     * TAG for ProfileFragment
     */
    public static final String TAG = "ProfileFragment";
    /**
     * Key to retrieve arguments sent from MainActivity.
     */
    public static final String KEY = "userInfo";
    /**
     * ArrayList containing the arguments passed from MainActivity.
     */
    private ArrayList<String> mNameEmail;
    /** TextView to show the name. */
    private TextView mShowName;

    /**
     * Construct for ProfileFragment.
     */
    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * {@inheritDoc}
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mNameEmail = getArguments().getStringArrayList(KEY);
            System.out.println(mNameEmail);
        }
    }

    /**
     * {@inheritDoc}
     * Displays the user's name and email and set's listener to
     * buttons to take the user to other features of the app.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        getActivity().setTitle(getResources().getString(R.string.grocerypal_title));
        mShowName = (TextView) v.findViewById(R.id.showName);
        updateContent(mNameEmail.get(0));
        Button b = (Button) v.findViewById(R.id.goToSearch);
        b.setOnClickListener(new View.OnClickListener() {
            /**
             * {@inheritDoc}
             * @param v
             */
            public void onClick(View v) {
                goToSearch();
            }
        });
        Button buttonShop = (Button) v.findViewById(R.id.goToShoppingList);
        buttonShop.setOnClickListener(new View.OnClickListener() {
            /**
             * {@inheritDoc}
             * @param v
             */
            @Override
            public void onClick(View v) {
                goToShoppingList();
            }
        });

        Button buttonInven = (Button) v.findViewById(R.id.goToInventory);
        buttonInven.setOnClickListener(new View.OnClickListener() {
            /**
             * {@inheritDoc}
             * @param v
             */
            @Override
            public void onClick(View v) {
                goToInventory();
            }
        });

        return v;
    }

    /**
     * Set the text views to display the user's name.
     * @param name Name to be shown
     */
    public void updateContent(String name) {
        mShowName.setText(name);
    }

    /**
     * Replace this fragment with the RecipeSearch fragment.
     */
    private void goToSearch(){

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        RecipeSearch fragment = new RecipeSearch();
        ft.replace(R.id.fragmentContainer, fragment, RecipeSearch.TAG);
        ft.addToBackStack(RecipeSearch.TAG).commit();
    }

    /**
     * Replace this fragment with the Inventory fragment.
     */
    private void goToInventory(){

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        InventoryFragment fragment = new InventoryFragment();
        ft.replace(R.id.fragmentContainer, fragment, InventoryFragment.TAG);
        ft.addToBackStack(InventoryFragment.TAG).commit();
    }



    /**
     * Replace this fragment with the ShoppingList fragment.
     */
    private void goToShoppingList(){

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ShoppingListFragment fragment = new ShoppingListFragment();
        ft.replace(R.id.fragmentContainer, fragment, ShoppingListFragment.TAG);
        ft.addToBackStack(ShoppingListFragment.TAG).commit();
    }
}
