package asymmetric;

import java.math.BigInteger;

public class A_3 {
    public static void main(String[] args) {
        BigInteger phi = new BigInteger("8584037913642434144111279062847405921823163865842701785008602377400681495147541519557274092429073976252689387304835782258785521935078205581766754116919200");
        BigInteger q = new BigInteger("87020952829623092932322362936864583897972618059974315662422560067745889600571");
        BigInteger e = new BigInteger("65537");
        BigInteger c = new BigInteger("1817487313698347891034157970684926175211834109573277793102901854482611726141560963120214926234448852417078321539316776648109260519063106558303669880226359");

        // p = phi / (q-1) + 1
        BigInteger p = phi.divide(q.subtract(BigInteger.ONE)).add(BigInteger.ONE);
        // n = pq
        BigInteger n = p.multiply(q);
        // d = e^-1 mod phi
        BigInteger d = e.modInverse(phi);
        // m = c^d mod n
        BigInteger m = c.modPow(d, n);
        String message = new String(m.toByteArray());
        System.out.println(message + "<");
    }
}