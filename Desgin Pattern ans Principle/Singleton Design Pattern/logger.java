public class logger {    //singleton class
    private static logger instance;   //static obj or instance

    private logger(){  //constructor now no one can create its obj

    }

    public static logger getInstance(){   //return obj
        if(instance==null){
            instance=new logger();
        }
        return instance;
    }

    
    
}
