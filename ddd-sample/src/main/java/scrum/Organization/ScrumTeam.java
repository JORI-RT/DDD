package scrum.Organization;
import java.util.List;

/**
 * 集約
 * Entity
 * スクラムの組織単位
 */
public class ScrumTeam {
    int id;
    private Team team;
    private ScrumMaster scrumMaster;

    private ScrumTeam(Team team, ScrumMaster scrumMaster) {
        this.team = team;
        this.scrumMaster = scrumMaster;
    }

    /**
     * スクラムチームのファクトリ
     * 集約スクラムチームの不変条件をもつ
     * @param developers
     * @param scrumMaster
     * @return 不変条件が守られたスクラムチーム
     */
    public static ScrumTeam generateScrumTeam(List<TeamMember> developers, ScrumMaster scrumMaster) {
        if(developers.size() < 5 || developers.size() > 9) {
            throw new IllegalArgumentException("不適切なデベロッパーの数");
        }
        if(scrumMaster == null) {
            throw new IllegalArgumentException("ScrumTeamには必ず１人のScrumMasterが必要");
        }
        Team team = new Team(developers);
        return new ScrumTeam(team, scrumMaster);
    }
}
