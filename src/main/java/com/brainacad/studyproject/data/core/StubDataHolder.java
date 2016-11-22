package com.brainacad.studyproject.data.core;


import static com.brainacad.studyproject.data.domain.AdType.EXCHANGE;
import static com.brainacad.studyproject.data.domain.AdType.PURCHASE;
import static com.brainacad.studyproject.data.domain.AdType.SELL;
import static com.brainacad.studyproject.data.domain.Role.USER;
import static com.brainacad.studyproject.data.domain.Role.ADMIN;

import com.brainacad.studyproject.data.domain.Ad;
import com.brainacad.studyproject.data.domain.AdType;
import com.brainacad.studyproject.data.domain.User;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Alexander on 11/3/2016.
 */
public class StubDataHolder {

    //private static Collection<Integer> userAdReference;
    private static Collection<Ad> ads;
    private static Collection<User> users;
    private static boolean created = false;

    public static void createData(){

        if (!created){
            User admin = new User();
            admin.setId(1);
            admin.setUsername("admin");
            admin.setPassword("admin");
            admin.setRole(ADMIN);

            User user1 = new User();
            user1.setId(2);
            user1.setUsername("user1");
            user1.setPassword("user1");
            user1.setRole(USER);

            User user2 = new User();
            user2.setId(3);
            user2.setUsername("user2");
            user2.setPassword("user2");
            user2.setRole(USER);

            users = new HashSet<>();
            users.add(admin);
            users.add(user1);
            users.add(user2);

            Ad ad1 = new Ad();
            ad1.setId(1);
            ad1.setUserIdAdGot(2);
            ad1.setAdType(SELL);
            ad1.setShortDescription("Sell the car");
            ad1.setFullDescription("Sell bmw V8 4.0L 444hp, mileage 100000km ");

            Ad ad2 = new Ad();
            ad2.setId(2);
            ad2.setUserIdAdGot(3);
            ad2.setAdType(PURCHASE);
            ad2.setShortDescription("Purchase a car");
            ad2.setFullDescription("Buy bmw v6 - v8, 400 - 500 hp, mileage not more then 150000km");

            Ad ad3 = new Ad();
            ad3.setId(3);
            ad3.setUserIdAdGot(2);
            ad3.setAdType(EXCHANGE);
            ad3.setShortDescription("Exchange cars");
            ad3.setFullDescription("Change my bmw V8 4.0L 444hp, mileage 100000km on a mercedes amg 4.0L ");

            ads = new HashSet<>();
            ads.add(ad1);
            ads.add(ad2);
            ads.add(ad3);



            created = true;
        }
    }

    public static int add (User user){
        if (users.add(user)){
            int maxId = 0;
            Iterator<User> userIterator = users.iterator();
            while (userIterator.hasNext()){
                User element = userIterator.next();
                if (element.getId() > maxId){
                    maxId = element.getId();
                }
            }
            user.setId(maxId + 1);
            return user.getId();
        }else {
            return 0;
        }
    }

    public static Collection<User> getUsers() {
        return users;
    }

    public static int addAd(Ad ad){
        if (ads.add(ad)){
            int maxId = 0;
            Iterator<Ad> adIterator = ads.iterator();
            while (adIterator.hasNext()){
                Ad element = adIterator.next();
                if (element.getId() > maxId){
                    maxId = element.getId();
                }
            }
            ad.setId(maxId + 1);
            return ad.getId();
        } else {
            return 0;
        }
    }

    public static Collection<Ad> getAds(){
        return ads;
    }
}
