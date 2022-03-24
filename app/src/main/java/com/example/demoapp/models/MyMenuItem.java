package com.example.demoapp.models;

import android.graphics.drawable.Drawable;

import com.example.demoapp.R;

import java.util.Arrays;
import java.util.List;

public class MyMenuItem {
    String title;
    int icon;
    public MyMenuItem(String title, int icon) {
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }

    static public List<MyMenuItem> menuItemList = Arrays.asList(
            new MyMenuItem("Account details", R.drawable.ic_person),
            new MyMenuItem("Security", R.drawable.ic_security),
            new MyMenuItem("Manage stuff", R.drawable.ic_star),
            new MyMenuItem("View limits", R.drawable.ic_compare_arrows),
            new MyMenuItem("Terms and conditions", R.drawable.ic_library_books),
            new MyMenuItem("Contact us", R.drawable.ic_phone)
    );
}
