package com.evaluation.patterns.structural.proxy;

public class Domain {
    public static void main(String[] args) {
        YouTubeLib youTubeLib = new YouTubeProxy();

        youTubeLib.getVideos();
        youTubeLib.getVideoInfo();
        youTubeLib.downloadVideo();
    }
}
