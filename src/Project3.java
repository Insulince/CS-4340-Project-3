import java.util.ArrayList;

public class Project3 {
    public static void main(String[] args) throws ImproperlySizedLogisticRegressionDatumException {
        final ArrayList<LogisticRegressionFeature<Integer>> logisticRegressionFeatures1 = new ArrayList<>();
        final LogisticRegressionFeature<Integer> logisticRegressionFeature1_1 = new LogisticRegressionFeature<>(1);
        logisticRegressionFeatures1.add(logisticRegressionFeature1_1);
        final LogisticRegressionOutcome logisticRegressionOutcome1 = new LogisticRegressionOutcome(0);
        final SingleFeatureLogisticRegressionDatum<Integer> singleFeatureLogisticRegressionDatum1 = new SingleFeatureLogisticRegressionDatum<>(logisticRegressionFeatures1, logisticRegressionOutcome1);

        final ArrayList<LogisticRegressionFeature<Integer>> logisticRegressionFeatures2 = new ArrayList<>();
        final LogisticRegressionFeature<Integer> logisticRegressionFeature2_1 = new LogisticRegressionFeature<>(2);
        logisticRegressionFeatures2.add(logisticRegressionFeature2_1);
        final LogisticRegressionOutcome logisticRegressionOutcome2 = new LogisticRegressionOutcome(1);
        final SingleFeatureLogisticRegressionDatum<Integer> singleFeatureLogisticRegressionDatum2 = new SingleFeatureLogisticRegressionDatum<>(logisticRegressionFeatures2, logisticRegressionOutcome2);

        final ArrayList<LogisticRegressionFeature<Integer>> logisticRegressionFeatures3 = new ArrayList<>();
        final LogisticRegressionFeature<Integer> logisticRegressionFeature3_1 = new LogisticRegressionFeature<>(3);
        logisticRegressionFeatures3.add(logisticRegressionFeature3_1);
        final LogisticRegressionOutcome logisticRegressionOutcome3 = new LogisticRegressionOutcome(0);
        final SingleFeatureLogisticRegressionDatum<Integer> singleFeatureLogisticRegressionDatum3 = new SingleFeatureLogisticRegressionDatum<>(logisticRegressionFeatures3, logisticRegressionOutcome3);

        final ArrayList<LogisticRegressionFeature<Integer>> logisticRegressionFeatures4 = new ArrayList<>();
        final LogisticRegressionFeature<Integer> logisticRegressionFeature4_1 = new LogisticRegressionFeature<>(4);
        logisticRegressionFeatures4.add(logisticRegressionFeature4_1);
        final LogisticRegressionOutcome logisticRegressionOutcome4 = new LogisticRegressionOutcome(1);
        final SingleFeatureLogisticRegressionDatum<Integer> singleFeatureLogisticRegressionDatum4 = new SingleFeatureLogisticRegressionDatum<>(logisticRegressionFeatures4, logisticRegressionOutcome4);

        final ArrayList<LogisticRegressionFeature<Integer>> logisticRegressionFeatures5 = new ArrayList<>();
        final LogisticRegressionFeature<Integer> logisticRegressionFeature5_1 = new LogisticRegressionFeature<>(5);
        logisticRegressionFeatures5.add(logisticRegressionFeature5_1);
        final LogisticRegressionOutcome logisticRegressionOutcome5 = new LogisticRegressionOutcome(0);
        final SingleFeatureLogisticRegressionDatum<Integer> singleFeatureLogisticRegressionDatum5 = new SingleFeatureLogisticRegressionDatum<>(logisticRegressionFeatures5, logisticRegressionOutcome5);

        final ArrayList<LogisticRegressionFeature<Integer>> logisticRegressionFeatures6 = new ArrayList<>();
        final LogisticRegressionFeature<Integer> logisticRegressionFeature6_1 = new LogisticRegressionFeature<>(6);
        logisticRegressionFeatures6.add(logisticRegressionFeature6_1);
        final LogisticRegressionOutcome logisticRegressionOutcome6 = new LogisticRegressionOutcome(1);
        final SingleFeatureLogisticRegressionDatum<Integer> singleFeatureLogisticRegressionDatum6 = new SingleFeatureLogisticRegressionDatum<>(logisticRegressionFeatures6, logisticRegressionOutcome6);

        final ArrayList<LogisticRegressionFeature<Integer>> logisticRegressionFeatures7 = new ArrayList<>();
        final LogisticRegressionFeature<Integer> logisticRegressionFeature7_1 = new LogisticRegressionFeature<>(7);
        logisticRegressionFeatures7.add(logisticRegressionFeature7_1);
        final LogisticRegressionOutcome logisticRegressionOutcome7 = new LogisticRegressionOutcome(1);
        final SingleFeatureLogisticRegressionDatum<Integer> singleFeatureLogisticRegressionDatum7 = new SingleFeatureLogisticRegressionDatum<>(logisticRegressionFeatures7, logisticRegressionOutcome7);

        final ArrayList<LogisticRegressionFeature<Integer>> logisticRegressionFeatures8 = new ArrayList<>();
        final LogisticRegressionFeature<Integer> logisticRegressionFeature8_1 = new LogisticRegressionFeature<>(8);
        logisticRegressionFeatures8.add(logisticRegressionFeature8_1);
        final LogisticRegressionOutcome logisticRegressionOutcome8 = new LogisticRegressionOutcome(1);
        final SingleFeatureLogisticRegressionDatum<Integer> singleFeatureLogisticRegressionDatum8 = new SingleFeatureLogisticRegressionDatum<>(logisticRegressionFeatures8, logisticRegressionOutcome8);

        ArrayList<SingleFeatureLogisticRegressionDatum<Integer>> singleFeatureLogisticRegressionData = new ArrayList<>();
        singleFeatureLogisticRegressionData.add(singleFeatureLogisticRegressionDatum1);
        singleFeatureLogisticRegressionData.add(singleFeatureLogisticRegressionDatum2);
        singleFeatureLogisticRegressionData.add(singleFeatureLogisticRegressionDatum3);
        singleFeatureLogisticRegressionData.add(singleFeatureLogisticRegressionDatum4);
        singleFeatureLogisticRegressionData.add(singleFeatureLogisticRegressionDatum5);
        singleFeatureLogisticRegressionData.add(singleFeatureLogisticRegressionDatum6);
        singleFeatureLogisticRegressionData.add(singleFeatureLogisticRegressionDatum7);
        singleFeatureLogisticRegressionData.add(singleFeatureLogisticRegressionDatum8);

        SingleFeatureLogisticRegression<Integer> singleFeatureLogisticRegression = new SingleFeatureLogisticRegression<>(singleFeatureLogisticRegressionData);

        System.out.println(singleFeatureLogisticRegression.toString());
    }
}

