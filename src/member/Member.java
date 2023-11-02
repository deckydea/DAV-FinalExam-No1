package member;

public class Member {
    private static int memberCount = 0;
    private int memberNumber;
    private String name;
    private String level;
    private int point;

    public Member(String name, String level) {
        this.memberNumber = ++memberCount;
        this.name = name;
        this.level = level;
        this.point = 0;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void belanja(int totalBelanja) {

    }

    public String getDisplayName() {
        return memberNumber + ". " + name + " - " + level + " - " + point + " point";
    }
}
