package Coderbyte;

public class StarRating {

    public static String StarRating(String inputString) {
        double starRatingAsDouble = Double.parseDouble(inputString);
        StringBuilder starRating = new StringBuilder();

        for (int count = 0; count < 5; count++) {
            if (starRatingAsDouble >= 1.0){
                starRating.append("full ");
                starRatingAsDouble -= 1.0;
            } else if (starRatingAsDouble == 0.0){
                starRating.append("empty ");
            } else {
                starRatingAsDouble += 0.25;
                starRating.append(starRatingAsDouble >= 1.0 ? "full " : starRatingAsDouble >= 0.5 ? "half "
                        : "empty ");
                starRatingAsDouble = 0.0;
            }
        }

        return starRating.toString();
    }


    public static void main(String[] args) {
        System.out.println(StarRating("0.38"));
        System.out.println(StarRating("4.5"));
    }

}
