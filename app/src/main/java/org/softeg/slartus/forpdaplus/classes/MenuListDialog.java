package org.softeg.slartus.forpdaplus.classes;

/**
 * Created by radiationx on 31.01.16.
 */
public class MenuListDialog {
    private Runnable runnable;
    private String title;

    public MenuListDialog(String title, Runnable runnable){
        this.title = title;
        this.runnable = runnable;
    }

    public String getTitle() {
        return title;
    }

    public Runnable getRunnable() {
        return runnable;
    }
}
