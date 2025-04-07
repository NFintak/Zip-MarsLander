public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (status.getAltitude() <= 5500 && status.getAltitude() > 550) {
            burn = 200;
        } else if (status.getAltitude() < 550 && status.getVelocity() > 150) {
            burn = 200;
        } else if (status.getAltitude() <= 150 && status.getAltitude() >= 50) {
            burn = (status.getVelocity() / 2) + 100;
        } else if (status.getAltitude() <= 50 && status.getAltitude() >= 25) {
            burn = 120;
        } else if (status.getAltitude() < 10 && status.getVelocity() >= 5) {
            burn = 103;
        } else {
            burn = 100;
        }


        System.out.println(burn); /*hack!*/
        return burn;

        //similar to jumper?
        //altitude / velocity + altitude % velocity = burn?
        //altitude / velocity?
        //altitude % velocity?
        //check the dataStream in tests, try to figure out the pattern with that
    }
}
