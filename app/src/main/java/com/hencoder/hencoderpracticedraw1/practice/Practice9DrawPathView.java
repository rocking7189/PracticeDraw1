package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path mPath = new Path();

    public Practice9DrawPathView(Context context) {
        this(context, null);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        lovePath();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void lovePath() {
        mPath.moveTo(400, 300);
        mPath.lineTo(305, 170);
        mPath.arcTo(300, 100, 400, 200, -199, 199, false);
        mPath.arcTo(400, 100, 500, 200, -180, 199, false);
        mPath.lineTo(495, 170);


//
//        mPath.lineTo(100, 100);
  //      mPath.arcTo(0, 0, 300, 300, -90, 359, true); // 强制移动到弧形起点（无痕迹）
        mPath.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(3);
//        练习内容：使用 canvas.drawPath() 方法画心形
        canvas.drawPath(mPath, mPaint);
    }
}
