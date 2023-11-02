package member;

public class PlatinumMember extends Member {
    public PlatinumMember(String name) {
        super(name, "Platinum");
    }

    @Override
    public void belanja(int totalBelanja) {
        int earnedPoints = (int) (totalBelanja * 0.001) + (totalBelanja / 5000) * 2;
        setPoint(getPoint() + earnedPoints);
    }
}
