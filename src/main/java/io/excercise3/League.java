package io.excercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {

  private final List<Game> games;

  public League() {
    this(new ArrayList<>());
  }

  public League(List<Game> games) {
    this.games = games;
  }

  public List<Game> getGames() {
    return Collections.unmodifiableList(games);
  }

  public void addGame(Game game) {
    this.games.add(game);
  }
}
