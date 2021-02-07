package solid.lsp.player_lsp_violation;

import java.util.ArrayList;
import java.util.List;

public class ClientProgram {
    public static void main(String[] args) {
        List<Player> allPlayers = new ArrayList<>();

        allPlayers.add(new VlcPlayer());
        allPlayers.add(new TorPlayer());

        playVideoInAllPlayers(allPlayers);
        System.out.println("---------");

        allPlayers.add(new WinampPlayer());
        playVideoInAllPlayers(allPlayers);

    }

    public static void playVideoInAllPlayers(List<Player> allPlayers){
        for(var player : allPlayers){
            player.playVideo();
        }
    }
}
