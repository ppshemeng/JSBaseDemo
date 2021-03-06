package com.jia.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.jia.demo.activity.CircularProgressActivity;
import com.jia.demo.activity.DataBindingActivity;
import com.jia.demo.activity.EventBusFirstActivity;
import com.jia.demo.activity.GlideImageViewActivity;
import com.jia.demo.activity.HtmlCacheActivity;
import com.jia.demo.activity.DBActivity;
import com.jia.demo.activity.HuaLangActivity;
import com.jia.demo.activity.IndexActivity;
import com.jia.demo.activity.ItemAnimatorActivity;
import com.jia.demo.activity.JavaActivity;
import com.jia.demo.activity.LifeMethodActivity;
import com.jia.demo.activity.MILoadingActivity;
import com.jia.demo.activity.MaterialDesignActivity;
import com.jia.demo.activity.DownLoadActivity;
import com.jia.demo.activity.NotificationActivity;
import com.jia.demo.activity.OkHttpActivity;
import com.jia.demo.activity.PDFActivity;
import com.jia.demo.activity.ParallaxActivity;
import com.jia.demo.activity.PathAnimationActivity;
import com.jia.demo.activity.PopupWindowActivity;
import com.jia.demo.activity.RecyclerViewActivity;
import com.jia.demo.activity.RetrofitActivity;
import com.jia.demo.activity.RxJavaActivity;
import com.jia.demo.activity.SVGActivity;
import com.jia.demo.activity.ScaleTypeActivity;
import com.jia.demo.activity.StatusBarActivity;
import com.jia.demo.activity.TagActivity;
import com.jia.demo.activity.VerticalLooperViewActivity;
import com.jia.demo.activity.ViewPagerActivity;
import com.jia.demo.activity.WaterWaveProgressActivity;
import com.jia.demo.adapter.MyAdapter;
import com.jia.demo.base.BaseWebViewActivity;
import com.jia.demo.base.recyclerview.JsOnItemClickListener;
import com.jia.demo.bean.Login;
import com.jia.demo.utils.StatusBarUtils;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this,R.color.blue_a700);
        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;

