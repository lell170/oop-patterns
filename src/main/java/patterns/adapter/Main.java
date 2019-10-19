package patterns.adapter;

import patterns.adapter.adapters.ScrewCapToCorkAdapter;
import patterns.adapter.screwcapbottle.Bottleneck;
import patterns.adapter.screwcapbottle.ScrewCap;
import patterns.adapter.cork.Cork;


public class Main {

    public static void main(final String[] args) {
        // First test: everything is ok. Screw cap compatible with bottleneck
        final Bottleneck bottleneck = new Bottleneck(5);
        final ScrewCap screwCap = new ScrewCap(5);

        if (bottleneck.compatibleWith(screwCap)) {
            System.out.println(bottleneck + " is compatible with screw cap");
        }

        final Cork smallCork = new Cork(5);
        final Cork largeCork = new Cork(20);
        // bottleneck.compatibleWith(smallCork); // compile error

        // Adapter solution
        final ScrewCapToCorkAdapter adapterForSmallCork = new ScrewCapToCorkAdapter(smallCork);
        final ScrewCapToCorkAdapter adapterForLargeCork = new ScrewCapToCorkAdapter(largeCork);

        if (bottleneck.compatibleWith(adapterForSmallCork)) {
            System.out.println(bottleneck + " is compatible with small cork");
        }

        if (!bottleneck.compatibleWith(adapterForLargeCork)) {
            System.out.println(bottleneck + " is not compatible with large cork");
        }
    }
}