
package patronFactory;

import ico.fes.is.amazon.Celular;
import ico.fes.is.factory.Celulares;
import ico.fes.is.factory.CelularesFactory;

public class PatronFactory {
    
    public static void main(String[] args) {
        Celulares celular0= CelularesFactory.createCelular(Celulares.HUAWEIP30PRO);
        System.out.println((Celular)celular0);
        System.out.println(" "); 
        Celulares celular1= CelularesFactory.createCelular(Celulares.HUAWEP30LITE);
        System.out.println((Celular)celular1);
        System.out.println(" ");
        Celulares celular2= CelularesFactory.createCelular(Celulares.IPHONE11PROMAX);
        System.out.println((Celular)celular2);
        System.out.println(" ");
        Celulares celular3= CelularesFactory.createCelular(Celulares.IPHONEX);
        System.out.println((Celular)celular3);
        System.out.println(" ");
        Celulares celular4= CelularesFactory.createCelular(Celulares.SAMSUNGGALAXYA50);
        System.out.println((Celular)celular4);
    }
    
}
