public class TvShow {
    private String showName;
    private int numEpisodes;
    private String genre;

    public TvShow(String showName, int numEpisodes, String genre) {
        this.showName = showName;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public String getShowName() { return showName; }
    public void setShowName(String showName) { this.showName = showName; }

    public int getNumEpisodes() { return numEpisodes; }
    public void setNumEpisodes(int numEpisodes) { this.numEpisodes = numEpisodes; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    private String renderJudgement() {
        String[] opinions = {"good", "bad", "acceptable", "tolerable", "garbage", "unconscionable", "excellent", "s-tier"};
        int index = (int)Math.floor(Math.random() * opinions.length);
        return opinions[index];
    }

    @Override
    public String toString() {
        return getShowName() + " is a " + getGenre() + " show with " + getNumEpisodes() + " episodes. RNGesus deems it " + renderJudgement() + ".";
    }
}
