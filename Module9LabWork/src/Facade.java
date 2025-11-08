class AudioSystem {
    public void turnOn() {
        System.out.println("Audio system: ON.");
    }
    public void setVolume(int level) {
        System.out.println("Audio volume: " + level + ".");
    }
    public void turnOff() {
        System.out.println("Audio system: OFF.");
    }
}
class VideoProjector {
    public void turnOn() {
        System.out.println("Video system: ON.");
    }
    public void setResolution(String resolution) {
        System.out.println("Video resolution: " + resolution + ".");
    }
    public void turnOff() {
        System.out.println("Video system: ON.");
    }
}
class LightingSystem {
    public void turnOn() {
        System.out.println("Lights system: ON.");
    }
    public void setBrightness(int level) {
        System.out.println("Lights brightness: " + level + ".");
    }
    public void turnOff() {
        System.out.println("Lights system: OFF.");
    }
}

class HomeTheaterFacade {
    private AudioSystem audioSystem;
    private VideoProjector videoProjector;
    private LightingSystem lightingSystem;
    public HomeTheaterFacade(AudioSystem audioSystem, VideoProjector videoProjector, LightingSystem lightingSystem) {
        this.audioSystem = audioSystem;
        this.videoProjector = videoProjector;
        this.lightingSystem = lightingSystem;
    }
    public void startMovie() {
        System.out.println("Cinema starting. Wait a moment.");
        lightingSystem.turnOn();
        lightingSystem.setBrightness(2);
        audioSystem.turnOn();
        audioSystem.setVolume(1);
        videoProjector.turnOn();
        videoProjector.setResolution("HD");
        System.out.println("Cinema started.");
    }
    public void endMovie() {
        System.out.println("Ending cinema. Wait a moment.");
        videoProjector.turnOff();
        audioSystem.turnOff();
        lightingSystem.turnOff();
        System.out.println("Cinema ended.");
    }
}