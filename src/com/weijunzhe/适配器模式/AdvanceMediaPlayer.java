package com.weijunzhe.适配器模式;

/**
 * <h3>design-patterns</h3>
 * <p>高级媒体播放器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-11 22:48
 **/

public interface AdvanceMediaPlayer {
    /**
     * 播放vlc格式视频
     * @param fileName 文件名
     */
    public void playVlc(String fileName);

    /**
     * 播放MP4格式视频
     * @param fileName 文件名
     */
    public void playMp4(String fileName);
}
