public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        //int burn = ((status.Altitude / status.Velocity * 100) + 100);
        
        System.out.println(burn); /*hack!*/
        return burn;

        //similar to jumper?
        //altitude / velocity + altitude % velocity = burn?
        //altitude / velocity?
        //altitude % velocity?
        //check the dataStream in tests, try to figure out the pattern with that
    }

}
