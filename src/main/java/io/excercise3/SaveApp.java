package io.excercise3;

public class SaveApp {

  public static void main(String[] args) {
    LeagueService service = new LeagueService();

    League league = new League();

    league.addGame(new Game("LA Lakers", "New Your Kings", 87, 99));
    league.addGame(new Game("Utah Jazz", "New Your Kings", 101, 95));
    league.addGame(new Game("Detroit Pistons", "Houston Rockets", 97, 95));
    league.addGame(new Game("Chicago Bulls", "Miami Heat", 96, 95));

    service.save(league);
  }
}
