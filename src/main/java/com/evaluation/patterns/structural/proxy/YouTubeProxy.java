package com.evaluation.patterns.structural.proxy;

public class YouTubeProxy implements YouTubeLib {

    private YouTubeIntegrator integrator;

    public YouTubeProxy() {
    }

    @Override
    public void getVideos() {
        if (integrator == null) {
            integrator = new YouTubeIntegrator();
        }
        integrator.getVideos();
    }

    @Override
    public void getVideoInfo() {
        if (integrator == null) {
            integrator = new YouTubeIntegrator();
        }
        integrator.getVideoInfo();
    }

    @Override
    public void downloadVideo() {
        if (integrator == null) {
            integrator = new YouTubeIntegrator();
        }
        integrator.downloadVideo();
    }
}
