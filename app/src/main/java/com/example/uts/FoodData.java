package com.example.uts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;

import java.util.ArrayList;

public class FoodData{
    public static ArrayList<Food> getData(Context context){
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Cheese Cake","Desert Dish",35000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cireng","Fried Side Dish",2000,context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Donut","Who doesn't love donuts?",5000,context.getDrawable(R.drawable.donut)));
        list.add(new Food("Mie Goreng","Indomie Seleraku!",8000,context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Kopi Hitam","Kopi Hitam Asli Indonesia",7500,context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Batagor","Dibuat dari tahu yang dilebutkan dan diisi dengan adonan berbahan ikan tenggiri dan tepung tapioka lalu dibentuk menyerupai bola yang digoreng dalam minyak panas selama beberapa menit hingga matang",10000,context.getDrawable(R.drawable.batagor)));
        return list;
    }
}