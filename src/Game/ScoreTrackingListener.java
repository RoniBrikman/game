//323871723 Roni Brikman
package Game;

import Collidable.Block;
import Collidable.HitListener;
import Sprite.Ball;

/**
 * The type Score tracking listener. Tracks the score.
 */
public class ScoreTrackingListener implements HitListener {
    private Counter currentScore;

    /**
     * Instantiates a new Score tracking listener.
     *
     * @param scoreCounter the score counter
     */
    public ScoreTrackingListener(Counter scoreCounter) {
        this.currentScore = scoreCounter;
    }

    @Override
    public void hitEvent(Block beingHit, Ball hitter) {
        currentScore.increase(5);
    }
}