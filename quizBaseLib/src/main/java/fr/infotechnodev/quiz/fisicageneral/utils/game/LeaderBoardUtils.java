package fr.infotechnodev.quiz.fisicageneral.utils.game;

import fr.infotechnodev.quiz.fisicageneral.R;

public class LeaderBoardUtils {

    public static void pushOneTryScore(BaseActivity ga, int points) {
        if (ga.isSignedIn()) {
            ga.submitScore(ga.getString(R.string.google_game_leaderboardid_onetry_bestscore), points);
        }
    }

    public static void push10QuestionsScore(BaseActivity ga, int points) {
        if (ga.isSignedIn()) {
            ga.submitScore(ga.getString(R.string.google_game_leaderboardid_10questions_bestscore), points);
        }
    }
}
