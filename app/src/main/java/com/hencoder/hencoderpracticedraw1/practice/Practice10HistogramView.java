package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint mPaintRect = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path mPath = new Path();
    private Rect mRect = new Rect();

    private String[] mStrings = {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
    private int[] mLeftString = new int[7];
    private int mLeft = 58;
    private int mRight = mLeft + 75;
    private int mBottom = 400;
    private int mBottomText = 420;
    private int mTop;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPath.moveTo(50, 400);
        mPath.lineTo(50, 50);
        mPath.moveTo(50, 400);
        mPath.lineTo(650, 400);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        mPaint.setColor(Color.argb(200, 7, 237, 237));

        mPaintRect.setColor(Color.argb(200, 84, 237, 118));
        mPaintRect.setTextSize(15);

        for (int i = 0; i < mStrings.length; i++) {
            mPaintRect.getTextBounds(mStrings[i], 0, mStrings[i].length(), mRect);
            mLeftString[i] = mRect.width() / 2;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        canvas.drawPath(mPath, mPaint);

        int textCenter;
        for (int i = 0; i < 7; i++) {
            textCenter = (mLeft + mRight) / 2 - mLeftString[i];
            if (i == 0){
                mTop = mBottom - 3;
            }
            if (i == 1) {
                mTop = mBottom - 10;
            }
            if (i == 2) {
                mTop = mBottom - 8;
            }
            if (i == 3) {
                mTop = mBottom - 150;
            }
            if (i == 4) {
                mTop = mBottom - 300;
            }
            if (i == 5) {
                mTop = mBottom - 350;
            }
            if (i == 6) {
                mTop = mBottom - 130;
            }
            canvas.drawText(mStrings[i], textCenter, mBottomText, mPaintRect);
            canvas.drawRect(mLeft, mTop, mRight, mBottom, mPaintRect);

            mLeft += 85;
            mRight += 85;
        }

        mLeft = 58;
        mRight = mLeft + 75;
    }
}
