package io.excercise3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Game {

  private final String gameA;
  private final String gameB;
  private final int scoreA;
  private final int scoreB;

  @JsonCreator
  public Game(@JsonProperty("gameA") String gameA,
              @JsonProperty("gameB") String gameB,
              @JsonProperty("scoreA") int scoreA,
              @JsonProperty("scoreB") int scoreB) {
    this.gameA = gameA;
    this.gameB = gameB;
    this.scoreA = scoreA;
    this.scoreB = scoreB;
  }

  public String describe() {
    return String.format("%s : %s score result %d : %d", gameA, gameB, scoreA, scoreB);
  }
}
