package com.lol.project;
import android.graphics.Canvas;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Penguin {
    float x, y;
    float vx, vy;
    Paint paint = new Paint();
    void step() {
        this.x += vx;
        this.y += vy;
    }
    Penguin (float x, float y){
        this.x = x;
        this.y = y;
        this.vx = (float)(Math.random()*4-2);
        this.vy = (float)(Math.random()*4-2);
    }
    void draw(Canvas canvas){
        paint.setColor(Color.BLUE);
        canvas.drawCircle(x + 25, y + 90, 40, paint);
        canvas.drawCircle(x + 25,y + 40,20, paint);
    }
}
