package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }


    //Wszystko działa
    private static class FIFORhymer extends DefaultCountingOutRhymer {

        private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

        @Override
        public int countOut() {
            while (!callCheck())

                temp.countIn(super.countOut());

            int ret = temp.countOut();

            while (!temp.callCheck())

                countIn(temp.countOut());

            return ret;
        }
    }

}
