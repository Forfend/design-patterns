package com.evaluation.patterns.behavioral.template;

public class Domain {

    public static void main(String[] args) {
        WebTemplate news = new NewsSite();
        WebTemplate jobs = new JobSite();

        news.showPage();
        System.out.println("=============");
        jobs.showPage();
    }
}
