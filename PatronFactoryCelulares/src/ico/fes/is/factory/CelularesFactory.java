

//Implementación de los switch's
package ico.fes.is.factory;
import ico.fes.is.amazon.Celular;

public class CelularesFactory implements Celulares{
public static Celulares createCelular(int tipo){
    switch (tipo) {
        case Celulares.HUAWEP30LITE:
            return new Celular("Huawei P30 Lite",6.5, "Android 9 Pie, EMUI 9.0", "Kirin 710, 8 nucleos, 2.2Ghz", 128, "3 lentes 24MP", "1 lente 32 MP", 4, 3340);
        case Celulares.HUAWEIP30PRO:
            return new Celular("Huawei P30 PRO",6.7, "Android 9 Pie, EMUI 9.0", "Kirin 980, 8 nucleos, 2.6Ghz", 256, "4 lentes 40MP", "1 lente 32 MP", 8, 4200);
        case Celulares.IPHONE11PROMAX:
            return new Celular("Iphone 11 Pro Max",5.8, "iOS 13", "Hexa-core 2.39 Ghz", 256, "2 lentes 12MP", "1 lente 7MP", 3, 2716);
        case Celulares.IPHONEX:
            return new Celular("Iphone X",6.5, "iOS 13", "Apple A13 Bionic, 6 nucleos", 512, "4 lentes 12MP", "1 lente 12MP", 8, 3179);
        case Celulares.SAMSUNGGALAXYA50:
            return new Celular("Samsung Galaxy A50",6.4, "Android 9.0", "Cortex-A72, 4 nucleos, 2.35Ghz", 512, "3 lentes 25MP y 8MP", "1 lente 25MP", 4, 4000);
        default:
            throw new AssertionError();
    }
}

}
