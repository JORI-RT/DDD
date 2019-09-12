package scrum.Organization;

import java.util.List;

/**
 * Entity
 * プロダクトを生産する集団
 */
class Team {
    int id;
    List<TeamMember> developers;
     Team(List<TeamMember> developers) {
        this.developers = developers;
    }
}
