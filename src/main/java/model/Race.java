package model;

import java.time.LocalDate;

/**
 * Created by ZENIT on 23.05.2016.
 */
public class Race {
    private int         raceId;
    private String      raceName;
    private LocalDate   raceDate;
    private int         raceWinner;

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public LocalDate getRaceDate() {
        return raceDate;
    }

    public void setRaceDate(LocalDate raceDate) {
        this.raceDate = raceDate;
    }

    public int getRaceWinner() {
        return raceWinner;
    }

    public void setRaceWinner(int raceWinner) {
        this.raceWinner = raceWinner;
    }
}
