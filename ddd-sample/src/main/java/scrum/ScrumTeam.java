package scrum;

import java.util.List;

public class ScrumTeam {
    private Team team;
    private ScrumMaster scrumMaster;

    private ScrumTeam(Team team, ScrumMaster scrumMaster) {
        this.team = team;
        this.scrumMaster = scrumMaster;
    }

    /**
     * スクラムチームのファクトリメソッド
     * 集約スクラムチームの不変条件をもつ
     * @param developers
     * @param scrumMaster
     * @return 不変条件が守られたスクラムチーム
     */
    public static ScrumTeam generateScrumTeam(List<Developer> developers, ScrumMaster scrumMaster) {
        if(developers.size() <= 3 || developers.size() >= 7) {
            throw new IllegalArgumentException("不適切なデベロッパーの数");
        }
        if(scrumMaster == null) {
            throw new IllegalArgumentException("ScrumTeamには必ず１人のScrumMasterが必要です");
        }
        Team team = new Team(developers);
        return new ScrumTeam(team, scrumMaster);
    }
}
