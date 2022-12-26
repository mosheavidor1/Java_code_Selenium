package Casting;

public class AnimalsData {

    Animals voice;


    public AnimalsData(Animals voice) {
        this.voice = voice;


    }

    public void setVoice(Animals voice) {
        this.voice = voice;
        voice.makeNoise();

    }

    public Animals getVoice() {
        return voice;

    }
}
