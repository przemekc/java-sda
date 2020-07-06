package io.excercise3;

import org.apache.log4j.Logger;

public class LoadApp {
  private static final Logger LOGGER = Logger.getLogger(LoadApp.class);

  public static void main(String[] args) {
    LeagueService service = new LeagueService();

    League finalResults = service.loadFromFile();
    printState(finalResults);
  }

  private static void printState(League secondRound) {
    secondRound.getGames().forEach(game -> System.out.println(game.describe()));
  }
}
