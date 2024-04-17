public class ChildrensBook extends Book {
    private String recommendedAgeInfo;

    public ChildrensBook(long productId, String title, String author, int price, String recommendedAgeInfo) {
        super(productId, title, author, price);
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    public String getRecommendedAgeInfo() {
        return recommendedAgeInfo;
    }

    public void setRecommendedAgeInfo(String recommendedAgeInfo) {
        this.recommendedAgeInfo = recommendedAgeInfo;
    }

    @Override
    public void printDetails() {
        System.out.println(super.toString() + "\nRecommended Age: " + getRecommendedAgeInfo());
    }

    @Override
    public String toString() {
        return super.toString() + "\nRecommended Age: " + getRecommendedAgeInfo();
    }
}