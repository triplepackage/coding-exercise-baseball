package tests;


import com.Player;
import com.PlayerGamePerformance;
import org.junit.Assert;
import org.junit.Test;


public class PlayerGamePerformanceTests {
    @Test
    public void testBattingAverage() {
        PlayerGamePerformance performance = new PlayerGamePerformance(new Player("f081095a-7d7b-11e9-8f9e-2a86e4085a59", "John", "Doe"),
                5, 5, 0, 0, 0);

        float average = performance.getGameBattingAverage();
        Assert.assertTrue(average == 1.0f);
    }

    @Test
    public void testBattingAverage25() {
        PlayerGamePerformance performance = new PlayerGamePerformance(new Player("f081095a-7d7b-11e9-8f9e-2a86e4085a59", "John", "Doe"),
                4, 1, 0, 0, 0);

        float average = performance.getGameBattingAverage();
        Assert.assertTrue(average == 0.25f);
    }

    @Test
    public void testBattingAverage50() {
        PlayerGamePerformance performance = new PlayerGamePerformance(new Player("f081095a-7d7b-11e9-8f9e-2a86e4085a59", "John", "Doe"),
                4, 1, 0, 0, 1);

        float average = performance.getGameBattingAverage();
        Assert.assertTrue(average == 0.5f);
    }

    @Test
    public void testSluggingPercentage() {
        PlayerGamePerformance performance = new PlayerGamePerformance(new Player("f081095a-7d7b-11e9-8f9e-2a86e4085a59", "John", "Doe"),
                4, 1, 0, 0, 0);

        float average = performance.getGameBattingAverage();
        Assert.assertTrue(average == 0.25f);
    }

    @Test
    public void testSluggingPercentage25() {
        PlayerGamePerformance performance = new PlayerGamePerformance(new Player("f081095a-7d7b-11e9-8f9e-2a86e4085a59", "John", "Doe"),
                4, 1, 1, 1, 1);

        float average = performance.getGameSluggingPercentage();
        Assert.assertTrue(average == 2.5f);
    }
}
