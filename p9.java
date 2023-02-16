import java.util.*;
abstract class SIP {
int p=1000,t=10,r;float i;
abstract void getrateofinterest();
void calculateinterest() {
i=(p*t*r)/100;
}
}

class Reliance extends SIP {
Scanner s=new Scanner(System.in);
public void getrateofinterest() {
System.out.println("Enter reliance ROI");
r=s.nextInt();
}
}

class TataAIG extends SIP {
Scanner s=new Scanner(System.in);
public void getrateofinterest() {
System.out.println("Enter TataAIG ROI");
r=s.nextInt();
}
}

class Ongc extends SIP {
Scanner s=new Scanner(System.in);
public void getrateofinterest() {
System.out.println("Enter Ongc ROI");
r=s.nextInt();
}
}

class p9 {
public static void main(String args[]) {
Reliance a=new Reliance();
TataAIG b=new TataAIG();
Ongc c=new Ongc();
a.getrateofinterest();
a.calculateinterest();
b.getrateofinterest();
b.calculateinterest();
c.getrateofinterest();
c.calculateinterest();
}
}