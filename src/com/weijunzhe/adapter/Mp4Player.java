package com.weijunzhe.adapter;

/**
 * <h3>design-patterns</h3>
 * <p>MP4视频播放器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-11 22:51
 **/

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name:" + fileName);
    }
}
