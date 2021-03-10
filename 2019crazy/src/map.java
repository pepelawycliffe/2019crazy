public class map {
    public static void main(String[] args) throws Exception {
        String obfs="TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq TNn*RPn/QPbEWS_JSWQAIJO^NBELPeHBFHT}TnALVlBLOFAkHFOuFETpHCStHAUFAgcEAelclcn^r^r\\tZvYxXyT|S~Pn SPm SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";
        int x = 10, y = 0, z = 10;
        x = obfs.charAt(y);
        while (x != 0)
        {
            if (y < 170)
            {
                x = obfs.charAt(y);
                y++;
                while(x > 64)
                {
                    x--;
                    if(++z == 'Z')
                    {
                        z /= 9;
                        System.out.print((char)(z));
                    }
                    else
                        System.out.print((char)(33 ^ (y & 0x01)));
                }
            }
            else
                break;
        }
        System.out.println("\n");
    }
}
