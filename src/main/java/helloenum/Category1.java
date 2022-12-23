package helloenum;

public enum Category1 {
    PROJECT("프로젝트"),
    GROUP("그룹"),
    ORGANIZATION("조직");

    private String korName;

    Category1(String korName) {
        this.korName = korName;
    }

    public String getKorName() {
        return korName;
    }
}
