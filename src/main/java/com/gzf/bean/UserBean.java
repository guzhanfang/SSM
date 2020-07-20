package com.gzf.bean;/**
 * @Author guzhanfang
 * @Email guzhanfangyi@163.com
 * @Date 2020/7/20
 * @Introduce
 */

/**
 *@ClassName UserBean
 *@Author gzf
 *@Date 2020/7/20 15:13
 *@Description TODO
 */
public class UserBean extends BaseBean{
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
