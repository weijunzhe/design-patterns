package com.weijunzhe.适配器模式;

/**
 * <h3>design-patterns</h3>
 * <p>Vlc视频播放器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-11 22:50
 **/

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name:" + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
