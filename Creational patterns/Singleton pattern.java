// Classical Java implementation of singleton  
// design pattern 
class Singleton 
{ 
    private static Singleton obj; 
  
    // private constructor to force use of 
    // getInstance() to create Singleton object 
    private Singleton() {} 
  
    public static Singleton getInstance() 
    { 
        if (obj==null) 
            obj = new Singleton(); 
        return obj; 
    } 
} 

// This is not thread safe can create two singleton obj by two thread

// Thread Synchronized Java implementation of  
// singleton design pattern 
class Singleton 
{ 
    private static Singleton obj; 
  
    private Singleton() {} 
  
    // Only one thread can execute this at a time 
    public static synchronized Singleton getInstance() 
    { 
        if (obj==null) 
            obj = new Singleton(); 
        return obj; 
    } 

// Static initializer based Java implementation of 
// singleton design pattern 
class Singleton 
{ 
    private static Singleton obj = new Singleton(); 
  
    private Singleton() {} 
  
    public static Singleton getInstance() 
    { 
        return obj; 
    } 
} 
// Double Checked Locking based Java implementation of 
// singleton design pattern 
class Singleton 
{ 
    private volatile static Singleton obj; 
  
    private Singleton() {} 
  
    public static Singleton getInstance() 
    { 
        if (obj == null) 
        { 
            // To make thread safe 
            synchronized (Singleton.class) 
            { 
                // check again as multiple threads 
                // can reach above step 
                if (obj==null) 
                    obj = new Singleton(); 
            } 
        } 
        return obj; 
    } 
} 