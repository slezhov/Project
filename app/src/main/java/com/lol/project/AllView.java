package com.lol.project;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;

public class AllView extends View {
    Penguin kesha = new Penguin(25,100);
    Penguin lusi = new Penguin(120,100);
    Penguin [] penguins;
    int n = 10;

    public AllView(Context context) {
        super(context);
        this.setBackgroundColor(WHITE);
        penguins = new Penguin[100];
        n = 10;
        for (int i = 0; i < n; i++) {
            penguins[i] = new Penguin(100, 100);
        }
    }
    public AllView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setBackgroundColor(WHITE);
        penguins = new Penguin[100];
        n = 10;
        for(int i = 0; i < n; i++){
            penguins[i] = new Penguin(100,100);
    }


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        kesha.step();
        lusi.step();
        kesha.draw(canvas);
        lusi.draw(canvas);
        for (int i = 0; i < n; i++){
            penguins[i].draw(canvas);
            penguins[i].step();
        }
        invalidate();
    }
}
