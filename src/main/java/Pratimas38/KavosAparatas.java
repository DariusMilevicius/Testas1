package Pratimas38;

public class KavosAparatas {

    private int pilnaTalpa;
    private int dabartineTalpa;

    public KavosAparatas(int pilnaTalpa, int dabartineTalpa) {
        this.pilnaTalpa = pilnaTalpa;
        this.dabartineTalpa= dabartineTalpa;
    }

    public int getTalpa() {
        return pilnaTalpa;
    }

    public void setTalpa(int talpa) {
        this.pilnaTalpa = talpa;
    }

    public void pilnas(){
        pilnaTalpa = dabartineTalpa;
    }


}
