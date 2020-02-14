package com.evaluation.patterns.structural.proxy;

public class YouTubeIntegrator implements YouTubeLib {

    @Override
    public void getVideos() {
        System.out.println("Pulling list videos...");
    }

    @Override
    public void getVideoInfo() {
        System.out.println("Pulling info for video...");
    }

    @Override
    public void downloadVideo() {
        System.out.println("Downloading video...");
    }
}
