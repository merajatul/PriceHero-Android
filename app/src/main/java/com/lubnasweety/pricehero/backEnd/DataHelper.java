package com.lubnasweety.pricehero.backEnd;

import com.lubnasweety.pricehero.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Asus on 11/23/2017.
 */

public class DataHelper {
    HashMap<productDetails, ArrayList<DetailEachShop>> data = new HashMap<>();
    ArrayList<productDetails> products = new ArrayList<productDetails>();
    ArrayList<DetailEachShop> product1List;


    public ArrayList<DetailEachShop> getShopList(productDetails details) {
        //return data.get(details);
        return product1List;
    }

    public DataHelper() {

        productDetails product4 = new productDetails("Radhuni Mustard Oil", "Radhuni", R.drawable.oil);
        productDetails product5 = new productDetails("Basmoti white rice", "Basmoti", R.drawable.rice);
        productDetails product6 = new productDetails("Mirzapur Tea", "Mirzapur", R.drawable.teapack);

        productDetails product7 = new productDetails("Camera", "Canon", R.drawable.camera);
        productDetails product8 = new productDetails("Laptop", "HP", R.drawable.laptop);
        productDetails product9 = new productDetails("Television", "Walton", R.drawable.tv);

        productDetails product1 = new productDetails("Necless", "PC chondro", R.drawable.necless);
        productDetails product2 = new productDetails("Angti", "Aunjoli", R.drawable.angti);
        productDetails product3 = new productDetails("Bangle", "shornali", R.drawable.bangle);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);


        product1List = new ArrayList<DetailEachShop>();

        product1List.add(new DetailEachShop(38, "Lubna Store", "Ambarkhana", "10% offer", 20));
        product1List.add(new DetailEachShop(40, "Sweety Store", "Nehari para", "No offer", 35));
        product1List.add(new DetailEachShop(41, "Nammi Store", "Tilagor Point", "No offer", 30));
        product1List.add(new DetailEachShop(39, "Eshita Store", "Majumdari, Ambarkhana", "No offer", 3));


        data.put(product1, product1List);
        data.put(product2, product1List);
        data.put(product3, product1List);
        data.put(product4, product1List);
        data.put(product5, product1List);
        data.put(product6, product1List);
        data.put(product7, product1List);
        data.put(product8, product1List);
        data.put(product9, product1List);
    }

    public static String getCompany(String name) {
        if(name.equals("Radhuni Mustard Oil")) return "Radhuni";
        else if(name.equals("Basmoti white rice")) return "Basmoti";
        else if(name.equals("Mirzapur Tea")) return "Mirzapur";

        else if(name.equals("Camera")) return "Canon";
        else if(name.equals("Laptop")) return "HP";
        else if(name.equals("Television")) return "Walton";

        else if(name.equals("Necless")) return "PC chondro";
        else if(name.equals("Angti")) return "Aunjoli";
        else if(name.equals("Bangle")) return "shornali";
        else return "SUST";
    }

    public static String[] getNames(String category) {
        String[] names;
        if (category.equals("ornaments")) {
            names = new String[]{
                    "Necless",
                    "Angti",
                    "Bangle"
            };
        } else if (category.equals("grocery")) {
            names = new String[]{
                    "Radhuni Mustard Oil",
                    "Basmoti white rice",
                    "Mirzapur Tea"
            };
        } else if (category.equals("electronics")) {
            names = new String[]{
                    "Camera",
                    "Laptop",
                    "Television"
            };
        } else {
            names = new String[]{
                    "Necless",
                    "Angti",
                    "Bangle"
            };
        }
        return names;
    }

    public static int[] getImages(String category) {
        int[] images;
        if (category.equals("ornaments")) {
            images = new int[]{
                    R.drawable.necless,
                    R.drawable.angti,
                    R.drawable.bangle
            };

        } else if (category.equals("grocery")) {
            images = new int[]{
                    R.drawable.oil,
                    R.drawable.rice,
                    R.drawable.teapack
            };
        } else if (category.equals("electronics")) {
            images = new int[]{
                    R.drawable.camera,
                    R.drawable.laptop,
                    R.drawable.tv
            };
        } else {
            images = new int[]{
                    R.drawable.necless,
                    R.drawable.angti,
                    R.drawable.bangle
            };

        }

        return images;
    }
}