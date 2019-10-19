package patterns.adapter.adapters;

import patterns.adapter.screwcapbottle.ScrewCap;
import patterns.adapter.cork.Cork;

public class ScrewCapToCorkAdapter extends ScrewCap {

    private final Cork cork;

    public ScrewCapToCorkAdapter(final Cork cork) {
        this.cork = cork;
    }

    @Override
    public double getRadius() {
        // adapter logic...
        return cork.getRadius()+1;
    }
}