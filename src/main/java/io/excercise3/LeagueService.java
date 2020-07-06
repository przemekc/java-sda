package io.excercise3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LeagueService {

  private static final Logger LOGGER = Logger.getLogger(LeagueService.class);

  private final Path DB = Paths.get("league.txt");

  private final ObjectMapper objectMapper = new ObjectMapper();

  public void save(League league) {
    LOGGER.info("Saving league to file " + DB);
    // object mapper ma mozliwosc zapisu obiektu Leage
    // ponizszy kod persystuje w pliku poszczegolne obiekty Game aby pkazac zapis do pliku przy uzyciu BufferedWritera
    try (BufferedWriter writer = Files.newBufferedWriter(DB, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
      for (Game game : league.getGames()) {
        String str = objectMapper.writeValueAsString(game); // transformacja (serilizacja) do stringa (JSON format) obiektu Game
        writer.write(str);
        writer.newLine();
      }
    } catch (IOException e) {
      LOGGER.error("Error while saving league", e);
      throw new RuntimeException("Error while saving file", e);
    }
  }

  public League loadFromFile() {
    LOGGER.info("Loding league from file " + DB);
    return new League(readAllGames());
  }

  private List<Game> readAllGames() {
    // object mapper ma mozliwosc odczytu obiektu Leage
    // ponizszy kod persystuje w pliku poszczegolne obiekty Game aby pkazac odczyt z pliku przy uzyciu BufferedReadera linia po linii
    try (BufferedReader reader = Files.newBufferedReader(DB)) {
      List<Game> games = new ArrayList<>();
      String line;
      while ((line = reader.readLine()) != null) {
        Game game = objectMapper.readValue(line, Game.class); // transformacja (deserializacja) ze stringa (JSON format) do obiektu Game
        games.add(game);
      }
      return games;
    } catch (IOException e) {
      LOGGER.error("Error while saving league", e);
      throw new RuntimeException("Error while saving file", e);
    }
  }
}
