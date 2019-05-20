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


//boryer zhang
public class Singleton(){
	private Singleton singleton;
	private Singleton(){};
	public Singleton getSingleton(){
		if(singleton==null){
			synchronized(Singleton.class){
				if(singleton==null){
					singleton = new Singleton£¨£©£»
				}
			}
		}
		return singleton;
	}
}