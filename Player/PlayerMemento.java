package Player;

public class PlayerMemento {
        private String name;
        private Player player;
        public PlayerMemento(Player player) {
            this.player = player;
            this.name = player.getPlayerName();
        }

        public void restore() {
            player.setPlayerName(name);
        }

}
