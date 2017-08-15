package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private Paint mPaint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint mPaint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint mPaint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
    private RectF rectF = new RectF(100, 50, 700, 450);

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        //sweep :扫
        mPaint1.setStyle(Paint.Style.FILL); // 填充模式
        canvas.drawArc(rectF, -100, 100, true, mPaint1);//绘制扇形
        canvas.drawArc(rectF, 20, 140, false, mPaint1); // 绘制弧形
        mPaint2.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, 180, 60, false, mPaint2);//绘制弧线
    }
}
