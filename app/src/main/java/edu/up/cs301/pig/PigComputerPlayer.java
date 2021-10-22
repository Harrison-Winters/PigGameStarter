package edu.up.cs301.pig;

import java.util.Random;

import edu.up.cs301.game.GameComputerPlayer;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameInfo;
import edu.up.cs301.game.util.Tickable;

/**
 * An AI for Pig
 *
 * @author Andrew M. Nuxoll
 * @version August 2015
 */
public class PigComputerPlayer extends GameComputerPlayer {

    /**
     * ctor does nothing extra
     */
    public PigComputerPlayer(String name) {
        super(name);
    }

    /**
     * callback method--game's state has changed
     *
     * @param info
     * 		the information (presumably containing the game's state)
     */
    @Override
    protected void receiveInfo(GameInfo info) {
        // TODO  You will implement this method
        PigGameState pigGameState = new PigGameState((PigGameState) info);

        if (super.playerNum != pigGameState.getTurnId()) {
            return;
        }

        else {
            Random rnd = new Random();
            int actionNum = rnd.nextInt(1 - 0);



            if (actionNum == 0) {
                PigHoldAction newAction = new PigHoldAction(this);
                super.game.sendAction(newAction);
            }

            else {
                PigRollAction newAction = new PigRollAction(this);
                super.game.sendAction(newAction);
            }


        }



    }//receiveInfo

}
