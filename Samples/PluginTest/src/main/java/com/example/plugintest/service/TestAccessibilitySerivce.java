package com.example.plugintest.service;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityEvent;

import com.example.plugintest.Log;


/**
 * Created by cailiming on 16/9/9.
 */
public class TestAccessibilitySerivce extends AccessibilityService {

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        AccessibilityServiceInfo info = new AccessibilityServiceInfo();
        info.packageNames = null; //监听过滤的包名 null to all
        info.eventTypes = AccessibilityEvent.TYPES_ALL_MASK; //监听哪些行为
        info.feedbackType = AccessibilityServiceInfo.FEEDBACK_SPOKEN; //反馈
        info.notificationTimeout = 100; //通知的时间
        setServiceInfo(info);
        Log.printStackTrace();
        Log.e("TestAccessibilitySerivce onServiceConnected");
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.e("TestAccessibilitySerivce onAccessibilityEvent : " + event.toString());
    }

    @Override
    public void onInterrupt() {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("TestAccessibilitySerivce onDestroy");
    }
}
