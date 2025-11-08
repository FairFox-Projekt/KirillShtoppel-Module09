class TV {
    void on() {
        System.out.println("TV: ON.");
    }
    void off() {
        System.out.println("TV: OFF.");
    }
    void setChannel(int channel) {
        System.out.println("TV channel now: " + channel);
    }
}
class AudioSystem {
    void on() {
        System.out.println("Audio system: ON.");
    }
    void off() {
        System.out.println("Audio system: OFF.");
    }
    void setVolume(int level) {
        System.out.println("Audio volume: " + level);
    }
}
class DVDPlayer {
    void play() {
        System.out.println("DVD started.");
    }
    void pause() {
        System.out.println("DVD paused");
    }
    void stop() {
        System.out.println("DVD no more working.");
    }
}

class GameConsole {
    void on() {
        System.out.println("Game Console: ON.");
    }
    void playGame(String game) {
        System.out.println("Playing now: " + game);
    }
    void off() {
        System.out.println("Game Console: OFF. Warning: Save files of the game could be corrupted!");
    }
}

class HomeTheaterFacade {
    private TV television;
    private AudioSystem audio;
    private DVDPlayer dvdplayer;
    private GameConsole gameconsole;
    HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole console) {
        this.television = tv;
        this.audio = audio;
        this.dvdplayer = dvd;
        this.gameconsole = console;
    }
    void watchMovie() {
        television.on();
        television.setChannel(2);
        audio.on();
        audio.setVolume(3);
        dvdplayer.play();
    }
    void endMovie() {
        dvdplayer.stop();
        audio.off();
        television.off();
    }
    void playGame(String game) {
        television.on();
        audio.on();
        audio.setVolume(1);
        gameconsole.on();
        gameconsole.playGame(game);
    }
    void stopGame() {
        television.off();
        audio.off();
        gameconsole.off();
    }
}