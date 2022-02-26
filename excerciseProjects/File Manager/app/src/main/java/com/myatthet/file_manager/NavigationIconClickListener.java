//package com.myatthet.file_manager;
//
//import android.animation.AnimatorSet;
//import android.app.Activity;
//import android.content.Context;
//import android.util.DisplayMetrics;
//import android.view.View;
//import android.view.animation.Interpolator;
//
//import androidx.annotation.Nullable;
//
//public class NavigationIconClickListener implements View.OnClickListener{
//
//    private final AnimatorSet animatorSet = new AnimatorSet();
//    private Context context;
//    private View sheet;
//    private Interpolator interpolator;
//    private int height;
//
//    NavigationIconClickListener(Context context, View sheet) {
//        this(context, sheet,null);
//    }
//
//    NavigationIconClickListener(Context context, View sheet, @Nullable Interpolator interpolator) {
//        this(context, sheet, interpolator, null, null);
//    }
//
//    NavigationIconClickListener(
//            Context context, View sheet, @Nullable Interpolator interpolator) {
//        this.context = context;
//        this.sheet = sheet;
//        this.interpolator = interpolator;
//
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        height = displayMetrics.heightPixels;
//    }
//
//}
