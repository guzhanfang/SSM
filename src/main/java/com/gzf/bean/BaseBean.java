package com.gzf.bean;/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/7/20
 * @Introduce
 */

import java.util.Date;

/**
 *@ClassName BaseBean
 *@Author gzf
 *@Date 2020/7/20 15:14
 *@Description TODO
 */
public class BaseBean {
    private int id;
    private Date ct;
    private  Date ut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCt() {
        return ct;
    }

    public void setCt(Date ct) {
        this.ct = ct;
    }

    public Date getUt() {
        return ut;
    }

    public void setUt(Date ut) {
        this.ut = ut;
    }
}
