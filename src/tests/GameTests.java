package tests;

import java.util.*;
import com.Game;
import com.Inning;
import org.junit.Assert;
import org.junit.Test;

public class GameTests {
    @Test
    public void getRunsTest(){

        ArrayList<Inning> innings = new ArrayList<>();

        innings.add(new Inning(1, 2, 0));
        innings.add(new Inning(2, 2, 0));

        Game game = new Game(1);
        game.setInnings(innings);

        Assert.assertTrue(game.getRunsHome() == 0);
        Assert.assertTrue(game.getRunsAway() == 4);
    }
}
