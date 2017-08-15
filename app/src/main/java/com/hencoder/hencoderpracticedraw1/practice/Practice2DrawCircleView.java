package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    private Paint mPaint1 = new Paint();
    private Paint mPaint2 = new Paint();
    private Paint mPaint3 = new Paint();
    private Paint mPaint4 = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        //1.实心圆没去锯齿
        canvas.drawCircle(200, 100, 100, mPaint1);

        //2.空心圆去锯齿.anti:抗 alias:锯齿状
        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint2.setStrokeWidth(2);
        mPaint2.setAntiAlias(true);
        canvas.drawCircle(450, 100, 100, mPaint2);

        //3.蓝色实心圆
        mPaint3.setColor(Color.BLUE);
        mPaint3.setAntiAlias(true);
        canvas.drawCircle(200, 350, 100, mPaint3);

//        4.线宽为 20 的空心圆
        mPaint4.setAntiAlias(true);
        mPaint4.setStyle(Paint.Style.STROKE);
        mPaint4.setStrokeWidth(20);
        canvas.drawCircle(450, 350, 100, mPaint4);
    }
}
