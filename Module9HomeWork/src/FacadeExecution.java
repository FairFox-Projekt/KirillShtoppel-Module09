public class FacadeExecution {
    public static void main(String[] args) {
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole steamdeck = new GameConsole(); //я не помню, может ли стимдек как свитч присоединяться к телевизору или нет.
        HomeTheaterFacade homecomplex = new HomeTheaterFacade(tv, audio, dvd, steamdeck);

        homecomplex.watchMovie();
        System.out.println("");
        homecomplex.endMovie();
        System.out.println("");
        homecomplex.playGame("Quasimorph");
        System.out.println("");
        homecomplex.stopGame();
    }
}