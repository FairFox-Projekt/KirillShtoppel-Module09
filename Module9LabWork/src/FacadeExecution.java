public class FacadeExecution {
    public static void main(String[] args) {
        AudioSystem audio = new AudioSystem();
        VideoProjector video = new VideoProjector();
        LightingSystem lights = new LightingSystem();

        HomeTheaterFacade homecomplex = new HomeTheaterFacade(audio, video, lights);

        homecomplex.startMovie();
        System.out.println();
        homecomplex.endMovie();
    }
}