public class PriceModelFactory {

    public PriceModel getPriceModel(Video video) {
        if (video == null) {
            return null;
        }

        switch (video.getType()) {
            case 0: return new RegularPriceModel();
            case 1: return new KidsPriceModel();
            case 2: return new NewReleasePriceModel();
            default: return new RegularPriceModel();
        }

    }
}