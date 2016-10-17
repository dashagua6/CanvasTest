package bid.woou.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cc on 2016/10/16.
 */
public class MyView extends View {

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    // 重写该方法，进行绘图
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 把整张画布绘制成白色
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();
        // 去锯齿
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        int viewWidth = this.getWidth();
        // 绘制圆形
        canvas.drawCircle(viewWidth / 10 + 10, viewWidth / 10 + 10
        , viewWidth / 10, paint);
        // 绘制矩形
        canvas.drawRect(10 , viewWidth / 10 + 10, viewWidth / 10 + 10
            , viewWidth * 2 / 5 + 20, paint);
        RectF rel = new RectF(10, viewWidth / 2 + 40,
                10 + viewWidth / 5, viewWidth * 3 / 5 + 40);
        // 绘制圆角矩形
        canvas.drawRoundRect(rel, 15, 15, paint);
        RectF rell = new RectF(10, viewWidth * 3 / 5 + 50,
                10 + viewWidth / 5, viewWidth * 7 / 10 + 50);
        // 绘制椭圆
        canvas.drawOval(rell, paint);
        //定义一个Path对象，封闭成一个三角形
        Path path1 = new Path();
        path1.moveTo(10, viewWidth * 9 / 10 + 60);
        path1.lineTo(viewWidth / 5 + 10, viewWidth * 9 / 10 + 60);
        path1.lineTo(viewWidth / 10 + 10, viewWidth * 7 / 10 + 60);
        path1.close();
        // 根据Path进行绘制，绘制三角形
        canvas.drawPath(path1, paint);
        // 定义一个Path对象，封闭成一个五角星
        Path path2 = new Path();
        path2.moveTo(10 + viewWidth / 15, viewWidth * 9 / 10 + 70);
        path2.lineTo(10 + viewWidth * 2 / 15, viewWidth * 9 / 10 + 70);
        path2.lineTo(10 + viewWidth / 5, viewWidth + 70);
        path2.lineTo(10 + viewWidth / 10, viewWidth *11/10 + 70);
        path2.lineTo(10, viewWidth + 70);
        path2.close();
        // 根据Path进行绘制，绘制五角星
        canvas.drawPath(path2,paint);
        // 设置填充风格后绘制
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        // 绘制圆形
        canvas.drawCircle(viewWidth * 3 / 10 + 20, viewWidth / 10 + 10,
                viewWidth / 10, paint);

    }
}
