public class Spiller {

    private String name;
    private int score;

    public Spiller(String name1, int score1){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score=score;
    }

    public void addScore(int score){
        this.score = this.score + score;
    }
}
