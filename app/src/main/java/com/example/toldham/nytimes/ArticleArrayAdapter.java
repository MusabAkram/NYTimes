package com.example.toldham.nytimes;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by toldham on 8/13/16.
 */
public class ArticleArrayAdapter extends ArrayAdapter<Article> {

    public ArticleArrayAdapter (Context context, List<Article> articles) {
        super (context, android.R.layout.simple_list_item_1, articles);
    }
}