abstract class LogisticRegression<T> {
    private final ArrayList<LogisticRegressionDatum<T>> logisticRegressionData;

    LogisticRegression(final ArrayList<LogisticRegressionDatum<T>> logisticRegressionData) {
        this.logisticRegressionData = logisticRegressionData;
    }

    public ArrayList<LogisticRegressionDatum<T>> getLogisticRegressionData() {
        return this.logisticRegressionData;
    }

    @Override()
    public String toString() {
        return "{\"logisticRegressionData\": " + this.logisticRegressionData.toString() + "}";
    }
}

class SingleFeatureLogisticRegression<T> extends LogisticRegression {
    SingleFeatureLogisticRegression(final ArrayList<SingleFeatureLogisticRegressionDatum<T>> singleFeatureLogisticRegressionData) {
        super(singleFeatureLogisticRegressionData);
    }
}

interface VaryingQuantityFeatures {
    Integer getAnticipatedQuantityFeatures();

    boolean containsAnticipatedQuantityFeatures();
}

abstract class LogisticRegressionDatum<T> implements VaryingQuantityFeatures {
    private final ArrayList<LogisticRegressionFeature<T>> logisticRegressionFeatures;
    private final LogisticRegressionOutcome logisticRegressionOutcome;

    LogisticRegressionDatum(final ArrayList<LogisticRegressionFeature<T>> logisticRegressionFeatures, final LogisticRegressionOutcome logisticRegressionOutcome) {
        this.logisticRegressionFeatures = logisticRegressionFeatures;
        this.logisticRegressionOutcome = logisticRegressionOutcome;
    }

    public ArrayList<LogisticRegressionFeature<T>> getLogisticRegressionFeatures() {
        return this.logisticRegressionFeatures;
    }

    public LogisticRegressionOutcome getLogisticRegressionOutcome() {
        return this.logisticRegressionOutcome;
    }

    @Override()
    public String toString() {
        return "{\"logisticRegressionFeatures\": " + this.getLogisticRegressionFeatures().toString() + ", \"logisticRegressionOutcome\": " + this.getLogisticRegressionOutcome().toString() + "}";
    }
}

class SingleFeatureLogisticRegressionDatum<T> extends LogisticRegressionDatum implements VaryingQuantityFeatures {
    private static final Integer ANTICIPATED_QUANTITY_FEATURES = 1;

    SingleFeatureLogisticRegressionDatum(final ArrayList<LogisticRegressionFeature<T>> logisticRegressionFeatures, final LogisticRegressionOutcome logisticRegressionOutcome) throws ImproperlySizedLogisticRegressionDatumException {
        super(logisticRegressionFeatures, logisticRegressionOutcome);

        if (!this.containsAnticipatedQuantityFeatures()) {
            throw new ImproperlySizedLogisticRegressionDatumException(this);
        }
    }

    @Override()
    public Integer getAnticipatedQuantityFeatures() {
        return SingleFeatureLogisticRegressionDatum.ANTICIPATED_QUANTITY_FEATURES;
    }

    @Override()
    public boolean containsAnticipatedQuantityFeatures() {
        return this.getLogisticRegressionFeatures().size() == SingleFeatureLogisticRegressionDatum.ANTICIPATED_QUANTITY_FEATURES;
    }
}

class ImproperlySizedLogisticRegressionDatumException extends Exception {
    ImproperlySizedLogisticRegressionDatumException(final LogisticRegressionDatum logisticRegressionDatum) {
        super("Improperly sized LogisticRegressionDatum. Expected size \"" + logisticRegressionDatum.getAnticipatedQuantityFeatures() + "\", encountered size: \"" + logisticRegressionDatum.getLogisticRegressionFeatures().size() + "\", for LogisticRegressionDatum with data \"" + logisticRegressionDatum.toString() + "\".");
    }
}

class LogisticRegressionFeature<T> {
    private final T value;

    LogisticRegressionFeature(final T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    @Override()
    public String toString() {
        return "{\"value\": " + this.getValue().toString() + "}";
    }
}

class LogisticRegressionOutcome {
    private final Boolean value;

    LogisticRegressionOutcome(final Boolean value) {
        this.value = value;
    }

    LogisticRegressionOutcome(final Integer value) {
        this.value = value != 0;
    }

    public Boolean getValue() {
        return this.value;
    }

    public Integer getValueAsInt() {
        return this.value ? 1 : 0;
    }

    @Override()
    public String toString() {
        return "{\"value\": " + this.getValueAsInt().toString() + "}";
    }
}