//      ===================BaseAdapter测试=====================================
        List<Login> list = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            Login login = new Login();
            switch (i) {
                case 0:
                    login.setNote("标签示例");
                    break;
                case 1:
                    login.setNote("自定义banner");
                    break;
                case 2:
                    login.setNote("BaseWebViewActivity");
                    break;
                case 3:
                    login.setNote("html缓存");
                    break;
                case 4:
                    login.setNote("RxJava");
                    break;
                case 5:
                    login.setNote("封装okhttp框架");
                    break;
                case 6:
                    login.setNote("折叠效果RecyclerView");
                    break;
                case 7:
                    login.setNote("GreenDao数据库");
                    break;
                case 8:
                    login.setNote("EventBus");
                    break;
                case 9:
                    login.setNote("右边快速索引栏");
                    break;
                case 10:
                    login.setNote("DataBinding");
                    break;
                case 11:
                    login.setNote("Material Design(质感设计)");
                    break;
                case 12:
                    login.setNote("纵向走马灯");
                    break;
                case 13:
                    login.setNote("自定义原形进度条");
                    break;
                case 14:
                    login.setNote("多线程下载断点续传");
                    break;
                case 15:
                    login.setNote("JAVA基础");
                    break;
                case 16:
                    login.setNote("Retrofit+RxJava");
                    break;
                case 17:
                    login.setNote("封装Glide的ImageView");
                    break;
                case 18:
                    login.setNote("瀑布流");
                    break;
                case 19:
                    login.setNote("SVG图片使用");
                    break;
                case 20:
                    login.setNote("Path动画");
                    break;
                case 21:
                    login.setNote("画廊效果");
                    break;
                case 22:
                    login.setNote("水纹波浪加载进度");
                    break;
                case 23:
                    login.setNote("自定义通知");
                    break;
                case 24:
                    login.setNote("封装PopupWindow");
                    break;
                case 25:
                    login.setNote("沉浸式状态栏");
                    break;
                case 26:
                    login.setNote("Activity生命周期");
                    break;
                case 27:
                    login.setNote("PDF阅读器");
                    break;
                case 28:
                    login.setNote("RecyclerView的item动画");
                    break;
                case 29:
                    login.setNote("ImageView的ScaleType");
                    break;
                case 30:
                    login.setNote("仿小米视频加载中动画");
                    break;
                default:
                    login.setNote("第" + (i + 1) + "条数据");
                    break;
            }

            list.add(login);
        }

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

        MyAdapter mAdapter = new MyAdapter(MainActivity.this, list);

        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        rv.setAdapter(mAdapter);

        // 点击事件
        rv.addOnItemTouchListener(new JsOnItemClickListener(rv) {
            @Override
            public void onJsItemClick(RecyclerView.ViewHolder vh, int position) {

                switch (position) {
                    case 0:
                        startActivity(new Intent(mContext, TagActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(mContext, ViewPagerActivity.class));
                        break;
                    case 2:
                        Intent intent = new Intent(mContext, BaseWebViewActivity.class);
                        intent.putExtra("url", "https://juejin.im/timeline");
                        startActivity(intent);
                        break;
                    case 3:
                        startActivity(new Intent(mContext, HtmlCacheActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(mContext, RxJavaActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(mContext, OkHttpActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(mContext, ParallaxActivity.class));
                        break;
                    case 7:
                        startActivity(new Intent(mContext, DBActivity.class));
                        break;
                    case 8:
                        startActivity(new Intent(mContext, EventBusFirstActivity.class));
                        break;
                    case 9:
                        startActivity(new Intent(mContext, IndexActivity.class));
                        break;
                    case 10:
                        startActivity(new Intent(mContext, DataBindingActivity.class));
                        break;
                    case 11:
                        startActivity(new Intent(mContext, MaterialDesignActivity.class));
                        break;
                    case 12:
                        startActivity(new Intent(mContext, VerticalLooperViewActivity.class));
                        break;
                    case 13:
                        startActivity(new Intent(mContext, CircularProgressActivity.class));
                        break;
                    case 14:
                        startActivity(new Intent(mContext, DownLoadActivity.class));
                        break;
                    case 15:
                        startActivity(new Intent(mContext, JavaActivity.class));
                        break;
                    case 16:
                        startActivity(new Intent(mContext, RetrofitActivity.class));
                        break;
                    case 17:
                        startActivity(new Intent(mContext, GlideImageViewActivity.class));
                        break;
                    case 18:
                        startActivity(new Intent(mContext, RecyclerViewActivity.class));
                        break;
                    case 19:
                        startActivity(new Intent(mContext, SVGActivity.class));
                        break;
                    case 20:
                        startActivity(new Intent(mContext, PathAnimationActivity.class));
                        break;
                    case 21:
                        startActivity(new Intent(mContext, HuaLangActivity.class));
                        break;
                    case 22:
                        startActivity(new Intent(mContext, WaterWaveProgressActivity.class));
                        break;
                    case 23:
                        startActivity(new Intent(mContext, NotificationActivity.class));
                        break;
                    case 24:
                        startActivity(new Intent(mContext, PopupWindowActivity.class));
                        break;
                    case 25:
                        startActivity(new Intent(mContext, StatusBarActivity.class));
                        break;
                    case 26:
                        startActivity(new Intent(mContext, LifeMethodActivity.class));
                        break;
                    case 27:
                        startActivity(new Intent(mContext, PDFActivity.class));
                        break;
                    case 28:
                        startActivity(new Intent(mContext, ItemAnimatorActivity.class));
                        break;
                    case 29:
                        startActivity(new Intent(mContext, ScaleTypeActivity.class));
                        break;
                    case 30:
                        startActivity(new Intent(mContext, MILoadingActivity.class));
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "点击第" + (position + 1) + "条", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onJsItemLongClick(RecyclerView.ViewHolder vh, int position) {
                Log.e("Tag", " onJsItemLongClick----" + position);
            }
        });


    }
}
