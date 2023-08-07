package com.weijunzhe.适配器模式;

/**
 * <h3>design-patterns</h3>
 * <p>媒体播放器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-11 22:46
 **/

public interface MediaPlayer {
    /**
     * 播放
     * @param audioType 视频类型
     * @param fileName 文件名
     */
    public void play(String audioType, String fileName);
}
