package com.matej.cache.entity;


import java.io.Serializable;
import java.util.Date;

public class BaseUserEntity implements Serializable {

    private static final long serialVersionUID = 4630989007512697617L;
    /**
     * <pre>
     * 
     * 表字段 : tbBaseUser.id
     * </pre>
     */
    private Long id;

    /**
     * <pre>
     * 手机号
     * 表字段 : tbBaseUser.loginMobile
     * </pre>
     */
    private String loginMobile;

    /**
     * <pre>
     * 登录密码
     * 表字段 : tbBaseUser.loginPwd
     * </pre>
     */
    private String loginPwd;

    /**
     * <pre>
     * 注册来源。1，PC网站；2，Android端；3，iOS端
     * 表字段 : tbBaseUser.platform
     * </pre>
     */
    private Integer platform;

    /**
     * <pre>
     * 注册的产品来源。1-录音转文字；2-视频加字幕
     * 表字段 : tbBaseUser.product
     * </pre>
     */
    private Integer product;

    /**
     * <pre>
     * 创建时间
     * 表字段 : tbBaseUser.createTime
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 
     * 表字段 : tbBaseUser.modifiedTime
     * </pre>
     */
    private Date modifiedTime;

    /**
     * <pre>
     * 获取：
     * 表字段：tbBaseUser.id
     * </pre>
     *
     * @return tbBaseUser.id：
     */
    public Long getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：tbBaseUser.id
     * </pre>
     *
     * @param id
     *            tbBaseUser.id：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：手机号
     * 表字段：tbBaseUser.loginMobile
     * </pre>
     *
     * @return tbBaseUser.loginMobile：手机号
     */
    public String getLoginMobile() {
        return loginMobile;
    }

    /**
     * <pre>
     * 设置：手机号
     * 表字段：tbBaseUser.loginMobile
     * </pre>
     *
     * @param loginMobile
     *            tbBaseUser.loginMobile：手机号
     */
    public void setLoginMobile(String loginMobile) {
        this.loginMobile = loginMobile == null ? null : loginMobile.trim();
    }

    /**
     * <pre>
     * 获取：登录密码
     * 表字段：tbBaseUser.loginPwd
     * </pre>
     *
     * @return tbBaseUser.loginPwd：登录密码
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * <pre>
     * 设置：登录密码
     * 表字段：tbBaseUser.loginPwd
     * </pre>
     *
     * @param loginPwd
     *            tbBaseUser.loginPwd：登录密码
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * <pre>
     * 获取：注册来源。1，PC网站；2，Android端；3，iOS端
     * 表字段：tbBaseUser.platform
     * </pre>
     *
     * @return tbBaseUser.platform：注册来源。1，PC网站；2，Android端；3，iOS端
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * <pre>
     * 设置：注册来源。1，PC网站；2，Android端；3，iOS端
     * 表字段：tbBaseUser.platform
     * </pre>
     *
     * @param platform
     *            tbBaseUser.platform：注册来源。1，PC网站；2，Android端；3，iOS端
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * <pre>
     * 获取：注册的产品来源。1-录音转文字；2-视频加字幕
     * 表字段：tbBaseUser.product
     * </pre>
     *
     * @return tbBaseUser.product：注册的产品来源。1-录音转文字；2-视频加字幕
     */
    public Integer getProduct() {
        return product;
    }

    /**
     * <pre>
     * 设置：注册的产品来源。1-录音转文字；2-视频加字幕
     * 表字段：tbBaseUser.product
     * </pre>
     *
     * @param product
     *            tbBaseUser.product：注册的产品来源。1-录音转文字；2-视频加字幕
     */
    public void setProduct(Integer product) {
        this.product = product;
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：tbBaseUser.createTime
     * </pre>
     *
     * @return tbBaseUser.createTime：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：tbBaseUser.createTime
     * </pre>
     *
     * @param createTime
     *            tbBaseUser.createTime：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：tbBaseUser.modifiedTime
     * </pre>
     *
     * @return tbBaseUser.modifiedTime：
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：tbBaseUser.modifiedTime
     * </pre>
     *
     * @param modifiedTime
     *            tbBaseUser.modifiedTime：
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}