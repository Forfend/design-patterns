package com.evaluation.patterns.behavioral.template;

public abstract class WebTemplate {

    public final void showPage(){
        System.out.println("Header...");
        showMainContent();
        System.out.println("Footer...");
    }

    public abstract void showMainContent();
}
