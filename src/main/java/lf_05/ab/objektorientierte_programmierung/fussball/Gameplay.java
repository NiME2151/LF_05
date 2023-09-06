package lf_05.ab.objektorientierte_programmierung.fussball;

import static lf_05.util.NicoMath.randomInt;

public class Gameplay {

    private static final int MAX_PLAYBACK_TIME_IN_MINUTES = 5;
    private static final int PLAYTIME_IN_MINUTES = randomInt(90, (90 + MAX_PLAYBACK_TIME_IN_MINUTES));
    private static final int MAX_DURATION_FOR_NEXT_ACTION_IN_MINUTES = 10;

    private static int determineTeamValue(Mannschaft team) {
        int teamValue = (int) (team.getStrength() * team.getMotivation() * team.getTrainer().getExperience());
        return Math.max(teamValue, 1);
    }

    private static boolean isGoalScored(Spieler scorer, Torwart goalkeeper) {
        double goalShot = Math.max(scorer.getGoalShot() + randomInt(-2 ,2), 1);
        double reaction = Math.max(goalkeeper.getReaction() + randomInt(-2, 2), 1);
        return goalShot > reaction;
    }

    private static void doAction(Spiel game, Mannschaft attackingTeam, Mannschaft defendingTeam, int currentMinute) {
        int teamSizeOfAttackingTeam = attackingTeam.getListOfSpieler().size();
        Spieler scorer = attackingTeam
                .getListOfSpieler()
                .get(randomInt(0, (teamSizeOfAttackingTeam-1)));
        if (isGoalScored(scorer, defendingTeam.getTorwart())) {
            attackingTeam
                    .getListOfSpieler()
                    .get(attackingTeam
                            .getListOfSpieler()
                            .indexOf(scorer)
                    ).incrementGoalCount();
            incrementGoalCountOfAttackingTeam(game, attackingTeam);
            updateGameReport(game, attackingTeam, true, currentMinute);
        }
        else {
            updateGameReport(game, attackingTeam, false, currentMinute);
        }
    }

    private static void incrementGoalCountOfAttackingTeam(Spiel game, Mannschaft team) {
        if (team.equals(game.getHomeTeam())) {
            game
                    .getResult()
                    .incrementGoalCountOfHomeTeam();
        }
        else if (team.equals(game.getGuestTeam())) {
            game
                    .getResult()
                    .incrementGoalCountOfGuestTeam();
        }
        else {
            System.out.println("Error while updating successful goal shot");
        }
    }

    private static void updateGameReport(Spiel game, Mannschaft attackingTeam, boolean wasActionSuccessful, int currentMinute) {
        if (wasActionSuccessful) {
            game.updateGameReport("Minute " + currentMinute + ": " + attackingTeam.getName() + " scored a goal.");
        }
        else {
            game.updateGameReport("Minute " + currentMinute + ": " + attackingTeam.getName() + " tried to score a goal, but did not succeed.");
        }
    }

    private static void addEndResultToGameReport(Spiel game, int currentMinute) {
        if (game.getResult().getGoalCountOfHomeTeam() > game.getResult().getGoalCountOfGuestTeam()) {
            game.updateGameReport("Minute " + currentMinute + ": " + game.getHomeTeam().getName() + " wins the game!");
        }
        else {
            game.updateGameReport("Minute " + currentMinute + ": " + game.getGuestTeam().getName() + " wins the game!");
        }
    }

    public static boolean isGameCancelled() {
        return randomInt(0, 999) == 0;
    }

    public static void runGame(Spiel game) throws SpielAbbruchException {
        int currentMinute = randomInt(0, MAX_DURATION_FOR_NEXT_ACTION_IN_MINUTES);
        do {
            int teamValueOfHomeTeam = determineTeamValue(game.getHomeTeam());
            int teamValueOfGuestTeam = determineTeamValue(game.getGuestTeam());
            int sum = randomInt(0 , (teamValueOfHomeTeam + teamValueOfGuestTeam));
            if (isGameCancelled()) {
                throw new SpielAbbruchException(currentMinute);
            }
            else {
                if (sum > teamValueOfHomeTeam) {
                    doAction(game, game.getHomeTeam(), game.getGuestTeam(), currentMinute);
                }
                else {
                    doAction(game, game.getGuestTeam(), game.getHomeTeam(), currentMinute);
                }
            }
            currentMinute += randomInt(0, MAX_DURATION_FOR_NEXT_ACTION_IN_MINUTES);
        } while (currentMinute < PLAYTIME_IN_MINUTES);
        addEndResultToGameReport(game, currentMinute);
    }
}
