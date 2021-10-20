package edu.up.cs301.pig;

public class PigGameState {
    private int turnId;
    private int player0Score;
    private int player1Score;
    private int runningTotal;
    private int currDieValue;

    public PigGameState() {
        this.turnId = 0;
        this.player0Score = 0;
        this.player1Score = 0;
        this.runningTotal = 0;
        this.currDieValue = 0;


    }


    public PigGameState(PigGameState pigGameState){
        this.turnId = pigGameState.getTurnId();
        this.player0Score = pigGameState.getPlayer0Score();
        this.player1Score = pigGameState.getPlayer1Score();
        this.runningTotal = pigGameState.getRunningTotal();
        this.currDieValue = pigGameState.getCurrDieValue();
    }





    public int getTurnId() {
        return turnId;
    }

    public int getPlayer0Score() {
        return player0Score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getRunningTotal() {
        return runningTotal;
    }

    public int getCurrDieValue() {
        return currDieValue;
    }

   public void setTurnId(int turnId){
        this.turnId = turnId;
   }

    public void setPlayer0Score(int player0Score){
        this.player0Score = player0Score;
    }

    public void setPlayer1Score(int player1Score){
        this.player1Score = player1Score;
    }

    public void setRunningTotal(int runningTotal ){
        this.runningTotal = runningTotal;
    }

    public void setCurrDieValue(int currDieValue){
        this.currDieValue = currDieValue;
    }

}