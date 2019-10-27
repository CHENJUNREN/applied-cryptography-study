package asymmetric;

import java.math.BigInteger;

public class Check {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("5821954209469468708556955823124668866370820841172017782472302826804534806046587723361499428070773332662385353206640649614056443726656308712367305802549401");
        BigInteger e = new BigInteger("101");
        BigInteger d = new BigInteger("5014950655681621560836189669424219716576845675068965812624656890415787407188512559851462478008743420251923504094726740718920278048084235933182412985720249");
        BigInteger ct = new BigInteger("4146369474072554512360713512145232013613682737433858868506808750417308886809529340483598816007212601061945926154325036190462420028767032187852917515409667");

        BigInteger m = ct.modPow(d, n);
        String message = new String(m.toByteArray());
        System.out.println(message + "<");
    }
}
