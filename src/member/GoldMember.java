package member;

public class GoldMember extends Member {
    public GoldMember(String name) {
        super(name, "Gold");
    }

    @Override
    public void belanja(int totalBelanja) {
        int earnedPoints = (int) (totalBelanja * 0.001);
        setPoint(getPoint() + earnedPoints);
    }
}
