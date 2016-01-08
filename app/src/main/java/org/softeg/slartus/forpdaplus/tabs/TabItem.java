package org.softeg.slartus.forpdaplus.tabs;

import android.support.v4.app.Fragment;

/**
 * Created by radiationx on 31.10.15.
 */
public class TabItem{
    private String title;
    private String url;
    private String tag;
    private String parentTag;
    private String subTitle;
    private Fragment fragment;

    public TabItem(String title, String s, String name, Fragment fragment){
        this.title = this.title;
        this.url = url;
        this.tag = tag;
        this.fragment = fragment;
    }
    public TabItem(String title, String url, String tag, String parentTag, Fragment fragment){
        this.title = title;
        this.url = url;
        this.tag = tag;
        this.fragment = fragment;
        this.parentTag = parentTag;
    }

    public String getTitle() {
        return title;
    }
    public String getUrl() {
        return url;
    }
    public String getTag() {
        return tag;
    }
    public String getParentTag(){
        return parentTag;
    }
    public String getSubTitle(){
        return subTitle;
    }
    public Fragment getFragment() {
        return fragment;
    }

    public void setTitle(final String title){
        this.title = title;
    }
    public void setUrl(final String url){
        this.url = url;
    }
    public void setSubTitle(final String subTitle){
        this.subTitle = subTitle;
    }
    public void setParentTag(String parentTag) {
        this.parentTag = parentTag;
    }
}
