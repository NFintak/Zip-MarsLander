public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (status.getAltitude() <= 5900 && status.getAltitude() > 550 && status.getVelocity() > 100) {
            burn = 200;
        } else if (status.getAltitude() < 550 && status.getVelocity() > 150) {
            burn = 200;
        } else if (status.getAltitude() <= 100 && status.getVelocity() > 3) {
            burn = 198;
        } else {
            burn = 100;
        }


        System.out.println(burn); /*hack!*/
        return burn;
    }
}
