package za.ac.cput.factory;


import za.ac.cput.domain.Listing;
import za.ac.cput.util.ListingHelper;

import java.time.LocalDate;

public class ListingFactory {


    public static Listing createListing(int id , String title, String description , LocalDate datePosted){

        if(ListingHelper.notValidID(id) ){
            return null;
        }
        if(ListingHelper.inputNull(title) || ListingHelper.inputNull(description)){
            return null;
        }
        if(ListingHelper.notValidDate(datePosted)){
            return null;
        }

        return  new Listing.Builder().setId(id).setTitle(title).setDescription(description).setDatedPosted(datePosted).build();
    }
}
