public class signClss {
    private static  SignState = null;
    private signClss(){
    }
    public static SignState getSign(){
        if (SignState==null){
          synchronized(signClss.class){
            if (SignState==null){
                SignState = new SignState();
             }
            }
        }
    }

}