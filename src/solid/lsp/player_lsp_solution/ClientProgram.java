package solid.lsp.player_lsp_solution;

import java.util.ArrayList;
import java.util.List;

public class ClientProgram {
    public static void main(String[] args) {
        List<VideoPlayer> allVideoPlayers = new ArrayList<>();
        allVideoPlayers.add(new TorPlayer());
        allVideoPlayers.add(new VlcPlayer());
        playVideoInAllPlayers(allVideoPlayers);

        System.out.println("----------");

        List<AudioPlayer> allAudioPlayers = new ArrayList<>();
        allAudioPlayers.add(new WinampPlayer());
        playAudioInAllPlayers(allAudioPlayers);

    }

    public static void playAudioInAllPlayers(List<AudioPlayer> allPlayers){
        for(Player p : allPlayers){
            p.playAudio();
        }
    }

    public static void playVideoInAllPlayers(List<VideoPlayer> allPlayers){
        for(VideoPlayer p : allPlayers){
            p.playVideo();
        }
    }
}
