package scrum.Organization;

/**
 * エンティティ
 */
public abstract class TeamMember {
    public static TeamMember create() {
        return null;
    }

}

class Developer extends TeamMember{

}
class Tester extends TeamMember {

}
class Designer extends TeamMember {

}