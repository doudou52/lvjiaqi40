package com.android.imitationapp.StorageData;

import org.litepal.LitePal;
import org.litepal.crud.LitePalSupport;
//设置数据类继承数据库，保存数据
public class AccountRegistration extends LitePalSupport {
    private int id;
    private String account;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
