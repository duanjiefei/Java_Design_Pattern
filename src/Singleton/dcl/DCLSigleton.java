package Singleton.dcl;

public class DCLSigleton {

    private static DCLSigleton dclSigleton = null;
    private DCLSigleton(){
        System.out.println("do sth");
    }

    public static DCLSigleton getInstance(){
        if (dclSigleton == null){
            synchronized (DCLSigleton.class){
                dclSigleton = new DCLSigleton();
            }
        }
        return dclSigleton;
    }
}


