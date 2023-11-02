package member;

public class BasicMember extends Member {
    public BasicMember(String name) {
        super(name, "Basic");
    }

    @Override
    public void belanja(int totalBelanja) {
        int earnedPoints = (totalBelanja / 10000) * 2;
        setPoint(getPoint() + earnedPoints);
    }
}
