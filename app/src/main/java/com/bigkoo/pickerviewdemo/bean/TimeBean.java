package com.bigkoo.pickerviewdemo.bean;

import com.bigkoo.pickerview.model.IPickerViewData;

/**
 * Author:       梁铖城
 * Email:        1038127753@qq.com
 * Date:         2015年11月21日15:28:25
 * Description:  开始或者结束轮训器
 */
public class TimeBean implements IPickerViewData {
    private String time;

    public TimeBean(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String getPickerViewText() {
        return time;
    }
}
