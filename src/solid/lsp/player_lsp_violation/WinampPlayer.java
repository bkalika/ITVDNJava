package solid.lsp.player_lsp_violation;

public class WinampPlayer extends Player {

    public void playVideo(){
        throw new VideoUnsupportedException();

    }
}
