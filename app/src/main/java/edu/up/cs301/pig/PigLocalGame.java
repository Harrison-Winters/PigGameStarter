package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameState;

import android.util.Log;

// dummy comment, to see if commit and push work from srvegdahl account

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame {

    /**
     * This ctor creates a new game state
     */


    private PigGameState pigGameState;



    public PigLocalGame() {
        //TODO  You will implement this constructor

        pigGameState = new PigGameState();
    }

    /**
     * can the player with the given id take an action right now?
     */
    @Override
    protected boolean canMove(int playerIdx) {
        //TODO  You will implement this method


        if (playerIdx == pigGameState.getTurnId()) {
            return true;
        }

        return false;
    }

    /**
     * This method is called when a new action arrives from a player
     *
     * @return true if the action was taken or false if the action was invalid/illegal.
     */
    @Override
    protected boolean makeMove(GameAction action) {
        //TODO  You will implement this method

        if (action instanceof PigHoldAction) {
            if (pigGameState.getTurnId() == 0) {
                pigGameState.setPlayer0Score(pigGameState.getRunningTotal()
                        + pigGameState.getPlayer0Score());

            }

            else if (pigGameState.getTurnId() == 1) {
                pigGameState.setPlayer1Score(pigGameState.getRunningTotal()
                        + pigGameState.getPlayer1Score());

            }

            pigGameState.setRunningTotal(0);

            if (super.playerNames.length > 1) {

            }

        }



        return false;
    }//makeMove

    /**
     * send the updated state to a given player
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        //TODO  You will implement this method
    }//sendUpdatedSate

    /**
     * Check if the game is over
     *
     * @return
     * 		a message that tells who has won the game, or null if the
     * 		game is not over
     */
    @Override
    protected String checkIfGameOver() {
        //TODO  You will implement this method
        return null;
    }

}// class PigLocalGame
