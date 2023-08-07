package com.weijunzhe.适配器模式;

/**
 * <h3>design-patterns</h3>
 * <p>音频播放器</p>
 *
 * @author : weijunzhe
 * @date : 2022-10-11 22:58
 **/

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // mp3播放支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name:" + fileName);
        }

        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
